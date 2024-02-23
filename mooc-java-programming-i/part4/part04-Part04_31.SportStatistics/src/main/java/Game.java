/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emiha
 */
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {

        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {

        return this.homeTeam;
    }

    public String getVisitingTeam() {

        return this.visitingTeam;
    }

    public boolean winnerIs(String team) {
        if (team.equals(homeTeam) && homeTeamPoints > visitingTeamPoints) {
            return true;
        }
 
        if (team.equals(visitingTeam) && visitingTeamPoints > homeTeamPoints) {
            return true;
        }
 
        return false;
    }
}
