package application;

import data.*;
import interfaces.IPrintable;

import java.util.Arrays;

public class MassMediaAppl {
    public static void main(String[] args) {
        Journal j1 = new Journal("Murzilka", 30000, 35, false);
        Journal j2 = new Journal("Marusya", 75000, 45, true);
        Journal j3 = new Journal("Krokodil", 39000, 25, false);

        Newspaper n1 = new Newspaper("Trud", 100000, 20);
        Newspaper n2 = new Newspaper("Zdorovie", 1000, 15);
        Newspaper n3 = new Newspaper("Vedomosti", 50000, 28);

        NewsPortal np1 = new NewsPortal("YandexNews", "https://yandex.com/news");
        NewsPortal np2 = new NewsPortal("Lenta", "https://lenta.ru/");
        NewsPortal np3 = new NewsPortal("RamblerNews", "https://news.rambler.ru/");

        WebSite w1 = new WebSite("Meduza", "https://meduza.io/", "Галина Тимченко");
        WebSite w2 = new WebSite("Дождь", "https://tvrain.ru/", "Наталья Синдеева");
        WebSite w3 = new WebSite("ВестиRU", "https://www.vesti.ru/", "Антон Носик");
        WebSite w4 = new WebSite("НТВ Новости", "https://www.ntv.ru/novosti/", "К. Демков");

        MassMedia[] ar = new MassMedia[]{j1, j2, j3, n1, n2, n3, np1, np2, np3, w1, w2, w3, w4};

        //printMassMedia(ar);
        displayPrintable(ar);
        //System.out.println(Arrays.toString(getPrintableElements(ar)));
        System.out.println("=========================================================================");
        printArray(getPrintableElements(ar));

    }

    private static void displayPrintable(MassMedia[] ar) {
        for (MassMedia m : ar) {
            if (m instanceof IPrintable) {
                IPrintable temp = (IPrintable) m;
                temp.print();
                System.out.println(m);
            }
        }
    }

    private static void printMassMedia(MassMedia[] ar) {
        for (MassMedia m : ar) {
            System.out.println(m.toString());
        }
    }

    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                count++;
            }
        }
        IPrintable[] a = new IPrintable[count];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (ar[i] instanceof IPrintable) {
                a[count] = (IPrintable) ar[i];
                count++;
            }
        }
        return a;
    }

    public static void printArray(IPrintable[] input) {
        System.out.println("Array of IPrintable objects: ");
        System.out.print("[");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.println(input[i] + ", ");
        }
        for (int i = input.length - 1; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.print("]");
    }
}
