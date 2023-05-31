import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {
        Optional.ofNullable("Hello").orElseThrow(() -> new NullPointerException());

        Optional.ofNullable("Hello").orElseGet(() -> "default");

        Optional.ofNullable("Hello").orElse("other");

        Optional.ofNullable("Hello").ifPresent(value -> System.out.println("Say "+value));

        Optional.ofNullable("TEst").ifPresentOrElse(value -> System.out.println(value), () -> {
            System.out.println("Cannot send email");
        });

    }
}
