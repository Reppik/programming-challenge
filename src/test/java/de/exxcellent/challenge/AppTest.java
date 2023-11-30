package de.exxcellent.challenge;

import de.exxcellent.challenge.calculate.Calculator;
import de.exxcellent.challenge.calculate.CalculatorFootball;
import de.exxcellent.challenge.calculate.CalculatorWeather;
import de.exxcellent.challenge.model.ChallengeConstants;
import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.reader.CSVReader;
import de.exxcellent.challenge.reader.FileReaderFactory;
import de.exxcellent.challenge.reader.FileType;
import de.exxcellent.challenge.reader.Reader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";
    private static FileReaderFactory factory;
    private static ArrayList<Weather> weatherList;
    private static ArrayList<Football> footballList;




    private static final String path = "src/main/resources/de/exxcellent/challenge/";
    @BeforeAll
    static void init(){
        factory = new FileReaderFactory();
        CSVReader<Weather> weatherCSVReader = (CSVReader<Weather>) factory.createReader(FileType.CSV);
        weatherList = weatherCSVReader.read(ChallengeConstants.PATH + "weather.csv", Weather.class);

        CSVReader<Football> csvReader = (CSVReader<Football>) factory.createReader(FileType.CSV);
        footballList = csvReader.read(ChallengeConstants.PATH + "football.csv", Football.class);
    }

    @BeforeEach
    void setUp() {
        successLabel = "successful";
    }


    @Test
    void readWeather(){
        assertEquals(weatherList.size(), 30);
        assertEquals(weatherList.get(15).getDay(), "16");
        assertEquals(weatherList.get(0).getMxt(), 88);
        assertEquals(weatherList.get(29).getrAvSLP(), 1022.7);
    }

    @Test
    void calculateWeather(){
        CalculatorWeather calculator = new CalculatorWeather();
        assertEquals(calculator.calculate(weatherList), "14");
    }

    @Test
    void calculateEmptyWeatherList(){
        CalculatorWeather calculator = new CalculatorWeather();
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            calculator.calculate(new ArrayList<Weather>());
        });

        String expected = "Weather List Data invalid";
        assertTrue(ex.getMessage().contains(expected));
    }

    @Test
    void readFootball(){
        assertEquals(footballList.size(), 20);
    }
    @Test
    void calculateFootball(){
        CalculatorFootball calculator = new CalculatorFootball();
        assertEquals(calculator.calculate(footballList), "Aston_Villa");
    }

    @Test
    void calculateEmptyFootballList(){
        CalculatorFootball calculator = new CalculatorFootball();
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            calculator.calculate(new ArrayList<Football>());
        });

        String expected = "Football List Data invalid";
        assertTrue(ex.getMessage().contains(expected));
    }

    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    void runFootball() {
        App.main("--football", "football.csv");
    }

}