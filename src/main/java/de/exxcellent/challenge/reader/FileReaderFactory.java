package de.exxcellent.challenge.reader;

public class FileReaderFactory<K> {
    public Reader createReader(FileType type){
        return switch (type) {
            case CSV -> new CSVReader<K>();
            case JSON -> new JSONReader<K>();
        };
    }
}
