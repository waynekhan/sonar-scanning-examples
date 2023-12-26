package com.acme.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    String foo = "Hello World!";
    String bar = new HelloWorld().sayHello();

    assertEquals(foo, bar);
  }

  @Test
  public void nowCovered() {
    String foo = "This method is now covered by unit tests";
    String bar = new HelloWorld().nowCovered();

    assertEquals(foo, bar);
  }

}
