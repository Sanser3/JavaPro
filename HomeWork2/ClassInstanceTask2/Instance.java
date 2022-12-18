package JavaPro.HomeWord.HomeWork2.ClassInstanceTask2;

/**
 * Написать пример создания экземпляров разных классов и расскажите где будут храниться обьекты, переменные, поля.
 */
public class Instance {
    public static void main(String[] args) {

        Person person1 = new Person("Leopold", 6); // создание объекта (экземпляра) класса Person
        System.out.println("person1: " + person1);

        Person person2 = person1; // Объявил новый объект person2, и назначил ей person1

        person2.name = "Molly"; // Изменил имя person2, и person1 тоже изменится
        person2.age = 16;

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);

    }

}
