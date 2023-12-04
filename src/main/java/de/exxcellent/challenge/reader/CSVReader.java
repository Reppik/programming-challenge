package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The CSVReader class is an implementation of the Reader interface for reading CSV files.
 * This implementation specifically focuses on reading data from CSV (Comma-Separated Values) files
 * and converting it into a list of objects of a specified type.
 */
public class CSVReader implements Reader {
    /**
     * Reads data from a CSV file located at the specified file path and converts it into a list of objects
     * of the specified type. This method is capable of handling different types of data objects depending
     * on the provided class type.
     * @param filePath The path to the CSV file to be read. It should be a valid file path.
     * @param type The type of the objects into which the read data should be converted. This class parameter
     *             helps to ensure type safety. Currently, this method supports converting CSV data into
     *             'Football' or 'Weather' objects.
     * @return An ArrayList containing objects of the specified type. If the type is 'Football', it returns a
     *         list of Football objects. If the type is 'Weather', it returns a list of Weather objects.
     *         Returns an empty list if the type does not match or if the file is empty.
     * @throws IllegalArgumentException if the file path is invalid, if there are issues reading the file, or
     *                                  if the data conversion fails due to format issues.
     */
    @Override
    public ArrayList<?> read(String filePath, Class<?> type) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }

        if(type == Football.class) {
            return FileToObjectMapper.mapStringToFootball(records);
        }
        if(type == Weather.class) {
            return FileToObjectMapper.mapStringToWeather(records);
        }
        return new ArrayList<>();
    }

}
