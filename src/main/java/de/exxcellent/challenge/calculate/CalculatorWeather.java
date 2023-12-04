package de.exxcellent.challenge.calculate;

import de.exxcellent.challenge.model.Weather;

import java.util.ArrayList;

/**
 * This class is specifically designed to process a list of Weather objects and identify the day
 * with the minimum difference between the maximum and minimum temperatures.
 */
public class CalculatorWeather implements Calculator<String, Weather>{
    /**
     * This method iterates through the list of Weather objects, calculates the temperature difference
     * for each day, and identifies the day with the smallest temperature spread.
     * @param weathers An ArrayList of Weather objects to be processed.
     * @return The day as a String representing the day with the smallest temperature spread.
     *         Returns "---" if no valid day is found or if the input list is empty.
     */
    @Override
    public String calculate(ArrayList<Weather> weathers) {
        String resultDay = "-1";
        int minimumTempDiff = Integer.MAX_VALUE;
        for (Weather weather : weathers) {
            int diff = calculateTemperatureDiff(weather);
            if (diff < minimumTempDiff) {
                minimumTempDiff = diff;
                resultDay = weather.getDay();
            }
        }

        if (resultDay.equals("-1")) return "---";
        return resultDay;
    }
    /**
     * This method calculates the difference between the maximum and minimum temperatures
     * recorded for a given day.
     * @param weather The Weather object for which the temperature difference is to be calculated.
     * @return An integer representing the temperature difference.
     */
    private int calculateTemperatureDiff(Weather weather){
        return weather.getMxt() - weather.getMnt();
    }
}
