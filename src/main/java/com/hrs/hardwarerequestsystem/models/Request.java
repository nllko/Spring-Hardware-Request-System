package com.hrs.hardwarerequestsystem.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Request {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "request_id_sequence")
  @Column(name = "ID")
  private int id;

  @Column(name = "NAME")
  @NotEmpty(message = "The name should not be empty")
  @Size(min = 2, max = 30,message = "The name should be between 2 and 30 characters")
  private String name;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "PARAMETERS")
  @NotEmpty(message = "Parameters fields should not be empty")
  @Size(min = 1, max = 100,message = "The parameters should be between 1 and 100 characters")
  private String parameters;

  @Column(name = "DESCRIPTION")
  @NotEmpty(message = "Description field should not be empty")
  @Size(min = 1, max = 100,message = "The description should be between 1 and 100 characters")
  private String description;

  @Column(name = "CREATED_AT")
  private LocalDateTime createdAt;

  @Column(name = "STATUS")
  private String status;


  public Request() {
    this.createdAt = LocalDateTime.now();
    this.status = "Pending";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
