package gmail.sydorenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework18Test {

    @Test
    public void average() {

        double[] array = {1, 2, 3, 4, 5};
        double expected = 3;

        double result = Homework18.getAverage(array);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void averageWhenNull() {

        double average = Homework18.getAverage(null);
        Assertions.assertEquals(0, average);
    }

    @Test
    void averageWhenEmptyArray() {

        double average = Homework18.getAverage(new double[]{});
        Assertions.assertEquals(0, average);
    }

    @Test
    void isSquareMatrix() {
        int[][] matrix = {{1, 2}, {1, 2}};

        boolean result = Homework18.checkMatrix(matrix);
        Assertions.assertTrue(result);
    }

    @Test
    void isMatrixNotSquare() {
        int[][] matrix = {{1, 2},null, {3}};

        boolean result = Homework18.checkMatrix(matrix);
        Assertions.assertFalse(result);
    }

    @Test
    void checkMatrixToNull() {

        boolean result = Homework18.checkMatrix(null);
        Assertions.assertFalse(result);

    }

    @Test
    void isEmptyMatrix() {
        int[][] matrix = {};

        boolean result = Homework18.checkMatrix(matrix);
        Assertions.assertFalse(result);
    }

}

