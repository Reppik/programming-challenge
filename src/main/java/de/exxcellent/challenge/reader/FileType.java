package de.exxcellent.challenge.reader;

/**
 * This enumeration is used to specify the type of file to be processed by Reader implementations,
 * such as CSVReader and JSONReader. It is utilized in the FileReaderFactory to create the appropriate
 * Reader instance based on the file type.
 */
public enum FileType {
    CSV,
    JSON
}
