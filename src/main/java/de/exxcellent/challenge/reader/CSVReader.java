package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader implements Reader {

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
