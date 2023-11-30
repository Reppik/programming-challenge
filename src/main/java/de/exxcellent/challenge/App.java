package de.exxcellent.challenge;

import de.exxcellent.challenge.calculate.CalculatorFootball;
import de.exxcellent.challenge.calculate.CalculatorWeather;
import de.exxcellent.challenge.model.ChallengeConstants;
import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.reader.CSVReader;
import de.exxcellent.challenge.reader.FileReaderFactory;
import de.exxcellent.challenge.reader.FileType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        FileReaderFactory factory = new FileReaderFactory();
        CSVReader csvReader = (CSVReader) factory.createReader(FileType.CSV);
        ArrayList<Weather> weatherList = new ArrayList<>();
        ArrayList<Football> footballList = new ArrayList<>();

        if (args.length > 0) {
            if (args[0].equals("--football")) {
                footballList = (ArrayList<Football>) csvReader.read(ChallengeConstants.PATH + args[1], Football.class);
            } else if (args[0].equals("--weather")) {
                weatherList = (ArrayList<Weather>) csvReader.read(ChallengeConstants.PATH + args[1], Weather.class);
            }
            if (args[0].equals("--all")) {
                weatherList = (ArrayList<Weather>) csvReader.read(ChallengeConstants.PATH + args[1], Weather.class);
                footballList = (ArrayList<Football>) csvReader.read(ChallengeConstants.PATH + args[2], Football.class);
            }
        } else {
            weatherList = (ArrayList<Weather>) csvReader.read(ChallengeConstants.PATH + "weather.csv", Weather.class);
            footballList = (ArrayList<Football>) csvReader.read(ChallengeConstants.PATH + "football.csv", Football.class);
        }

        CalculatorWeather calculatorWeather = new CalculatorWeather();
        CalculatorFootball calculatorFootball = new CalculatorFootball();


        String dayWithSmallestTempSpread = calculatorWeather.calculate(weatherList);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = calculatorFootball.calculate(footballList); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);


    }
}
