import java.util.regex.Pattern;

public class Fibonacci {
    public static void main(String args[]) {

        Fibonacci fibonacci = new Fibonacci();
        for(int i=0; i < 10 ; i++) {
            System.out.print(fibonacci.fibonacci(i)+ " ");
        }
        fibonacci.removeAllVowels();
    }

    public int fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        return( fibonacci(n-1)+fibonacci(n-2));
    }

    public void removeAllVowels() {
        String str = "nItmitha";
        //String strreplaced = str.replaceAll("[a,e,i,o,u]","");
        String replaced = Pattern.compile("[a,e,i,o,u]").matcher(str).replaceAll("");
        System.out.println(replaced);

    }
}
