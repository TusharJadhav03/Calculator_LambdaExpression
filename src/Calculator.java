import java.util.*;
 interface MathOper{
      int calculate(int x,int y);
}

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();



        while(true){
            System.out.println("***---Welcome to Calculator---***");
            System.out.println("\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
            switch (sc.nextInt()){
                case 1 :
                    MathOper add = (a,b)-> x + y ;
                    System.out.println("Addition : "+add.calculate(x,y));
                    break;

                case 2 :
                    MathOper sub = (a,b)-> x - y;
                    System.out.println("Substraction : "+sub.calculate(x,y));
                    break;
            }
        }

    }
}