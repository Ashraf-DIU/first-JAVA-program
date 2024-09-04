
import java.util.Scanner;

public class bitwise_Operator {
    public static void main(String[] args) {
        //Get Bit 1<<i (And Operation)
        // int n = 5; //0101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // if((bitMask & n) == 0){
        //     System.out.println("Bit Was Zero");
        // }
        // else System.out.println("Bit Was one");

        //Set Bit 1<<i (OR operation)
        // int n = 5; //0101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int newN = bitMask | n;
        // System.out.println(newN);

        //Clear Bit 1<<i {AND with NOT}
        // int n = 5; //0101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);
        // int newN = notBitMask & n;
        // System.out.println(newN);

        //Update Bit ,, For 0 -> Clear,, for 1 -> Set Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 -> Set ; oper=0 -> clear
        int n = 5; //0101
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1){
            int newN = bitMask | n;
            System.out.println(newN);
        }
        else {
            int notBitMask = ~(bitMask);
            int newN = notBitMask & n;
            System.out.println(newN);
        }
    }
}
