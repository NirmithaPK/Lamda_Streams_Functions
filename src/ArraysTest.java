import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        System.out.println("Sri Matre Namaha!");
        int[][] inputMatrix = {
                {21,34,76},
                {2,1},
                {90,23,-23}
        };

        ArraysTest test = new ArraysTest();
        System.out.println("matrix lenght **** "+inputMatrix.length);
        System.out.println(test.minimumValue(inputMatrix));
    }

    int minimumValue(int[][] inputMatrix) {

        int minimumValue = 0;
        for(int r=0; r<inputMatrix.length; r++) {
            minimumValue = inputMatrix[r][0];
            for(int c=0; c<inputMatrix[r].length; c++) {
                if (inputMatrix[r][c] < minimumValue) {

                    //store the minimum value to the variable each time
                    //when the above condition satisfied
                    minimumValue = inputMatrix[r][c];
                }
            }
        }

        return minimumValue;
    }


}
