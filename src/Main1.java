//public class Main1 {
//    public static void main(String[] args){
//        System.out.println("My name is Vishesh");
//        System.out.println("I am learning Java for DSA");
//        System.out.println("Let's start!");
//
//        int age = 18;
//        System.out.println("my age is "+ age);
//
//    }
//}
//
//variables
//public class Main1 {
//    public static void main(String[] args){
//        //dataType variableName = value;
//
//        int age = 18;//integer
//        double pi = 3.14;//double
//        string = "Vishesh ";//string
//        final double PI = 3.14;//const
//    }
//}

import java.util.Scanner;
//
public class Main1 {
    public static void main(String[] args){
        //Input from the user
        Scanner sc = new Scanner(System.in);

        // Input: String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Input: Integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Output
        System.out.println("Hello " + name + ", you are " + age + " years old.");



    }

}
