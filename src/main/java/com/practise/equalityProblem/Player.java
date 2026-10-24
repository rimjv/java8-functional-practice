
package com.practise.equalityProblem;

import java.util.Objects;

public class Player {
  private String name;
  private int jerseyNumber;

  public Player(String name, int jerseyNumber) {
    this.name = name;
    this.jerseyNumber = jerseyNumber;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }

    if (other == null || getClass() != other.getClass()) {
      return false;
    }

    Player player = (Player) other;

    return jerseyNumber == player.jerseyNumber
            && Objects.equals(name, player.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, jerseyNumber);
  }
}
