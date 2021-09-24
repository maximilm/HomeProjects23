package ru.mirea.java.practice7;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Game {
    private ArrayDeque<Integer> qP1 = new ArrayDeque<>(), qP2 = new ArrayDeque<>();
    private int steps = 0;
    public Game() {
        Scanner in = new Scanner(System.in);
        int x;
        for(int i = 0; i < 5;i++) {
            x = in.nextInt();
            qP1.add(x);
        }
        for(int i = 0; i < 5;i++) {
            x = in.nextInt();
            qP2.add(x);
        }
        startGame();
    }
    public  void startGame() {
        while(steps != 106 || qP1.isEmpty() || qP2.isEmpty()) {
            steps += 1;
            if (qP1.getFirst() == 0 && qP2.getFirst() == 9 || qP1.getFirst()> qP2.getFirst() && !(qP1.getFirst() == 9 && qP2.getFirst() == 0)) {
                qP1.add(qP1.pollFirst());
                qP1.add(qP2.pollFirst());
            }
            else if (qP2.getFirst() == 0 && qP1.getFirst() == 9 || qP2.getFirst()>qP1.getFirst()){
                qP2.add(qP1.pollFirst());
                qP2.add(qP2.pollFirst());
            }
        }
        if (steps == 106)
            System.out.println("botva");
        else if (qP1.isEmpty())
            System.out.println("second " + steps);
        else if (qP2.isEmpty())
            System.out.println("first " + steps);
     }
}
