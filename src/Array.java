package src;

public class Array {
    public static void main(String[] args) {

        //One Method for Assigning String Array
        String[] students = new String[5];

        students[1] = "Mynul";
        students[0] = "Adline";
        students[3] = "Zahid";
        students[2] = "Mahi";
        students[4] = "tanvir";

        System.out.println(students[0]);

        //Another Method for Assigning string Array
        String[] employees = {"Mynul", "Adline", "Zahid", "Mahi", "Tanvir"};

        System.out.println(employees[0]);
        System.out.println(employees[1]);


        //Assigning number array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(numbers[5]);

        //print all elements  of array using for-loop
        for(int i=0; i<8; i++){
            System.out.println("Number is: " + numbers[i]);
        }

        //print all elements  of string array using for-loop
        for(int i=0; i<5; i++){
            System.out.println(employees[i]);
        }

        //sizeofArray --> property is : [variable_name.length]
        //print all elements  of array using for-loop
        for(int i=0; i<numbers.length; i++){
            System.out.println("Number is: " + numbers[i]);
        }

        //sizeofArray --> property is : [variable_name.length]
        //print all elements  of string array using for-loop
        for(int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }

    }
}
