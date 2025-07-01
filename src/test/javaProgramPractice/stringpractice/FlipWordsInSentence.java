package stringpractice;

public class FlipWordsInSentence {
    public static void main(String[] args) {
        String str = "hello boss how are you";
        String[] strarr = str.split(" ");
//        String newstr = "";
        StringBuilder flipped = new StringBuilder();
        for(String s : strarr){
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
//            newstr = newstr.concat(String.valueOf(sb)).concat(" ");
            flipped.append(sb).append(" ");
        }
        System.out.println(String.valueOf(flipped).trim());
    }
}
