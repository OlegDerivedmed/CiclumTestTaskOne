package com.derivedmed.task1.app;

import java.util.Scanner;

public class AppRunner {
    private Scanner scanner = new Scanner(System.in);
    private static AppRunner ourInstance = new AppRunner();

    public static AppRunner getInstance() {
        return ourInstance;
    }

    private AppRunner() {
    }

    public void runApp(){
        while (true){
            System.out.println("Enter your string: ");
            String line = scanner.nextLine();
            if ("end".equals(line)) {
                break;
            }
            System.out.print("Transformed line: ");
            System.out.println(transform(line));
            System.out.println("Type end to exit");
        }

    }

    private String transform(String line){
        return line.replaceAll("([\\(\\)\\{\\[\\]}\\>\\<])\\1+", "$1");
    }
}
