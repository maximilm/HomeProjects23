import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> qu1 = new ArrayDeque<>(), qu2 = new ArrayDeque<>(), dequ1 = new ArrayDeque<>(), dequ2 = new ArrayDeque<>();
        int a, j = 0;
        for(int i = 0; i < 5; i++){
            a = in.nextInt();
            qu1.addLast(a);
            dequ1.addFirst(a);
        }
        for(int i = 0; i < 5; i++){
            a = in.nextInt();
            qu2.addLast(a);
            dequ2.addFirst(a);
        }
        while (j != 106 && !(qu1.isEmpty() || qu2.isEmpty() || dequ1.isEmpty() ||
                dequ2.isEmpty())){
            if (qu1.getFirst() > qu2.getFirst() && !(qu1.getFirst() == 9 && qu2.getFirst() == 0)){
                qu1.addLast(qu1.pollFirst());
                qu1.addLast(qu2.pollFirst());
            } else {
                qu2.addLast(qu1.pollFirst());
                qu2.addLast(qu2.pollFirst());
            }

            if (dequ1.getLast() > qu2.getLast() && !(dequ1.getLast() == 9 && dequ2.getLast() == 0)){
                dequ1.addFirst(dequ1.pollLast());
                dequ1.addFirst(dequ2.pollLast());
            } else {
                dequ2.addFirst(dequ1.pollLast());
                dequ2.addFirst(dequ2.pollLast());
            }
            if (qu1.isEmpty()){
                System.out.println("first " + (j + 1) + " queue");
            } else if (qu2.isEmpty()){
                System.out.println("second " + (j + 1) + " queue");
            }

            if (dequ1.isEmpty()){
                System.out.println("first " + (j + 1) + " dequeue");
            } else if (dequ2.isEmpty()){
                System.out.println("second " + (j + 1) + " dequeue");
            }
            j++;
        }
    }
}