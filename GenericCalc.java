import java.util.Scanner;

public class GenericCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number 1");
        int n1 = input.nextInt();
        System.out.println("operator");
        char operator = input.next().charAt(0);
        System.out.println("number 2");
        int n2 = input.nextInt();
        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println((float) n1 / (float) n2); // using this only for divide bc its the only place where desirable
                break;
            default:
                System.out.println("that operator isnt supported");
            
        }
        input.close();
        // yay i made an adding program!!! now i can code AI in Java!!!
    }
}
