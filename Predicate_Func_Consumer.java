import java.util.function.*;

public class Predicate_Func_Consumer {

    public static void main(String... args) {

        // Consumer does'nt return anything
        Consumer<Integer> consumer = a -> System.out.println(a * a);
        consumer.accept(2);

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println(a + b);
        };
        biConsumer.accept(10, 20);

        //Predicate Returns only boolean
        Predicate<String> c1 = (s) -> (s.length() >= 5);
        System.out.println(c1.test("123456"));

        BiPredicate<String, String> biPredicate = (a, b) -> a.length() > b.length();
        System.out.println(biPredicate.test("hi", "heya"));

        //Function 2nd argument specifies the return type
        Function<Integer, Integer> function = i -> i * i;
        System.out.println(function.apply(5));

        BiFunction<Integer, Integer, String> biFunction = (a, b) -> String.valueOf(a + b);
        System.out.println(biFunction.apply(5, 6));

    }
}
