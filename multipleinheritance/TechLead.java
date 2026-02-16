package com.multipleinheritance;

public class TechLead implements Trainer , Developer{
  @Override
  public void teach() {
      System.out.println("Tech Lead is conducting a training session...");
  }

  @Override
  public void developProject() {
      System.out.println("Tech Lead is developing the project...");
  }
}
