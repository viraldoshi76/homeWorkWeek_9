package week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class LondonTube {

    public void tube(){
        String tube;
        char ch;
        do {
            Scanner map = new Scanner(System.in);
            System.out.print("pleas enter the Station name : ");
            tube = map.nextLine();

            if (tube.equals("picadilly")) {
                System.out.println("\nBakerloo line\n Circle line \n District line \n Hammersmith &city line");
            } else if (tube.equals("bayswater")) {
                System.out.println("Circle line \n District line");
            } else if (tube.equals("nottinghillgate")) {
                System.out.println("\n Central line \n Circle line \n District line");
            } else if (tube.equals("high street kensington")) {
                System.out.println("\n Circle line \n District line");
            } else if (tube.equals("earlscourt")) {
                System.out.println("\n District line \n Picadilly line");
            } else if (tube.equals("gloucester road")) {
                System.out.println("\n Circle line \n District line \n Picadilly line");
            } else if (tube.equals("south kensington")) {
                System.out.println("\n Circle line \n District line \n Picadilly line");
            } else if (tube.equals("knightsbridge")) {
                System.out.println("\n Picadilly line");
            } else if (tube.equals("baker street")) {
                System.out.println("\n Bakerloo line \n circle line \n Hammersmith & city line \n Jubilee line \n Metropolitan line");
            } else
                System.out.println(" ");

            System.out.println("do you want information for any more stations :");
           ch = map.next().charAt(0);

        }while (ch=='y'|| ch=='Y');

    }

    public static void main(String[] args) {
        LondonTube obj = new LondonTube();
        obj.tube();
    }
}
