package gmail.sydorenko;

public class Homework18 {
    public static double getAverage(double[] array) {
        double total = 0;
        if (array == null || array.length == 0) {
            return 0;
        }
        for (double j : array) {
            total += j;
        }
        return total / array.length;
    }

    public static boolean checkMatrix(int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }
}