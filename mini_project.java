
import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNum = 0;

        do{
            System.out.print("Guess My Number(1-100): ");
            userNum = sc.nextInt();

            if(userNum == myNum){
                System.out.println("Very Impressive! .. You are correct");
                break;
            }
            else if(userNum > myNum){
                System.out.println("Your Number is too large");
            }
            else{
                System.out.println("Your Number is too Small");
            }
        }while(userNum >= 0);

        System.out.print("My Number Was : ");
        System.out.println(myNum);
    }
}
