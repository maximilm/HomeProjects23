package ru.mirea.java.practice8;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(5); b.add(7); b.add(8);
        WaitList<Integer> a = new WaitList<Integer>(b);
        a.add(78);
        System.out.println(a.toString());
        if (!a.isEmpty())
            System.out.println("remove: " + a.remove());
        System.out.println("contains: " + a.contains(67));
        System.out.println("containsAll: " + a.containsAll(b));
        System.out.println("isEmpty: " + a.isEmpty());
        System.out.println(a.toString());
        System.out.println("--------------------------------------");
        BoundedWaitList<Integer> a2 = new BoundedWaitList<Integer>(b);
        a2.add(78);
        System.out.println(a2.toString());
        if (!a.isEmpty())
            System.out.println("remove: " + a2.remove());
        System.out.println("contains: " + a2.contains(67));
        System.out.println("containsAll: " + a2.containsAll(b));
        System.out.println("isEmpty: " + a2.isEmpty());
        System.out.println(a2.toString());
        System.out.println("--------------------------------------");
        UnfairWaitList<Integer> a3 = new UnfairWaitList<Integer>();
        a3.add(78); a3.add(5); a3.add(7); a3.add(8); a3.add(789); a3.add(6009); a3.add(72389);
        System.out.println(a3.toString());
        if (!a.isEmpty())
            System.out.println("remove: " + a3.remove());
        System.out.println("contains: " + a3.contains(67));
        System.out.println("containsAll: " + a3.containsAll(b));
        System.out.println("isEmpty: " + a3.isEmpty());
        System.out.println(a3.toString());
        a3.remove(7);
        System.out.println("Remove - 7 " + a3.toString());
        a3.moveToBack(8);
        System.out.println("moveToBack  - 8 " + a3.toString());
    }
}
