public class Operators {
    public static void main(String[] args) {
        // go to, break, return, continue;
        //introBreak();
        //introReturn();
        //myFirstZone(true);
        introContinue();

        /*1. создай файл
        2. напиши привет
        3. напиши 5 + 5
        4. GOTO 2 line*/
        int n = 10;
        for (int i = 0; i < 10; i++) {
            if (n > 10) {
                break;
            }
        }
    }

    private static void introContinue() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                continue;//перейти к следующему i
            }
            System.out.println();
        }
    }

    private static void myFirstZone(boolean quarantine) {
        //создаем зону видимости
        quarantineZone:
        {
            int a = 10;
            if (quarantine) {
                int b = 4;
                System.out.println("Карантин");
                break quarantineZone;//выход из зоны
                //после брейка тоже не видим
            }
            System.out.println(a);
            System.out.println("Выйти из карантина: ");
            //System.out.println(b);//не видим б
        }
        // System.out.println(a);//не видим а
    }

    private static void introBreak() {
    }

    private static int introReturn() {
        return 5 + 10;
    }
}
