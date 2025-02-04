import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {

            //display menu
            
            System.out.println("simple calculator");
            System.out.println("1: addition");
            System.out.println("2: subtraction");
            System.out.println("3: multiplication");
            System.out.println("4: division");
            System.out.println("5: exit");
            System.out.println("choose an optipon");

            int choice = scanner.nextInt();

            if(choice == 5){
                System.out.println("exciting calculator, goodbyee");
                running = false;
                continue;
            }

            //take user inputs for numbers

            System.out.println("enter fisrt number");
            double num1 = scanner.nextDouble();
            System.out.println("enter second number");
            double num2 = scanner.nextDouble();
            double result = 0;

            switch(choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("result:" + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("result:" + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("result:" + result);
                    break;
                case 4:
                    if(num2 != 0) {
                        result = num1 / num2;
                        System.out.println("result:" + result);
                    } else {
                        System.out.println("error! division by zero is not allowed");
                    }
                    break;
                default:
                    System.out.println("invalid option, please try again");
            }
        }
        scanner.close();
    }
}