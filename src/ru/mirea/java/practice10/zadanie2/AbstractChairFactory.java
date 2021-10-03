package ru.mirea.java.practice10.zadanie2;

import ru.mirea.java.practice10.zadanie2.Chair.FunctionalChair;
import ru.mirea.java.practice10.zadanie2.Chair.MagicChair;
import ru.mirea.java.practice10.zadanie2.Chair.VictorianChair;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
