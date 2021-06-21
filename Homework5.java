package Lesson05.homework;

public class Homework5 {

    public static void main(String[] args) {

        Person mainEmployee = new Person("Николай", "Викторович",
                "Коробков", "8(903)286-54-33",
                "Test Manager", 90000, 1980);

        Person[] office = {
                mainEmployee,
                new Person("Николай", "Викторович",
                        "Коробков", "8(903)286-54-33",
                        "project owner", 90000, 1980),
                new Person("Лидия", "Викторовна",
                        "Коробкова", "8(999)222-55-33",
                        "project manager", 100000, 1980),
                new Person("Анна", "Николаевна",
                        "Коробкова", "8(499)333-33-33",
                        "senior developer", 70000, 2020),
                new Person("Коробкова", "Любовь",
                        "Васильевна", "8(900)900-90-90",
                        "engineer", 40000, 1960)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldPerson(office, 50);
        System.out.println("***************");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
