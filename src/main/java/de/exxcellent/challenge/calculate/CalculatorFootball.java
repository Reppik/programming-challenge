package de.exxcellent.challenge.calculate;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.util.ArrayList;

public class CalculatorFootball implements Calculator<String,Football>{
    @Override
    public String calculate(ArrayList<Football> football) {
        String footballClub = "-1";
        int minimumGoalsDiff = Integer.MAX_VALUE;
        for(int entry = 0; entry < football.size(); entry++){
            int diff = calculateGoalsDiff(football.get(entry));
            if(diff < minimumGoalsDiff) {
                minimumGoalsDiff = diff;
                footballClub = football.get(entry).getTeam();
            }
        }

        if (footballClub.equals("-1")) return "---";
        return footballClub;
    }

    private int calculateGoalsDiff(Football football){
        return Math.abs(football.getGoals() - football.getGoalsAllowed());
    }
}
