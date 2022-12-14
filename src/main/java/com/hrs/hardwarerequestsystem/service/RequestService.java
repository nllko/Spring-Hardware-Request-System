package com.hrs.hardwarerequestsystem.service;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.repository.RequestRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RequestService {

  private final RequestRepository requestRepository;

  public Request addRequest(Request request) {
    return requestRepository.save(request);
  }

  public List<Request> getAllRequests() {
    return requestRepository.findAll();
  }

  public Request getRequestById(Integer id) {
    return requestRepository.findById(id).get();
  }

  public Request updateRequest(Request request) {
   return requestRepository.save(request);
  }

  public void deleteById(Integer id) {
    requestRepository.deleteById(id);
  }

}
