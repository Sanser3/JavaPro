package JavaProf.lesson1.HomeWork1;

public class PersonBuilder {
    public static void main(String[] args) {
        Person newPerson = new Person("Vasya", 25);
        Person newPerson2 = new Person();

        newPerson.move();
        newPerson2.talk();
    }

}
