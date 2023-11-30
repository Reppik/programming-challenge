package de.exxcellent.challenge;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";
    private static FileReaderFactory factory;


    private final String path = "src/main/resources/de/exxcellent/challenge/";
    @BeforeAll
    static void setFactory(){
        factory = new FileReaderFactory();
    }
    @BeforeEach
    void setUp() {
        successLabel = "successful";
    }

    @Test
    void readWeather(){
        CSVReader<Weather> csvReader = (CSVReader<Weather>) factory.createReader(FileType.CSV);
        ArrayList<Weather> arrData = csvReader.read(path + "weather.csv", Weather.class);
        assertEquals(arrData.size(), 30);
        assertEquals(arrData.get(15).getDay(), "16");
        assertEquals(arrData.get(0).getMxt(), 88);
        assertEquals(arrData.get(29).getrAvSLP(), 1022.7);
    }

    @Test
    void readFootball(){
        CSVReader<Football> csvReader = (CSVReader<Football>) factory.createReader(FileType.CSV);
        ArrayList<Football> arrData = csvReader.read(path + "football.csv", Football.class);
        assertEquals(arrData.size(), 20);
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