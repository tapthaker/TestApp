package com.example.network;


import com.example.commons.TestPojo;

import java.util.ArrayList;

public class NetworkPojo {
  private String namePojo;

  public NetworkPojo(String namePojo) {
    this.namePojo = namePojo;
    TestPojo pojo = new TestPojo(new ArrayList<String>());
  }
}
