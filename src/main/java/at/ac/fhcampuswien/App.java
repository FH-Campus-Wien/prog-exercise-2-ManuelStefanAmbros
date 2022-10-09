package at.ac.fhcampuswien;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        int numberCount = 1;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number " + numberCount + ": ");
        double userNumber = userInput.nextDouble();
        double highestNumber = userNumber;
        String formatNumber;

        if(userNumber <= 0) {
            System.out.println("No number entered.");
        }
        while(userNumber > 0){
            numberCount++;
            System.out.print("Number " + numberCount + ": ");
            userNumber = userInput.nextDouble();
            if(highestNumber <= userNumber)
                highestNumber = userNumber;
            if(userNumber <= 0) {
                formatNumber = String.format("%.2f",highestNumber);
                System.out.println("The largest number is " + formatNumber);
            }
        }

        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        Scanner userNumber = new Scanner (System.in);
        System.out.print("n: ");
        int totalNumber = userNumber.nextInt();
        int numberCount = 0;

        if(totalNumber <= 0)
            System.out.println("Invalid number!");
        for(int i = 1; i <= totalNumber; i++){
            for(int j = 1; j <= i; j++){
                numberCount++;
                System.out.print(numberCount + " ");}
            System.out.print("\n");}
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