package lambda;
//lambda is pure functional :f(x) = x+3
public class ReturningFromLambda {
    public static void main(String[] args) {
        //Ex 1
        GreetService gs = (name) -> {
          return name.toUpperCase();
        };
        String res = gs.greet("sanju");
        System.out.println(res);

        //Ex 2{Example for higher order function}
        //Usually we write a method and pass data to it for the result but with higher
        //order function we get the data from the methods and while implementing we provide
        // what to do with data
        GreetService gs2 = name -> name.toUpperCase()+name.toLowerCase()+name.length();
        congrats(gs2);

        //Ex 3
        congrats(name -> name.substring(0,3)+name.substring(1,3)+name.length());

    }
    public static void congrats(GreetService gs2){
        String returnedString = gs2.greet("neha");
        System.out.println(returnedString);
    }
}
