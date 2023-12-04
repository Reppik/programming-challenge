package de.exxcellent.challenge.reader;

import java.util.ArrayList;

/**
 * The JSONReader class is an implementation of the Reader interface for reading JSON files.
 * This class focuses on reading data from JSON files and converting it into a list of objects
 * of a specified type.
 */
public class JSONReader implements Reader {
    /**
     * NOT IMPLEMENTED YET
     * Reads data from a JSON file located at the specified file path and converts it into a list of objects
     * of the specified type. The method is designed to handle different types of data objects depending
     * on the provided class type.
     * @param filePath The path to the file to be read. It should be a valid file path.
     * @param type The type of the objects into which the read data should be converted.
     *             This class parameter helps to ensure type safety.
     * @return An ArrayList containing objects of the specified type. The implementation of converting JSON
     *         data to objects of a specific type needs to be completed based on the requirements.
     *         Currently, returns an empty list.
     * @throws IllegalArgumentException if the file path is invalid or if there are issues reading the file.
     */
    @Override
    public ArrayList<?> read(String filePath,  Class<?> type) {
        return new ArrayList<>();
    }
}
