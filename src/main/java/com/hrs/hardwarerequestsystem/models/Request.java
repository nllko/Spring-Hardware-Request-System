package com.hrs.hardwarerequestsystem.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Request {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "request_id_sequence")
  @Column(name = "ID")
  private int id;

  @Column(name = "NAME")
  @NotEmpty(message = "The name should not be empty")
  @Size(min = 2, max = 30, message = "The name should be between 2 and 30 characters")
  private String name;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "PARAMETERS")
  @NotEmpty(message = "Parameters fields should not be empty")
  @Size(min = 1, max = 100, message = "The parameters should be between 1 and 100 characters")
  private String parameters;

  @Column(name = "DESCRIPTION")
  @NotEmpty(message = "Description field should not be empty")
  @Size(min = 1, max = 100, message = "The description should be between 1 and 100 characters")
  private String description;

  @Column(name = "CREATED_AT")
  private LocalDateTime createdAt;

  @Column(name = "STATUS")
  private String status;


  public Request() {
    this.createdAt = LocalDateTime.now();
    this.status = "Pending";
  }
}
