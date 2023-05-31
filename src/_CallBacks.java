import com.sun.tools.jconsole.JConsoleContext;

import java.util.function.Consumer;

public class _CallBacks {

    public static void main(String args[]) {

        hello("nirmitha", null , value -> {
            System.out.println("no lastname provided for "+value);
        });


        hello2("nirmitha", null , () -> {
            System.out.println("No last name provided");
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }


    static void hello2(String firstName, String lastName, Runnable callback) {
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
