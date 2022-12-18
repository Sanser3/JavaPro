package JavaPro.HomeWord.HomeWork2.ClassInstanceTask2;

public class Person {
    String name;    // имя (поля)
    int age;        // возраст

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
