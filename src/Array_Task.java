package src;

import java.util.Scanner;

public class Array_Task {
    public static void main(String[] args) {

        String[] names = {"Mynul", "Zahid", "Owali", "Tanvir", "Muib"};
        int[] numbers = {1234, 5678, 91011, 121314, 151617};

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please Enter Your Name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(int i=0; i<names.length; i++){
            if(name.equals(names[i])){
                System.out.println(numbers[i]);
            }

        }
    }
}
