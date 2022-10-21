package com.hrs.hardwarerequestsystem.service;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.repository.RequestRepository;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

  private final RequestRepository requestRepository;

  public RequestService(RequestRepository requestRepository) {
    this.requestRepository = requestRepository;
  }

  public void addRequest(Request request) {
    requestRepository.addRequest(request);
  }
}
