package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides static methods to map structured string data
 * into objects of type Football and Weather. These methods are designed to parse and convert
 * data where each List<String> represents a line or record from a file.
 */
public class FileToObjectMapper {
    /**
     * Converts a list of lists of strings into a list of Football objects.
     * Each inner list of strings represents a single record of football data,
     * and this method maps them to Football object fields.
     * @param footballString A list of lists of strings, where each inner list represents football data.
     * @return An ArrayList of Football objects, populated with data from the input list.
     */
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

    /**
     * Converts a list of lists of strings into a list of Weather objects.
     * Each inner list of strings represents a single record of weather data,
     * and this method maps them to Weather object fields.
     * @param weatherString A list of lists of strings, where each inner list represents weather data.
     * @return An ArrayList of Weather objects, populated with data from the input list.
     */
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