package org.example.domain.models;

import java.util.List;

public class SoccerTeam {
  private String name;
  private String city;
  private String stadium;
  private int foundationYear;
  private List<Player> players;
  private Coach coach;

  public SoccerTeam(String name, String city, String stadium, int foundationYear, List<Player> players, Coach coach) {
    this.name = name;
    this.city = city;
    this.stadium = stadium;
    this.foundationYear = foundationYear;
    this.players = players;
    this.coach = coach;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStadium(String stadium) {
    this.stadium = stadium;
  }

  public void setFoundationYear(int foundationYear) {
    this.foundationYear = foundationYear;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public Coach getCoach() {
    return coach;
  }

  public void setCoach(Coach coach) {
    this.coach = coach;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String getStadium() {
    return stadium;
  }

  public int getFoundationYear() {
    return foundationYear;
  }

  @Override
  public String toString() {
    return "SoccerTeam{" +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            ", stadium='" + stadium + '\'' +
            ", foundationYear=" + foundationYear +
            ", players=" + players.size() +
            ", coach=" + coach.getName() +
            '}';
  }
}
