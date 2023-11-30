package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader<K> implements Reader<ArrayList<K>>{

    @Override
    public ArrayList<K> read(String filePath, Class<?> type) {
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
            return (ArrayList<K>) FileToObjectMapper.mapStringToFootball(records);
        }
        if(type == Weather.class) {
            return (ArrayList<K>) FileToObjectMapper.mapStringToWeather(records);
        }
        return new ArrayList<>();
    }

}
