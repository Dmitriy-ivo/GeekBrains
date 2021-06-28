/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
Конструктор класса должен заполнять эти поля при создании объекта;
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
Создать массив из 5 сотрудников:
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000,
30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/

package GeeB1_5;

public class Person {
    String fio;
    String position;
    String email;
    String tel;
    int salary;
    int age;

    Person(String fio, String position, String email, String tel, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void printValue(Person person){
        System.out.println(person.fio + " " + person.age);
    }

    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Alex", "Programmer","mail","454651",45000, 45);
        person[1] = new Person("John", "Programmer","mail","454651",45000, 30);
        person[2] = new Person("Bob", "Programmer","mail","454651",45000, 75);
        person[3] = new Person("Steven", "Programmer","mail","454651",45000, 20);
        person[4] = new Person("Lui", "Programmer","mail","454651",45000, 25);

        for (int i = 0; i < person.length; i++) {
            if (person[i].age > 40)
            person[i].printValue(person[i]);
        }

    }

}
