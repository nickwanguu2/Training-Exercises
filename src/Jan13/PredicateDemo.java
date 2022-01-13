package Jan13;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main (String[] args){
        Predicate<Integer> intAcc = num -> num >= 0;
        System.out.println(intAcc.test(-1));
    }
}
