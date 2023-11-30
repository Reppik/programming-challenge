package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.util.ArrayList;
import java.util.List;

public class FileToObjectMapper {
    public static ArrayList<Football> mapStringToFootball(List<List<String>> footballString){
        ArrayList<Football> result = new ArrayList<>();
        for(int entry = 1; entry < footballString.size(); entry++){
            List<String> singleEntry = footballString.get(entry);
            Football newObj = new Football();
            newObj.setTeam(singleEntry.get(0));
            newObj.setGames(Integer.parseInt(singleEntry.get(1)));
            newObj.setWins(Integer.parseInt(singleEntry.get(2)));
            newObj.setLosses(Integer.parseInt(singleEntry.get(3)));
            newObj.setDraws(Integer.parseInt(singleEntry.get(4)));
            newObj.setGoals(Integer.parseInt(singleEntry.get(5)));
            newObj.setGoalsAllowed(Integer.parseInt(singleEntry.get(6)));
            newObj.setPoints(Integer.parseInt(singleEntry.get(7)));

            result.add(newObj);
        }

        return result;
    }

    public static ArrayList<Weather> mapStringToWeather(List<List<String>> weatherString){
        ArrayList<Weather> result = new ArrayList<>();
        for(int entry = 1; entry < weatherString.size(); entry++){
            List<String> singleEntry = weatherString.get(entry);
            Weather newObj = new Weather();
            newObj.setDay(singleEntry.get(0));
            newObj.setMxt(Integer.parseInt(singleEntry.get(1)));
            newObj.setMnt(Integer.parseInt(singleEntry.get(2)));
            newObj.setAvt(Integer.parseInt(singleEntry.get(3)));
            newObj.setAvdp(Double.parseDouble(singleEntry.get(4)));
            newObj.setOneHrPTpcpn(Double.parseDouble(singleEntry.get(5)));
            newObj.setpDir(singleEntry.get(6));
            newObj.setAvSp(Double.parseDouble(singleEntry.get(7)));
            newObj.setDir(singleEntry.get(8));
            newObj.setMxS(Integer.parseInt(singleEntry.get(9)));
            newObj.setSkyC(Double.parseDouble(singleEntry.get(10)));
            newObj.setMxR(Double.parseDouble(singleEntry.get(11)));
            newObj.setMn(Double.parseDouble(singleEntry.get(12)));
            newObj.setrAvSLP(Double.parseDouble(singleEntry.get(13)));

            result.add(newObj);
        }
        return result;
    }
}