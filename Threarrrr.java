import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Введите первое число: ");
    double num1 = input.nextDouble();
    
    System.out.println("Введите второе число: ");
    double num2 = input.nextDouble();
    
    System.out.println("Выберите операцию (+, -, *, /): ");
    char operator = input.next().charAt(0);
    
    double result = 0.0;
    
    switch(operator) {
      case '+':
        result = num1 + num2;
        break;
        
      case '-':
        result = num1 - num2;
        break;
        
      case '*':
        result = num1 * num2;
        break;
        
      case '/':
        result = num1 / num2;
        break;
        
      default:
        System.out.println("Неверный оператор.");
        return;
    }
    
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}
