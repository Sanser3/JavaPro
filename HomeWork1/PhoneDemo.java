package JavaProf.lesson1.HomeWork1;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone apple = new Phone(123456789, "Iphone 14", 125);
        Phone samsung = new Phone(234567890, "Galaxy", 150);
        Phone nokia = new Phone(345678901, "G21", 85);

        System.out.println(apple);
        System.out.println(samsung);
        System.out.println(nokia);

        apple.receiveCall("John");
        samsung.receiveCall("Oliver");
        nokia.receiveCall("Harry");

        System.out.println(apple.getNumber());
        System.out.println(samsung.getNumber());
        System.out.println(nokia.getNumber());
    }
}
