import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Function<String,String> samplefunction = value -> value+"e";
        Function<String,String> duplicateFunction = value -> value+"e";
        Function<String,String> beforeFunction = value -> value+"3";

        //composed fucntions

        System.out.println(samplefunction.andThen(beforeFunction).apply("Nirmitha"));

        System.out.println(samplefunction.compose(beforeFunction).apply("nirmitha"));

        System.out.println(samplefunction.equals(samplefunction));

        System.out.println(samplefunction.equals(duplicateFunction));

        FunctionalProgramming programming = new FunctionalProgramming();

        List<PersonClass> personClass =
                Arrays.asList(
                        new PersonClass("Max", 18,Gender.MALE),
                        new PersonClass("Peter", 23,Gender.MALE),
                        new PersonClass("Pamela", 23,Gender.FEMALE),
                        new PersonClass("David", 12,Gender.MALE));


        Map<Integer, List<PersonClass>> personsByAge = personClass
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));

        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

    }

}

class PersonClass {
    String name;
    int age;

    Gender gender;

    PersonClass(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name;
    }
}

enum Gender {
    MALE,FEMALE
}
