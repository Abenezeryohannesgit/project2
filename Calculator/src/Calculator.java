import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Calculator

{


    public static void main(String[] args)
    {
        add();
        System.out.println("addition ended");
        sub();
        System.out.println("substraction  ended");
        mul();
        System.out.println("Multipication ended");
        div();
        System.out.println("division ended");
        rem();
        System.out.println("reminder ended");


         }
    public static void add()
            {
                Scanner input=new Scanner(System.in);
                int num1 , num2 , result;
                System.out.println("enter the first number :");
                num1=input.nextInt();
                System.out.println("enter the second number :");
                num2=input.nextInt();
                result=num1 + num2;
                System.out.println("the result of the two number is " + result);


            }

    public static void sub()
       {
        Scanner input=new Scanner(System.in);
        int num1 , num2 , result;
        System.out.println("enter the first number :");
        num1=input.nextInt();
        System.out.println("enter the second number :");
        num2=input.nextInt();
        result=num1 - num2;
        System.out.println("the result of the two number is " + result);


       }

    public static void mul()
      {
        Scanner input=new Scanner(System.in);
        int num1 , num2 , result;
        System.out.println("enter the first number :");
        num1=input.nextInt();
        System.out.println("enter the second number :");
        num2=input.nextInt();
        result=num1 * num2;
        System.out.println("the result of the two number is " + result);


      }

    public static void div()
       {
        Scanner input=new Scanner(System.in);
        int num1 , num2 , result;
        System.out.println("enter the first number :");
        num1=input.nextInt();
        System.out.println("enter the second number :");
        num2=input.nextInt();
        result=num1 / num2;
        System.out.println("the result of the two number is " + result);
       }

    public static void rem()
    {
        Scanner input=new Scanner(System.in);
        int num1 , num2 , result;
        System.out.println("enter the first number :");
        num1=input.nextInt();
        System.out.println("enter the second number :");
        num2=input.nextInt();
        result=num1 % num2;
        System.out.println("the result of the two number is " + result);
    }

}