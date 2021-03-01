//Допишите классы Person, Student, Teacher, Worker
//Добавьте в них дополнительные параметры общие в родительский и уникальные в дочерние.
//Добавьте методы ходить, оплата за учёбу, выплата зарплаты
//Создайте массив студентов, учителей, рабочих и персон.
//Создайте метод удаления, добавление, изменения элементов из массива.
//Отсортируйте массивы по возрасту.

import com.sun.security.auth.callback.TextCallbackHandler;

public class StartApplication {
    public static void main(String[] args) {
        //lessonStart();

        Uni techUni = new Uni(1000);

        Student pasha = new Student("Паша", "Алексеев", "27467264", "м", 24);
        Person dasha = new Student("Даша", "Семёнова", "87908089", "ж", 27);
        Person rita = new Student("Рита", "Иванова", "242423535", "ж", 23);

        Teacher ivanov = new Teacher("Ivan", "Ivanov", "019090", "m", 56);
        Teacher sidorov = new Teacher("Sidor", "Sidorov", "039029309", "m", 45);
        Person petrov = new Teacher("Petr", "Petrov", "239023902", "m", 46);

        Worker henry = new Worker("Henry", "Ross", "23829", "m", 50);
        Worker john = new Worker("John", "Top", "28782", "m", 43);
        Worker bob = new Worker("Bob", "Ronn", "9829", "m", 44);

        Student[] informatics = new Student[]{pasha, (Student) dasha, (Student) rita};
        Person[] newPersons = new Person[]{dasha, pasha, (Person) rita};
        Teacher[] teachers = new Teacher[]{ivanov, (Teacher) petrov, (Teacher) sidorov};
        Worker[] workers = new Worker[]{henry, john, bob};
        Object[] myArr = new Object[]{dasha, pasha, rita};

        //sidorov.teach(informatics);

        techUni.addPerson(dasha);
        techUni.addPerson(pasha);
        techUni.addPerson(rita);
        techUni.addPerson(ivanov);
        techUni.addPerson(petrov);
        techUni.addPerson(sidorov);

        techUni.sortByAge();
        techUni.printPersons();


    }

    public static void lessonStart() {
        Student sasha = new Student("Sasha", "Kilin", "2092039023", "м", 23);
        //sasha.study();
        //sasha.eats();
        Teacher tch = new Teacher("Ivan ", "Ivanov", "034590349530", "м", 45);
        Student glasha = new Student("Глаша", " Васечкина", "2021_021", "ж", 23);
        System.out.println(glasha);
        System.out.println("----------------");

    }

}
