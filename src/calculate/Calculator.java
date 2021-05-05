package calculate;

public class Calculator {

    public void addition(int a,int b){
        System.out.println(a+b);

    }

    public void subtraction(int a,int b){
        System.out.println(a-b);
    }

    public void division (int a,int b){
        System.out.println(a/b);
    }

    public void multiplication (int a,int b){System.out.println(a*b);}

    public void calculateresult(int a,int b,char symbol){

        if (a>0 && b>0 && symbol=='+'){
            addition(a,b);
        }else if (a>0&& b>0 && symbol=='-'){
            subtraction(a,b);
        }else if(a>0 && b>0 && symbol=='/'){
            division(a,b);
        }else if(a>0 && b>0 && symbol=='*'){
            multiplication(a,b);
        }else{
            System.out.println("please enter the valid symbol : ");
        }
    }

}
