package de.exxcellent.challenge.calculate;

import java.util.ArrayList;

/**
 * This interface is designed to be implemented by classes that perform specific types of calculations
 * on a list of data. The interface is generic and can be adapted to various data types for input and output.
 *
 * @param <T> The type of the result produced by the calculation.
 * @param <K> The type of the elements in the input data list.
 */
public interface Calculator<T,K> {
    /**
     * This method should be implemented to perform a specific calculation, such as summing values,
     * finding averages, or other operations, based on the list of data provided.
     * @param data An ArrayList of data of type K on which the calculation is to be performed.
     * @return The result of the calculation, of type T.
     */
    T calculate(ArrayList<K> data);
}
