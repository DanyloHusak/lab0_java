package lab0;

public class Variant2 {

    public enum DAY_OF_WEEK {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public int inputOutputTask(int k) {
        return 4 * k;
    }

    public int integerNumbersTask(int k) {
        return k / 100;
    }

    public boolean booleanTask(int number1) {
        return number1 > 0;
    }

    public int ifTask(int parameter) {
        if (parameter > 0) {
            return parameter * 2;
        } else {
            return parameter;
        }
    }

    public DAY_OF_WEEK switchTask(int number1) {
        switch (number1) {
            case 1:
                return DAY_OF_WEEK.MONDAY;
            case 2:
                return DAY_OF_WEEK.TUESDAY;
            case 3:
                return DAY_OF_WEEK.WEDNESDAY;
            default:
                return DAY_OF_WEEK.MONDAY;
        }
    }

    public double forTask(int n) {
        assert n > 0 : "Argument should be more than zero";
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / factorial(i);
        }
        return result;
    }

    private double factorial(int n) {
        if (n == 0) {
            return 1;
        }
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int whileTask(int a, int b) {
        assert (a > 0 && b > 0) : "Arguments should be more than zero";
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public double arrayTask(double[] array) {
        double min = array[0];
        for (double value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int[][] twoDimensionArrayTask(int[][] array, int k1, int k2) {
        int[] temp = array[k1];
        array[k1] = array[k2];
        array[k2] = temp;
        return array;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }
}