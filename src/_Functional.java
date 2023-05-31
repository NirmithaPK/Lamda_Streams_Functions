import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Functional {

    public static  void main(String args[]) {
        Function<Integer,Integer> singleFunction = value ->  value++;

        Arrays.asList(1,3,4,5).stream().forEach(value -> System.out.println(value));

        Arrays.asList(1,3,4,5).stream().map( value -> new MapperTestClass("nirmitha") ).forEach(value -> System.out.println(value.name));

        List<String> words= Arrays.asList("JavaDevJournal","Java");
        List<String> stringList = words.stream().map( s-> s.split("")).flatMap(Arrays::stream).collect(Collectors.toList());

        List<String> stringList1 = words.stream().flatMap(value -> Arrays.stream(value.split(""))).collect(Collectors.toList());

        stringList.forEach(System.out::println);

//        The flatMap() function is similar to map(), but it has a different signature:
//        it takes a Function<T, Stream<R>> as an argument and produces a stream of type Stream<R>. The Function<T, Stream<R>>
//        interface has a single method, apply(T t), that takes an argument of type T and returns a stream of type Stream<R>.
//        Here is an example of using the flatMap() function to transform a list of strings into a stream of their characters:

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        List<Character> chars = fruits.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char)c))
                .collect(Collectors.toList());

        List<Person> personList = List.of(
                new Person("Nirmitha",Gender.FEMALE),
                new Person("ALpha",Gender.MALE),
                new Person("BETA",Gender.FEMALE),
                new Person("Nimo",Gender.MALE),
                new Person("MOANA",Gender.FEMALE)

        );

        personList.stream().filter(person -> person.gender != Gender.FEMALE).map(person -> person.name).collect(Collectors.toList()).forEach(System.out::println);

//        The main difference between map() and flatMap() is that map() transforms each element of a stream into a single element of a new stream,
//        while flatMap() transforms each element of a stream into a stream of multiple elements.

    }

    static class Person {
        String name;
        Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

    }

    enum Gender {
        MALE, FEMALE
    }
    static Function<Integer,String> mapperFunction(){
        Function<Integer,String> function = value1 -> String.valueOf(value1);
        return function;
    }

   static  class MapperTestClass {

        MapperTestClass( String name) {
            this.name = name;

        }
        String name;
    }
}
