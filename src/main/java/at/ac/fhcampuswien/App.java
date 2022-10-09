package at.ac.fhcampuswien;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        int count = 1;
        double numberCheck = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Number " + count + ": ");
        double numberOne = inputNumber.nextDouble();
        String numberFormat;

        if(numberOne <= 0)
            System.out.println("No number entered.");
        else
            do {
                count ++;
                System.out.print("Number " + count + ": ");
                numberOne = inputNumber.nextDouble();
                if(numberOne > numberCheck)
                    numberCheck = numberOne;
                if(numberOne <= 0) {
                    numberFormat = String.format("%.2f", numberCheck);
                    System.out.println("The largest number is " + numberFormat);
                }
            }
            while(numberOne > 0);



        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}