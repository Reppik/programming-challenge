package de.exxcellent.challenge.reader;

import java.util.ArrayList;

/**
 * This interface can be implemented for different types of files and data types,
 * depending on the specific implementation of the read method
 */
public interface Reader {
    /**
     * Reads data from the specified file and converts it into a list of objects of the given type.
     * @param filePath The path to the file to be read. It should be a valid file path.
     * @param type The type of the objects into which the read data should be converted.
     *             This class parameter helps to ensure type safety.
     * @return An ArrayList containing objects of the specified type. The exact nature of these objects
     *         and their quantity depends on the content of the file and the implementation of the method.
     */
    ArrayList<?> read(String filePath, Class<?> type);
}
