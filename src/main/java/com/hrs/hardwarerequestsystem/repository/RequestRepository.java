package com.hrs.hardwarerequestsystem.repository;

import com.hrs.hardwarerequestsystem.models.Request;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class RequestRepository {

  ArrayList<Request> requestsList = new ArrayList<>();

  public void addRequest(Request request) {
    requestsList.add(request);
  }

  public ArrayList<Request> getAllRequests() {
    return requestsList;
  }

}
