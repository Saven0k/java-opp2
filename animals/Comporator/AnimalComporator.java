package Comporator;

import java.util.Comparator;

import animals.*;

public class AnimalComporator<Animal> implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
