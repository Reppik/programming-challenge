package de.exxcellent.challenge.reader;

/**
 * The FileReaderFactory class is responsible for creating instances of Reader implementations
 * based on the specified file type.
 */
public class FileReaderFactory {
    /**
     * Creates and returns an instance of a Reader implementation based on the provided FileType.
     * Currently, it supports creating readers for CSV and JSON(the read method for JSON is not implemented yet) file types.
     * @param type The FileType enum indicating the type of file reader to create.
     * @return A Reader implementation suitable for the specified file type.
     *         Returns CSVReader for FileType.CSV and JSONReader for FileType.JSON.
     */
    public Reader createReader(FileType type){
        return switch (type) {
            case CSV -> new CSVReader();
            case JSON -> new JSONReader();
        };
    }
}
