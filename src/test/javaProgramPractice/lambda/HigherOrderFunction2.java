package lambda;

public class HigherOrderFunction2 {
    public static void main(String[] args) {
        String ss = getLambda().greet("sanju");
        System.out.println(ss);
    }
    public static GreetService getLambda(){
        //GreetService g = (s) -> s.toUpperCase();
        //return g;
        return s -> s.toUpperCase();
    }
}
