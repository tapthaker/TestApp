package com.example.network;


import com.example.commons.TestPojo;

public class NetworkPojo {
  private String namePojo;

  public NetworkPojo(String namePojo) {
    this.namePojo = namePojo;
    new TestPojo(namePojo);
  }
}
