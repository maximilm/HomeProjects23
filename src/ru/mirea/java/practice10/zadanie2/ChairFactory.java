package ru.mirea.java.practice10.zadanie2;

import ru.mirea.java.practice10.zadanie2.Chair.FunctionalChair;
import ru.mirea.java.practice10.zadanie2.Chair.MagicChair;
import ru.mirea.java.practice10.zadanie2.Chair.VictorianChair;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
