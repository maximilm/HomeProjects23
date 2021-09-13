package ru.mirea.java.practice5;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void rekursiya(String wrld) {
        if (wrld.length() == 1) {
            System.out.print("YES");
        }
        else if (wrld.charAt(0) == wrld.charAt(wrld.length() - 1)) {
            rekursiya(wrld.substring(1,wrld.length()-1));
        }
        else System.out.print("NO");
    }
    public static void main(String[] args) {
        String k;
        Scanner in = new Scanner(System.in);
        k = in.next();
        rekursiya(k);
    }
}
