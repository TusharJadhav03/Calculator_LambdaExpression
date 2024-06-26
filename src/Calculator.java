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
            System.out.println("\n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 0.Exit");
            switch (sc.nextInt()){
                case 1 :
                    MathOper add = (a,b)-> x + y ;
                    System.out.println("Addition : "+add.calculate(x,y));
                    break;

                case 2 :
                    MathOper sub = (a,b)-> x - y;
                    System.out.println("Substraction : "+sub.calculate(x,y));
                    break;

                case 3 :
                    MathOper mul = (a,b)-> x * y;
                    System.out.println("Multiplication : "+mul.calculate(x,y));
                    break;

                case 4 :
                    try {
                        MathOper div = (a, b) -> x / y;
                        System.out.println("Division : " +div.calculate(x, y));
                        }
                    catch (Exception e){
                        System.out.println("Cannot divide with 0"+e);
                    }
                    break;

                case 0 :
                    System.exit(0);
                    break;
            }
        }

    }
}