package ru.mirea.java.practice2;

import ru.mirea.java.practice11.Ball;

public class Main {
    public static void main(String[] args) {
        Author one =  new Author( "Tan Ah Teck",'M',"ahTeck@somewhere.com");
        Author two =  new Author( "Sue Grant",'F',"suGrant@somewhere.com");Author three =  new Author( "Alexa Teni",'U',"al.ten.@somewhere.com");
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
    }
}
