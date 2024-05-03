package org.example.domain.models;

public class Player extends Person{
  private String position;
  public Player(String name, int age) {
    super(name, age);
  }

  public Player(String name, int age, String position) {
    super(name, age);
    this.position = position;
  }
}
