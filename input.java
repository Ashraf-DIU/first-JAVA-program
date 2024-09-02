
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Int value
        // System.out.println("Input Your Age: ");
        // int age = sc.nextInt();
        // System.out.println(age);

        //float value
        // System.out.println("Input Your Age: ");
        // float age2 = sc.nextFloat();
        // System.out.println(age2);

        //string input
        System.out.println("Input Your Name");
        String name = sc.next();
        System.out.println(name);

        //string input sentence
        System.out.println("Input Your Name");
        String name2 = sc.nextLine();
        System.out.println(name2);
    }
}
