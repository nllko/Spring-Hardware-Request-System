package com.hrs.hardwarerequestsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.hrs.hardwarerequestsystem.models.Request;
import com.hrs.hardwarerequestsystem.repository.RequestRepository;
import com.hrs.hardwarerequestsystem.service.RequestService;
import java.util.Optional;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class HardwareRequestSystemApplicationTests {

  @Autowired
  private RequestService requestService;

  @MockBean
  private RequestRepository requestRepository;

  @Test
  public void getRequestsTest() {
    Request request = new Request();
    request.setName("New pc");
    request.setType("PC");
    request.setParameters("Test value");
    request.setDescription("Test description");

    Request request2 = new Request();
    request2.setName("New laptop");
    request2.setType("Laptop");
    request2.setParameters("Test value");
    request2.setDescription("Test description");

    when(requestRepository.findAll()).thenReturn(Stream.of(request,request2).toList());

    assertEquals(2, requestService.getAllRequests().size());
  }

  @Test
  public void saveRequestTest() {
    Request request = new Request();
    request.setName("New pc");
    request.setType("PC");
    request.setParameters("Test value");
    request.setDescription("Test description");

    when(requestRepository.save(request)).thenReturn(request);

    assertEquals(request,requestService.addRequest(request));
  }

  @Test
  public void deleteRequestTest() {
    Request request = new Request();
    request.setName("New pc");
    request.setType("PC");
    request.setParameters("Test value");
    request.setDescription("Test description");

    requestRepository.save(request);
    requestService.deleteById(1);

    verify(requestRepository,times(1)).deleteById(1);
  }

  @Test
  public void getRequestById() {
    Request request = new Request();
    request.setName("New pc");
    request.setType("PC");
    request.setParameters("Test value");
    request.setDescription("Test description");

    when(requestRepository.findById(1)).thenReturn(Optional.of(request));

    assertEquals(request,requestService.getRequestById(1));
  }

  @Test
  public void updateRequest() {
    Request request = new Request();
    request.setName("New pc");
    request.setType("PC");
    request.setParameters("Test value");
    request.setDescription("Test description");

    requestRepository.save(request);
    request.setStatus("Approved");
    when(requestRepository.save(request)).thenReturn(request);

    assertEquals("Approved",requestService.updateRequest(request).getStatus());
  }
}
