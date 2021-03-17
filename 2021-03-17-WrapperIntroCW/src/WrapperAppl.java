public class WrapperAppl {
    /*
    обёртка
     * byte - Byte short - Short int - Integer long - Long float - Float double -
     * Double char - Character boolean - Boolean
     */

    public static void main(String[] args) {
        int x = 10;
        Integer a = 6;// автоупаковка
        System.out.println(a + 10);// автораспаковка
        System.out.println(a > 10);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String str = "1234";
        System.out.println(str + 10);
        x = Integer.parseInt(str); //"1234" -> 1234
        System.out.println(x + 10);
//		str = "12.34";
//		x = Integer.parseInt(str);
        //================================
        Long b = 12L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        Long c = Long.parseLong("4725463");
        System.out.println(c - 4725463);
        //================================
        Double d = 3.14;
        System.out.println(Double.MAX_VALUE);
        double d2 = Double.parseDouble("12.1");
        System.out.println(d2);
        //================================
        boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);
        bo = Boolean.parseBoolean("TRUE");
        System.out.println(bo);
        bo = Boolean.parseBoolean("TrUe");
        System.out.println(bo);
        bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        bo = Boolean.parseBoolean("true ");
        System.out.println(bo);
        bo = Boolean.parseBoolean("Vasya");
        System.out.println(bo);
        //================================
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isWhitespace('\n'));
    }

}