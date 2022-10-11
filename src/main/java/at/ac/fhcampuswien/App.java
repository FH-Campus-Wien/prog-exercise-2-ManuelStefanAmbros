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
        int row = 6;
        String star = "*";
        for(int i = 1; i <= row; i++){
            for(int j = 5; j >= i; j--)
                System.out.print(" ");
            if(i != 1)
                star += "**";
            System.out.print(star + "\n");}
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        Scanner hei = new Scanner(System.in);
        System.out.print("h: ");
        int h = hei.nextInt();
        System.out.print("c: ");
        int c = hei.next().charAt(0);
        int corr;
        int corrFront;



        if(h % 2 == 0)
            System.out.println("Invalid number!");
        else{
            for(int i = 0; i < h / 2 + 1; i++) {
                corr = c;
                corrFront = c;
                for (int j = h / 2; j > i; j--)
                    System.out.print(" ");
                for (int l = 1; l <= i; l++) {
                    if (l == 1)
                        corrFront = c - i;
                    else
                        corrFront++;
                    System.out.print((char) corrFront);
                }
                System.out.print((char) c);
                if (i == 0)
                    System.out.print("\n");
                else {
                    for (int k = 1; k <= i; k++) {
                        corr--;
                        System.out.print((char) corr);
                        if (k == i)
                            System.out.print("\n");
                    }
                }
            }
        }
        for(int z = 1; z <= h / 2; z++){
            corr = c;
            corrFront = c;
            for(int y = 0; y < z; y++)
                System.out.print(" ");
            for (int x = z + 1; x <= h / 2; x++) {
                if (x == z + 1)
                    corrFront = c - h / 2 + z;
                else
                    corrFront++;
                System.out.print((char) corrFront);
            }
            System.out.print((char) c);
            for (int w = h / 2 - 1; w >= z; w--) {
                corr--;
                System.out.print((char) corr);
                if (w == z)
                    System.out.print("\n");}
            if(z == h / 2) // Because AppTest wants a break at the end of the program
                System.out.print("\n");

        }

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