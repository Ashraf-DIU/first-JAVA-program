import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = b/a;
        //div int decimel value
        double div2 = (double)b/(double)a;
        int mod = b%a;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(div2);
        System.out.println(mod);

        //Increment
        // a++;
        // System.out.println(a);
        // System.out.println(++a);
        // System.out.println(a++);
        //decrement
        // b--;
        // System.out.println(b);
        // System.out.println(--b);
        // System.out.println(b++);

        //max  min print
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Age: ");
        float age = sc.nextFloat();
        System.out.println(age);
    }
}
