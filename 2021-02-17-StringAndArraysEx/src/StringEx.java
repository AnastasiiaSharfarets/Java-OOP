public class StringEx {
    public static void main(String[] args) {
        //10. We’ll say that a String is xy-balanced if for all the ‘x’ chars in the string,
        // there exists a ‘y’ char somewhere later in the string.
        // So “xxy” is balanced, but “xyx” is not. One ‘y’ can balance multiple ‘x’s.
        // Return true if the given string is xy-balanced.
        System.out.println(xyBalance("aaxbby"));// →true
        System.out.println(xyBalance("aaxbb"));// →false
        System.out.println(xyBalance("yaaxbb"));// →false
        // 1.проверить, есть ли в стринге х
        // 2.проверить есть ли за х -> у
        // 3.метод contains или indexOf
        // 4.метод substring
        String hm = "Vasiliy";
        char ch = 'a';
        int a = hm.indexOf(ch);
        System.out.println(a);
    }

    private static boolean xyBalance(String input) {
        char x = 'x';
        char y = 'y';

        if (input.contains("x")) {
          return input.substring(input.indexOf(x)).contains("y");
        }
        return false;
    }
}
