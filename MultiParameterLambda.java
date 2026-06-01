import java.util.function.BiFunction;

public class MultiParameterLambda {

    public static int helperFunction(int a, int b) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        return add.apply(a, b);
    }

    public static void main(String[] args) {

        int a = 50;
        int b = 80;

        int result = helperFunction(a, b);

        System.out.println("Sum = " + result);
    }
}