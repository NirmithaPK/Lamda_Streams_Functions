import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        Customer customer = new Customer("Alice", "alice@gmail.com", "0+9848837567", LocalDate.of(2000,1,1));


        System.out.println(new CusotmerValidatorService().isValid(customer));

        //using combinator pattern

         CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEMailValid().
                and(CustomerRegistrationValidator.isPhoneNumberValid()
                        .and(CustomerRegistrationValidator.isPhoneNumberValid())).apply(customer);

        System.out.println(result.name());


        Path ipPath = Paths.get("/some/path/large-input-file.txt");


        Files.lines(ipPath).flatMap(s -> Arrays.stream(s.split("\\s"))).parallel().filter(value -> value.equals("candy")).count();

        String data = "Values are not perm but we can but still work";
        long value = Arrays.stream(data.split("\\s+")).parallel().filter(matchValue -> matchValue.matches("but")).count();
        System.out.println(" no of time found "+value);


    }


}