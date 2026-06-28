import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int num1,num2;
        while(choice != 9){
            System.out.println("\n========== MINI CALCULATOR ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Square Root");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter first number : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number : ");
                    num2 = sc.nextInt();
                    System.out.println("Answer = "+(num1+num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.println("Answer = "+(num1-num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.println("Answer = "+(num1*num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    if(num2 != 0)
                        System.out.println("Answer = "+((double)num1/num2));
                    else
                        System.out.println("Cannot divide by zero.");
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    if(num2 != 0)
                        System.out.println("Answer = "+(num1%num2));
                    else
                        System.out.println("Cannot perform modulus by zero.");
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextInt();
                    System.out.println("Answer = "+Math.pow(num1,num2));
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextInt();
                    System.out.println("Square = "+(num1*num1));
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextInt();
                    if(num1 >= 0)
                        System.out.println("Square Root = "+Math.sqrt(num1));
                    else
                        System.out.println("Square root of a negative number is not possible.");
                    break;
                case 9:
                    System.out.println("Calculator Closed. Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");    
            }
        }
        sc.close();
    }
}