


public class loops {
    public static void main(String[] args) {
        //for loop
        //  for(int i=0; i <= 40; i++){
        //     System.out.println(i);
        //  }

         //while loop
        //  int i = 20;
        //  while(i>=1){
        //     System.out.println(i);
        //     i--;}

        //do while
        // int k = 20;
        // do { 
        //     System.out.println(k);
        //     k--;
        // } while (k >= 1);  
        
        //exercise
        // Scanner sc = new Scanner(System.in);
        // int num = 0;
        // do { 
        //     System.out.print("Input a Number : ");
        //     num = sc.nextInt();
        //     System.out.print("Here is The Number : ");
        //     System.out.println(num);
        // } while (num >= 0);
        // System.out.println("The End");

        //break continue
        int i = 1;
        while (true) {
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i = i+1;
            if(i > 5){
                break;
            }
        }
    }
}
