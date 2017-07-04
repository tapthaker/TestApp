package com.example.uikit;


public class DummyPojo {

  private String name;

  public DummyPojo(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "DummyPojo{" +
        "name='" + name + '\'' +
        '}';
  }
}
