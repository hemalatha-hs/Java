import java.util.Scanner;

public class Calculator 
{   public static void main(String[] args) 
   {    Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter operator (+, -, *, /,%): ");
        char operator = sc.next().charAt(0);
        float result = 0;
        switch (operator) {
            case '+': result = num1 + num2;
                      break;
            case '-': result = num1 - num2;
                      break;
            case '*': result = num1 * num2;
                      break;
            case '/':if (num2 != 0)
                     {result = num1 / num2;
                      } else
                     {System.out.println("Error");
                      return;
                      }
                      break;
            case '%': if (num2 != 0)
                     {result = num1 % num2;
                     } else 
                     {System.out.println("Error");
                      return;
                      }
                     break;
            default: System.out.println("Error: Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);
        
    }
}
