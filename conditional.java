

public class conditional {
    public static void main(String[] args) {
        //comparison operator
        //a==b , a!=b , a<b , a>b , a<=b , a>= b

        //conditional Stt
        // boolean isSunUp = true;
        // if(isSunUp == true)
        // System.out.println("Day");
        // else
        // System.out.println("Night");

        //Logical And(&) OR(||)
        // int a = 50;
        // int b = 40;
        // if(a < 50 & b < 50){
        //     System.out.println("Both less than 50");
        // }

        // if (a < 50 || b < 50) {
        //     System.out.println("Atleast one less than 50"); 
        // }
        
        // boolean isAdult = true;
        // if(isAdult){
        //     System.out.println("is Adult");
        // }
        // else System.out.println("Not Adult");

        // Scanner sc = new Scanner(System.in);
        // //pen = 10  notebook = 40
        // int cash = sc.nextInt();
        // if(cash < 10){
        //     System.out.println("cannot buy anything");
        //     System.out.println("Get more cash");
        // }
        // else if (cash > 10 && cash < 40) {
        //     System.out.println("Can Get one thing");
        // }
        // else System.out.println("can get Both");

        //Switch Case
        int day = 1; 
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Mon - Fri");
        }
    }
}
