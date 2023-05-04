import java.util.Scanner;

public class Fistbug {
  public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("fistbug");
        int num = input.nextInt();
        String string = "";
        if (num % 3 == 0) {
        string += "fist";
        }
        if (num % 5 == 0) {
        string += "bug";
        }
        System.out.print(Integer.toString(num) + ": ");
        System.out.println(string);
        input.close();
  }
}