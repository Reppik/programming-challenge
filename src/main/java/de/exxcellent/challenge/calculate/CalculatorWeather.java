package de.exxcellent.challenge.calculate;

import de.exxcellent.challenge.model.Weather;

import java.util.ArrayList;

public class CalculatorWeather implements Calculator<String, Weather>{
    @Override
    public String calculate(ArrayList<Weather> weathers) throws IllegalArgumentException {
        String resultDay = "-1";
        int minimumTempDiff = Integer.MAX_VALUE;
        for(int entry = 0; entry < weathers.size(); entry++){
            int diff = calculateTemperaturDiff(weathers.get(entry));
            if(diff < minimumTempDiff) {
                minimumTempDiff = diff;
                resultDay = weathers.get(entry).getDay();
            }
        }

        if (resultDay.equals("-1")) throw new IllegalArgumentException("Weather List Data invalid");
        return resultDay;
    }

    private int calculateTemperaturDiff(Weather weather){
        return weather.getMxt() - weather.getMnt();
    }
}
