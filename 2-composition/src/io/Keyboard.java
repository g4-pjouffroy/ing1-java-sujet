package io;

import java.util.Scanner;

public class Keyboard {
    private final Scanner scanner;

    public Keyboard() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt() {
        System.out.print("Entrez un nombre : ");
        return scanner.nextInt();
    }
}
