public class methods {
    public static void printJ(){
        System.out.println("Hello Java");
    }
    public static void printName (String name){
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //Methods
        printJ();
        printName("Aman");
        printName("Akku");
        printSum(6, 7);

        
        //Try-Match in expectations
        // int [] marks = {98, 97, 78};
        // try {
        //     System.out.println(marks[5]);
        // } catch (Exception e) {
        //     //Do something after catching
        // }
        // System.out.println(marks[1]);
        // System.out.println("My name is Aman");
    }
}
