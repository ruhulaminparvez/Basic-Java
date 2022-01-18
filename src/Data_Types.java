package src;

public class Data_Types {
    public static void main(String[] args) {

        System.out.print("Hello Java!");
        System.out.println("Hello World!");

        int number = 5;
        System.out.println(number);

        long myLog = 5;
        System.out.println(myLog);

        double myDouble = 4.5;
        System.out.println(myDouble);

        float myFloat = (float) 4.5;
        System.out.println(myFloat);

        char myChar = 'W';
        System.out.println(myChar);

        char myUnicode = '\u00AE';
        System.out.println(myUnicode);

        String myString = "Java";
        System.out.println(myString);

        boolean myBool = false;
        System.out.println(myBool);


        // +, -, /, *, %
        // arithmetic operation

        int a = 5;
        int b = 6;

        int plus = a + b;
        int minus = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Addition of two values are: " + plus);
        System.out.println("Subtraction of two values are: " + minus);
        System.out.println("Multiplication of two values are: " + mul);
        System.out.println("Division of two values are: " + div);


    }
}
