package task5;

import java.util.Scanner;

public class Calculator {

    public int a;
    public int b;

    public int add(){ return a + b; }

    public int sub(){ return a - b;}

    public int mul(){return a * b;}

    public int div() throws ArithmeticException{

        return a/b;

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operation(+, -, *, or /)");
        String op = sc.next();

        Calculator calc = new Calculator(a,b);

        switch (op){
            case "+":
                System.out.println(calc.add());
                break;
            case "-":
                System.out.println(calc.sub());
                break;
            case "*":
                System.out.println(calc.mul());
                break;
            case "/":
                try {
                    System.out.println(calc.div());
                }
                catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Wrong operation");
        }

    }
}
