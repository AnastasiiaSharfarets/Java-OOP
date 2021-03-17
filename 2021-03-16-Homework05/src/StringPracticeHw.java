public class StringPracticeHw {

    public static String getStrReverse(String str) {
        if (str == null || str.trim().isEmpty())
            return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static String stringReverse(String str) {
        if (str == null || str.trim().isEmpty())
            return null;
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
        if (str == null || str.trim().isEmpty())
            return null;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    public static Integer getCountWords(String sent, String word) {
        if (sent == null || sent.trim().isEmpty())
            return null;
        int count = 0;
        while (sent.contains(word)) {
            count++;
            sent = sent.substring(sent.indexOf(word) + word.length());
        }
        return count;
    }

    public static Integer getCountWords2(String input, String word) {
        if (input == null || input.trim().isEmpty() || word.trim().isEmpty())
            return null;
        String[] strs = input.split(" ");
        int count = 0;
        word = word.trim();
        for (String s : strs) {
            if (s.equals(word))
                count++;
        }
        return count;
    }
}
