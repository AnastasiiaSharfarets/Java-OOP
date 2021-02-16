package de.telran.application;

import de.telran.dao.Group;
import de.telran.data.Student;

public class MyStart {
    public static void main(String[] args) {
        Group group17 = new Group (2);
        Student sasha = new Student("Sasha", "Ivanov", 30);
        group17.addStudent(sasha);
        System.out.println(group17.size);
        Student dasha = new Student("Dasha", "Ivanova", 25);
        group17.addStudent(dasha);
        System.out.println(group17.size);
        Student  glasha = new Student("Glasha", "Ivanova", 35);
        group17.addStudent(glasha);
        System.out.println(group17.size);
        System.out.println(group17.size);
        Student masha = new Student("Маша", "Ковалёва", 40);
        System.out.println("Добавление студента: " + group17.addStudent(masha));

        // удаление
        System.out.println("Удаление студента: " + group17.deleteStudentFromGroup(sasha));
        System.out.println(group17.size);
        System.out.println(group17.students[0].firstName);
    }

}
