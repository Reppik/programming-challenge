package de.exxcellent.challenge.model;

import java.util.Objects;

public class Football {
    String team;
    int games;
    int wins;
    int losses;
    int draws;
    int goals;
    int goalsAllowed;
    int points;

    public Football(String team, int games, int wins, int losses, int draws, int goals, int goalsAllowed, int points) {
        this.team = team;
        this.games = games;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.points = points;
    }

    public Football() {}

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Football football = (Football) o;
        return games == football.games && wins == football.wins && losses == football.losses && draws == football.draws && goals == football.goals && goalsAllowed == football.goalsAllowed && points == football.points && Objects.equals(team, football.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, games, wins, losses, draws, goals, goalsAllowed, points);
    }

    @Override
    public String toString() {
        return "Football{" +
                "team='" + team + '\'' +
                ", games=" + games +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goals=" + goals +
                ", goalsAllowed=" + goalsAllowed +
                ", points=" + points +
                '}';
    }
}
