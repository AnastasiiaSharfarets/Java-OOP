package de.telran.application;

import de.telran.data.Student;

public class StartMyLovelyApplication {
    public static void main(String[] args) {
        Student vasyaPupkin = new Student();
        Student sergej = new Student();
        Student varvara = new Student();
        Student afdofia = new Student(
                "Афдофья",
                "Ивановна",
                18);
        System.out.println(vasyaPupkin.toDisplay());
        System.out.println();
        System.out.println(vasyaPupkin.age);
        System.out.println();
        System.out.println(afdofia.toDisplay());
        System.out.println(afdofia.studentID);

        Student[] group = new Student[]{vasyaPupkin, sergej, varvara, afdofia};

        //studentsPrint(groupTUBerlin);
    }

    public static void studentsPrint(Student[] group) {
        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i].toDisplay());
        }
    }
}

