package com.hrs.hardwarerequestsystem.controller;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.service.RequestService;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestController {

  private final RequestService requestService;

  public RequestController(RequestService requestService) {
    this.requestService = requestService;
  }

  @PostMapping("/requests")
  public String addRequest(@ModelAttribute("request") Request request) {
    request.setCreatedAt(LocalDateTime.now());
    request.setStatus("Pending");
    requestService.addRequest(request);
    return "redirect:/requests";
  }

  @GetMapping("/requests")
  public String listRequests(Model model) {
    model.addAttribute("requests",requestService.getAllRequests());
    return "requests";
  }

  @GetMapping("/requests/new")
  public String createRequestForm(Model model) {
    Request request = new Request();
    model.addAttribute("request",request);
    return "create_request";
  }

  @GetMapping("/requests/edit/{id}")
  public String viewRequestForm(@PathVariable Integer id, Model model) {
    model.addAttribute("request",requestService.getRequestById(id));
    return "view_request";
  }

  @PostMapping("/requests/{id}")
  public String updateRequest(@PathVariable Integer id, @ModelAttribute("request") Request request, Model model) {
    Request existingRequest = requestService.getRequestById(id);
    existingRequest.setStatus(request.getStatus());
    requestService.updateRequest(existingRequest);
    return "redirect:/requests";
  }

  @GetMapping("/requests/{id}")
  public String deleteRequest(@PathVariable Integer id) {
    requestService.deleteById(id);
    return "redirect:/requests";
  }

}
