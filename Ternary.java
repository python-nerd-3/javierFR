import java.util.Scanner;

public class Ternary {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("i can guess your age in 1 question");
        System.out.println("how old are you?");
        int age = input.nextInt();
        System.out.println("you are " + (age == 3 ? "3! just like me :D" : "not 3. i couldn't get an exact answer") );
        input.close();
    }
}