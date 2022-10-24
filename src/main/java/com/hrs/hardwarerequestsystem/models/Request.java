package com.hrs.hardwarerequestsystem.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "request_id_sequence")
  @Column(name = "ID")
  private int id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "PARAMETERS")
  private String parameters;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "CREATED_AT")
  private LocalDateTime createdAt;

  @Column(name = "STATUS")
  private String status;

  public Request(String name, String type, String parameters, String description) {
    this.name = name;
    this.type = type;
    this.parameters = parameters;
    this.description = description;
  }

  public Request() {
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
