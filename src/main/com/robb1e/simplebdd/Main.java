package com.robb1e.simplebdd;

public class Main extends SimpleBdd {

  public static void main(String[] args) throws Exception {
    new Main().given("anotherthing");
  }

  public void anotherthing(){
    System.out.println("another thing");
  }

}
