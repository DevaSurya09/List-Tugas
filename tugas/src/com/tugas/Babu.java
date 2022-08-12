package com.tugas;

import java.util.Scanner;

public class Babu {
    public boolean yesNo(String massage) {
        Scanner yesOrNo = new Scanner(System.in);
        System.out.print("\n" + massage + " (y/n)? ");
        String yn = yesOrNo.next();
        while (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n")) {
            System.err.println("pilihan anda bukan y atau n");
            System.out.print("\n" + massage + " (y/n)? ");
            yn = yesOrNo.next();
        }
        return yn.equalsIgnoreCase("y");

    }

    public void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }

}
