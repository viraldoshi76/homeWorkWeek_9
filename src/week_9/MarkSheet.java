package week_9;

import java.util.Scanner;

public class MarkSheet {

    public void marks(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = input.nextLine();
        System.out.print("Enter roll No.: ");
        int rollno = input.nextInt();
          int maths,science,english,marks;
              do {
                  System.out.print("Enter Maths marks : ");
                  maths = input.nextInt();
              } while (maths < 0 || maths > 100);
              do {
                  System.out.print("Enter Science marks : ");
                  science =input.nextInt();
              }while(science<0 || science>100);
              do{
                  System.out.print("Enter English marks : ");
                  english = input.nextInt();
              }while(english<0 || english>100);

        System.out.println("--------------------------------");
        System.out.println("|                              |");
        System.out.println("|         Mark Sheet           |");
        System.out.println("|                              |");
        System.out.println("--------------------------------");
        System.out.println("|     Name    :      " +name +"     |");
        System.out.println("|    Roll no.  :      " +rollno +"       |");
        System.out.println("--------------------------------");
        System.out.println("|    Maths     :     "+ maths +"        |");
        System.out.println("|    Science  :      "+ science +"        |");
        System.out.println("|    English   :     "+ english +"        |");
        System.out.println("|                              |");
        System.out.println("--------------------------------");
        int total = maths+english+science;
        System.out.println("|   Total      :     "+total   + "       |");
        float percentage = (total*100) /300;
        System.out.println("|   Percentage :    "+ percentage+"       |");
        if ((percentage>=35 && percentage<50)&& maths>=35 && science>=35 && english>=35) {
            System.out.println("|    Result    :       pass    |");
            System.out.println("|    Grade     :        C      |");}
        else if((percentage>=50 && percentage<60)&& maths>=35 && science>=35 && english>=35){
            System.out.println("|    Result    :       pass    |");
            System.out.println("|    Grade     :        B      |");}
        else if((percentage>=60 && percentage<80)&& maths>=35 && science>=35 && english>=35){
            System.out.println("|    Result    :       pass    |");
            System.out.println("|    Grade     :        A      |");}
        else if((percentage>=80)&& maths>=35 && science>=35 && english>=35){
            System.out.println("|    Result    :       pass    |");
            System.out.println("|    Grade     :        A+     |");}
        else {
            System.out.println("|    Grade     :       Fail    |");


        }

        System.out.println("--------------------------------");

    }

    public static void main(String[] args) {
        MarkSheet obj = new MarkSheet();
        obj.marks();
    }
}
