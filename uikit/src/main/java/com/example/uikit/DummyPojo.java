package com.example.uikit;


import com.example.commons.TestPojo;

public class DummyPojo {

  private String name;

  public DummyPojo(String name) {
    this.name = name;
    new TestPojo(9);
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
