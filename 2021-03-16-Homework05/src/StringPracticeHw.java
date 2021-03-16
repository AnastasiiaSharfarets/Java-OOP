public class StringPracticeHw {

    public static String getStrReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String stringReverse(String str) {
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < chars.length / 2; i++) {
            temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    public static Integer getCountWords(String sent, String word) {
        int count = 0;
        while (sent.contains(word)) {
            count++;
            sent = sent.substring(sent.indexOf(word) + word.length());
        }
        return count;
    }
}
