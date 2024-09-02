class main{
    public static void main(String[] args) {
        System.err.println("Hello World");
        String name = "Ashraf Bin Alam";
        String neibour = "Something";
        // int age = 30;
        // String friend = "neibour":
        System.out.println(name.length());
        //char define in string
        System.out.println(name.charAt(3));
        //replace
        String name2 = name.replace('a', 'n');
        System.out.println(name2);
        //Add two string
        String name3 = name + " and " +neibour;
        System.out.println(name3);
        //substring
        System.out.println(name3.substring(2, 6));
    }
} 