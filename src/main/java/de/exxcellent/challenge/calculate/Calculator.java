package de.exxcellent.challenge.calculate;

import java.util.ArrayList;

public interface Calculator<T,K> {
    T calculate(ArrayList<K> data);
}
