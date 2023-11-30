package de.exxcellent.challenge.reader;

public class FileReaderFactory {
    public Reader createReader(FileType type){
        return switch (type) {
            case CSV -> new CSVReader();
            case JSON -> new JSONReader();
        };
    }
}
