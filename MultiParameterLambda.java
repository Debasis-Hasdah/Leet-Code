import java.util.function.BiFunction;

public class MultiParameterLambda {

    public static int helperFunction(int a, int b) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        return add.apply(a, b);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 30;

        int result = helperFunction(a, b);

        System.out.println("Sum = " + result);
    }
}