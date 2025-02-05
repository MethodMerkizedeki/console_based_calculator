import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            //display menu
            
            System.out.println("simple calculator");
            System.out.println("1: addition");
            System.out.println("2: subtraction");
            System.out.println("3: multiplication");
            System.out.println("4: division");
            System.out.println("5: exponentiation (num1^num2)");
            System.out.println("6: exit");
            System.out.println("choose an optipon");

            //check if the input is an integer
            if(!scanner.hasNextInt()){
                System.out.println("invalid input, please enter a valid integer");
                scanner.next(); //clear the invalid input
                continue;
            }

            int choice = scanner.nextInt();

            if(choice == 6){
                System.out.println("exciting calculator, goodbyee");
                break;
            }

            //take user inputs for numbers

            System.out.println("enter fisrt number");
            if (!scanner.hasNextDouble()) { // check if the input is a number
                System.out.println("invalid input, please enter a valid number");
                scanner.next(); //clear the invalid input
                continue;
            }
            double num1 = scanner.nextDouble();

            System.out.println("enter second number");
            if (!scanner.hasNextDouble()){ //check if the input is a number 
                System.out.println("invalid input, please enter a valid number");
                scanner.next(); //clear the invalid input
                continue;
            }
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
                case 5:
                 result = Math.pow(num1, num2);
                 System.out.println("result:" + result);
                 break;

                default:
                    System.out.println("invalid option, please try again");
            }
        }
        scanner.close();
    }
}