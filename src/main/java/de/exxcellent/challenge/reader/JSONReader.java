package de.exxcellent.challenge.reader;

import java.util.ArrayList;

public class JSONReader<K> implements Reader<ArrayList<K>>{

    @Override
    public ArrayList<K> read(String filePath,  Class<?> type) {
        System.out.println(filePath);
        return new ArrayList<>();
    }
}
