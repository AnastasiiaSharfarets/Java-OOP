package inheritance;

//Допишите классы Person, Student, Teacher, Worker
//Добавьте в них дополнительные параметры общие в родительский и уникальные в дочерние.
//Добавьте методы ходить, оплата за учёбу, выплата зарплаты
//Создайте массив студентов, учителей, рабочих и персон.
//Создайте метод удаления, добавление, изменения элементов из массива.
//Отсортируйте массивы по возрасту.

public class StartApplication {
    public static void main(String[] args) {
        //lessonStart();
        Student pasha = new Student("Паша", "Алексеев", "27467264");
        Person dasha = new Student("Даша", "Семёнова", "87908089");
        Object rita = new Student("Рита", " Иванова", "242423535");
        Person andrew = new Person();

        String hausmaster = "Василий";

        Student[] informatics = new Student[]{pasha, (Student) dasha, (Student) rita};
        Person[] newPersons = new Person[]{dasha, null, pasha, (Person) rita, andrew,};
        Object[] myArr = new Object[]{dasha, pasha, rita, andrew, hausmaster};
    }

    public static void lessonStart() {
        Student sasha = new Student();
        //sasha.study();
        //sasha.eats();
        Teacher tch = new Teacher();
        Student glasha = new Student("Глаша", " Васечкина", "2021_021");
        System.out.println(glasha);
        System.out.println("----------------");
        Person ps = new Person();
        System.out.println(ps);
        System.out.println("----------------");
        Teacher tc = new Teacher();
        System.out.println(tc.toString());
    }

}
