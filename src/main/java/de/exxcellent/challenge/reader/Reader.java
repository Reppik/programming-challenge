package de.exxcellent.challenge.reader;

public interface Reader<T> {
    T read(String filePath, Class<?> type);
}
