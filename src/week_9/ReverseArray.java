package week_9;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public void revArray(){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        num = input.nextInt();
        int [] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("\nReverse numbers: ");
        for (int i=num-1;i>=0;i--){
            System.out.println( arr[i]+ " ");
        }

    }


    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.revArray();
    }
}
