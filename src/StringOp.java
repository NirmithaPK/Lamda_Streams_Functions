import java.util.Arrays;
import java.util.Objects;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class StringOp {
    
    public static void  main(String args[]) {
        StringOp op = new StringOp();
        op.reverseString("Nirmitha");
        System.out.println(op.containsVowels("Meow"));

    }
    
    public void reverseString(String str) {
        if( str == null)
            throw new IllegalArgumentException("Value is null");
            StringBuilder builder = new StringBuilder();

        char[] strArray = str.toCharArray();    

        for (int i = strArray.length - 1 ; i >= 0; i--) {
            builder.append(strArray[i]);
        }

        System.out.println(builder.toString());

    }

    void swap() {
      int x = 5;
      int y = 10;
      x = x+y;
      y = x - y;
      x = x - y;

        System.out.println("X value "+x +" Y value "+y);
    }

    boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    void isPrime() {
        int x = 50;
        System.out.println( x%2 > 0);
    }


}
