package com.hrs.hardwarerequestsystem.controller;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.service.RequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

  private final RequestService requestService;

  public RequestController(RequestService requestService) {
    this.requestService = requestService;
  }

  @PutMapping("/request")
  public Request addRequest() {
    Request request = new Request(0,"Computer for Alex","Computer","Geforce 1060","Give him a cool pc :)");
    requestService.addRequest(request);
    return request;
  }


}
