package com.hrs.hardwarerequestsystem.controller;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.service.RequestService;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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


}
