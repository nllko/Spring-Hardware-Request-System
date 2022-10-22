package com.hrs.hardwarerequestsystem.controller;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.service.RequestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RequestController {

  private final RequestService requestService;

  public RequestController(RequestService requestService) {
    this.requestService = requestService;
  }

  @PostMapping("/request")
  public void addRequest() {
    Request request = new Request(0,"Computer for Alex","Computer","Geforce 1060","Give him a cool pc :)");
    requestService.addRequest(request);
  }

  @GetMapping("/requests")
  public String listRequests(Model model) {
    model.addAttribute("requests",requestService.getAllRequests());
    return "requests";
  }


}