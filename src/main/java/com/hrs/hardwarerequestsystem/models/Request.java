package com.hrs.hardwarerequestsystem.models;

public class Request {

  private int id;
  private String name;
  private String type;
  private String parameters;
  private String description;

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
}
