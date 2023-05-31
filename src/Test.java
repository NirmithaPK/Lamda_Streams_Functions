import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Test {
    public  static void main(String args[]) {

        Arrays.asList(10, 23, 34, 55, 66, 77, 43, 21, 99).stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        Arrays.asList(10, 23, 34, 55, 66, 77, 43, 21, 99).stream().map(x -> String.valueOf(x)).filter(s -> s.startsWith("1")).forEach(System.out::println);

        List<Integer> list = Arrays.asList(10, 23, 34, 55, 66, 77, 43, 23, 99);

        Arrays.asList(10, 23, 34, 55, 66, 77, 43, 21, 99).stream().distinct().collect(Collectors.toList());

        System.out.println("***************");
        list.stream().filter(value -> Collections.frequency(list,value)>1).collect(Collectors.toSet()).forEach(System.out::println);

        List<String> companies = new ArrayList<String>();

        Set<String> distinctSet = new HashSet<>();

        // 1.1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate

        companies.stream().filter(x -> !distinctSet.add(x)).collect(Collectors.toList()).forEach(System.out::println);

        List<Person> personlist = Arrays.asList(new Person("name","email1"), new Person("name2","email2"));

        distinctSet.forEach(System.out::println);

    }

}