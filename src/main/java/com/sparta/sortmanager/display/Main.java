package com.sparta.sortmanager.display;
import com.sparta.sortmanager.control.SortManagerController;

import java.util.Scanner;

import static com.sparta.sortmanager.control.LogDriver.logger;
import static com.sparta.sortmanager.control.SortManagerController.performSort;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Display display = new Display(0, 0, 0, null);
        Scanner scan = new Scanner(System.in);
        logger.info("Program started.");

        do {
            if(option == 1) {
                display.getSettings();
                logger.info("Settings changed.");
            }
            display.mainMenu();

            System.out.println("Enter 1 to change settings, 2 to perform sort, 3 to exit: ");
            option = scan.nextInt();

            if(option == 2) {
                performSort(display);
                logger.info("Sort performed.");
            }

        } while(option != 3);
        logger.info("Program exited.");
    }
}
