import java.util.function.BiFunction;
import java.util.function.Function;

public class _Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCase = name -> {
            name = name.toUpperCase();
            return name;
        };
        Function<String, String> lowerCase = name -> name.toLowerCase();

        BiFunction<String, Integer, String> upperCase2 = (name,age) -> {
            name = name.toUpperCase();
            return name;
        };

        System.out.println(upperCase2.apply("Alex", 20));

        Integer number = null;// int count = 0; primitives are not used in lambdas
    }

}
