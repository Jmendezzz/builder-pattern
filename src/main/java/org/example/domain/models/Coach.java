package org.example.domain.models;

public class Coach extends Person{
  private int experience;
  public Coach(String name, int age) {
    super(name, age);
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }
}
