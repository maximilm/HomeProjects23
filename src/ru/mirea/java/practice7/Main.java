package ru.mirea.java.practice7;

import java.util.PriorityQueue;
import java.util.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
    ArrayDeque<Integer> qP1 = new ArrayDeque<>(), qP2 = new ArrayDeque<>();
    ArrayDeque<Integer> deqP1 = new ArrayDeque<>(), deqP2 = new ArrayDeque<>();
    int steps = 0;
    Scanner in = new Scanner(System.in);
    int x;
    for(int i = 0; i < 5;i++) {
        x = in.nextInt();
        qP1.addLast(x);
        deqP1.addFirst(x);
    }
    for(int i = 0; i < 5;i++) {
        x = in.nextInt();
        qP2.addLast(x);
        deqP2.addFirst(x);
    }
    while(steps != 106 && !(qP1.isEmpty() || qP2.isEmpty() || deqP1.isEmpty() || deqP2.isEmpty())) {
        steps += 1;
        if (qP1.getFirst() == 0 && qP2.getFirst() == 9 || qP1.getFirst() > qP2.getFirst() && (qP1.getFirst() != 9 || qP2.getFirst() != 0)){
            qP1.addLast(qP1.pollFirst());
            qP1.addLast(qP2.pollFirst());
        } else {
            qP2.addLast(qP1.pollFirst());
            qP2.addLast(qP2.pollFirst());
        }
        if (qP1.getLast() == 0 && qP2.getLast() == 9 || qP1.getLast() > qP2.getLast() && (qP1.getLast() != 9 || qP2.getLast() != 0)){
            qP1.addLast(qP1.pollLast());
            qP1.addLast(qP2.pollLast());
        } else {
            qP2.addLast(qP1.pollLast());
            qP2.addLast(qP2.pollLast());
        }
    }
        System.out.println("Queue");
    if (steps == 106)
        System.out.println("botva");
    else if (qP1.isEmpty())
        System.out.println("second " + steps);
    else if (qP2.isEmpty())
        System.out.println("first " + steps);
        System.out.println("Deque");
    if (steps == 106)
        System.out.println("botva");
    else if (qP1.isEmpty())
        System.out.println("second " + steps);
    else if (qP2.isEmpty())
        System.out.println("first " + steps);
    }
}
