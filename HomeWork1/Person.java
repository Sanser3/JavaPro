package JavaProf.lesson1.HomeWork1;

/**
 * Класс Person
 * Создать класс Person, который содержит:
 * переменные fullName, age;
 * методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 * другой - Person(fullName, age)
 */
public class Person {
        int age;
        String fullName;

        public Person(String fullName, int age) {
            this.age = age;
            this.fullName = fullName;
        }
        public Person() {

        }

        public void move(){
            System.out.println("Такой-то " + this.fullName + " говорит.");
        }
        public void talk(){
            System.out.println("Такой-то " + this.fullName + " говорит.");
        }
}
