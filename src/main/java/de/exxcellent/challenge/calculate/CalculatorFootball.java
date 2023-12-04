package de.exxcellent.challenge.calculate;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.util.ArrayList;

/**
 * This class is designed to process a list of Football objects and identify the club
 * with the smallest absolute difference between goals scored and goals allowed.
 */
public class CalculatorFootball implements Calculator<String,Football>{
    /**
     * This method iterates through the list of Football objects, calculates the goal difference
     * for each club, and identifies the club with the smallest difference.
     * @param football An ArrayList of Football objects to be processed.
     * @return The name of the football club as a String representing the club with the smallest goal difference.
     *         Returns "---" if no valid club is found or if the input list is empty.
     */
    @Override
    public String calculate(ArrayList<Football> football) {
        String footballClub = "-1";
        int minimumGoalsDiff = Integer.MAX_VALUE;
        for (Football value : football) {
            int diff = calculateGoalsDiff(value);
            if (diff < minimumGoalsDiff) {
                minimumGoalsDiff = diff;
                footballClub = value.getTeam();
            }
        }

        if (footballClub.equals("-1")) return "---";
        return footballClub;
    }

    /**
     * This method calculates the absolute difference between the number of goals scored and goals allowed
     * for a given football club.
     * @param football The Football object for which the goal difference is to be calculated.
     * @return An integer representing the absolute goal difference.
     */
    private int calculateGoalsDiff(Football football){
        return Math.abs(football.getGoals() - football.getGoalsAllowed());
    }
}
