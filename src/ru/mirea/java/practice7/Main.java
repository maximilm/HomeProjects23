package ru.mirea.java.practice7;

import java.util.PriorityQueue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  p1,p2;
        p1 = in.nextLine();
        p2 = in.nextLine();
        Game one = new Game(p1,p2);
    }
}
