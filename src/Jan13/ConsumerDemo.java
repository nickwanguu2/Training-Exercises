package Jan13;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main (String[] args){
        Consumer<Integer> intConsumer = num -> System.out.println("The int is " + num);
        intConsumer.accept(12);
    }
}
