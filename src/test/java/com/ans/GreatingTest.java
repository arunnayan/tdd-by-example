package com.ans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

  private Greeting greet;

  @BeforeEach
  public void setUp(){
    greet =new Greeting();
  }
  @Test
  void helloWorld() {

    System.out.println(greet.helloWorld());
  }

  @Test
  void helloWorld1() {

    System.out.println(greet.helloWorld("test"));
  }

}