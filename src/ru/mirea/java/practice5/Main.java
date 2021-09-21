package ru.mirea.java.practice5;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void rekursiya(String wrld) {
        if (wrld.length() == 1 || wrld.length() == 2 && wrld.charAt(0) == wrld.charAt(wrld.length()-1) ) {
            System.out.println("YES");
        }
        else if (wrld.charAt(0) == wrld.charAt(wrld.length() - 1)) {
            rekursiya(wrld.substring(1,wrld.length()-1));
        }
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        String k = " ";
        Scanner in = new Scanner(System.in);
        while (k != "0") {
            k = in.next();
            rekursiya(k);
        }
    }
}
