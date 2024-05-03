package org.example.builder;

import org.example.domain.models.Coach;
import org.example.domain.models.Player;
import org.example.domain.models.SoccerTeam;

import java.util.ArrayList;
import java.util.List;

public class SoccerTeamBuilder implements Builder<SoccerTeam>{
  private String name;
  private String city;
  private String stadium;
  private int foundationYear;
  private List<Player> players = new ArrayList<>();
  private Coach coach;

  public SoccerTeamBuilder setName(String name) {
    this.name = name;
    return this;
  }
  public SoccerTeamBuilder setCity(String city) {
    this.city = city;
    return this;
  }
  public SoccerTeamBuilder setStadium(String stadium) {
    this.stadium = stadium;
    return this;
  }
  public SoccerTeamBuilder setFoundationYear(int foundationYear) {
    this.foundationYear = foundationYear;
    return this;
  }
  public SoccerTeamBuilder setPlayers(Player players) {
    this.players.add(players);
    return this;
  }
  public SoccerTeamBuilder setPlayers(List<Player> players) {
    this.players = players;
    return this;
  }
  public SoccerTeamBuilder setCoach(Coach coach) {
    this.coach = coach;
    return this;
  }
  @Override
  public SoccerTeam build() {
    return new SoccerTeam(name, city, stadium, foundationYear, players, coach);
  }


}
