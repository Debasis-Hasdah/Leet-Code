public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int startIndex = canCompleteCircuit(gas, cost);

        System.out.println("Starting station index = " + startIndex);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;      // total balance
        int tank = 0;       // current tank
        int start = 0;      // candidate start

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];

            total += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total >= 0 ? start : -1;
    }
}