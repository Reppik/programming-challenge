package de.exxcellent.challenge.reader;

import java.util.ArrayList;

public interface Reader {
    ArrayList<?> read(String filePath, Class<?> type);
}
