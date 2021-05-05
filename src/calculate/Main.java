package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        char ch;
        Calculator obj = new Calculator();
        Scanner input = new Scanner(System.in);
        do {
           System.out.print("enter the first number : ");
           int a = input.nextInt();
           System.out.print("enter the second number : ");
           int b = input.nextInt();
           System.out.print("enter enter one of the symbol +,-,/,* : ");
           char symbol = input.next().charAt(0);
           obj.calculateresult(a, b, symbol);
            System.out.print("please enter Y or N : ");
             ch =input.next().charAt(0);
       }while(ch=='y'|| ch=='Y');

    }
}
