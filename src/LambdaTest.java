import java.io.InputStream;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaTest {
    public  static void main(String ars[]) {
        LambdaTest test = new LambdaTest();
        test.lambdaSort();
        test.anyMatchAndFilter();
        test.occurenceOfWord();

        List<String> vowels = List.of("a", "e", "i", "o", "u");

        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());

        StringBuilder result1 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result1.toString());
        String result2 = vowels.parallelStream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(result2);


    }

    public void lambdaSort() {
        Collections.reverse(Arrays.asList(1,3,4,5));
        Collections.sort(Arrays.asList(1,3,4,5));
        List<Integer> sortedList = Arrays.asList(2,3,8,1,4,9,7).stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if( o1 > o2 )
                    return 1;
                else if ( o1 < o2) {
                    return -1;
                }
                return 0;

            }
        }).collect(Collectors.toList());
        sortedList.forEach(value -> System.out.println(value));
    }

    public void anyMatchAndFilter() {
        boolean flag = Arrays.asList(2, 3, 8, 1, 4, 9, 7).stream().filter(value -> value>0).anyMatch(value -> value > 15);
        System.out.println(flag);
        Stream.empty();
        Stream.builder().add(1).add(2);
        Stream.concat(Arrays.asList(2,3,5).stream(), new ArrayList<Integer>(List.of(1,2)).stream()).collect(Collectors.toList())
                .forEach(value -> System.out.println(value));

        IntStream intStream = IntStream.range(2,6); //IntStream.rangeClosed(2,6);

    }

    public void occurenceOfWord() {
        String data = "Values are not perm but we can but still work";
        long value = Arrays.stream(data.split("\s+")).parallel().filter(matchValue -> matchValue.matches("but")).count();
        System.out.println(" no of time found "+value);
    }

}
