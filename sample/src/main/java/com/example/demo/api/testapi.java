package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testapi {
  @RequestMapping(value = "/testapi",method = RequestMethod.GET)
  public String hello(){
    return  "hello Spring boot";
  }
}
