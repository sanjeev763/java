package stringpractice;

public class MphasisInt {
    public static void main(String[] args) {
        String str = "I Love Dogs";
        str = str.replace(" ", "");
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                String s = "";
                if (str.charAt(i) != str.charAt(j)) {
                    s = s + str.charAt(i) + str.charAt(j);
                    System.out.println(s);
                }
            }
        }
    }
    }

