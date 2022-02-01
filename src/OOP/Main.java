package src.OOP;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone();

        iPhone.name = "iPhone 11";
        System.out.println(iPhone.name);

        iPhone.screenSize = 5;
        System.out.println(iPhone.screenSize);

        iPhone.camera = 10;
        System.out.println(iPhone.camera);

        iPhone.memoryRam = 2;
        System.out.println(iPhone.memoryRam);

    }
}
