package org.example;

import org.example.builder.SoccerTeamBuilder;
import org.example.domain.models.Coach;
import org.example.domain.models.Player;
import org.example.domain.models.SoccerTeam;

public class Main {
  public static void main(String[] args) {
    SoccerTeam soccerTeam = new SoccerTeamBuilder().setName("Real Madrid")
      .setCity("Madrid")
      .setStadium("Santiago Bernabeu")
      .setFoundationYear(1902)
      .setCoach(new Coach("Carlo Ancelotti", 61))
      .setPlayers(new Player("Vinicius Jr", 20))
      .setPlayers(new Player("Jude Bellingham", 18))
      .build();

    System.out.println(soccerTeam.toString());
  }
}