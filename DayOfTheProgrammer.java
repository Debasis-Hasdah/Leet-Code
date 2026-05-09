public class DayOfTheProgrammer {

    public static void main(String[] args) {

        // Hardcoded example year
        int year = 2017;

        String result;

        // Special case
        if (year == 1918) {

            result = "26.09.1918";

        }
        // Julian Calendar
        else if (year < 1918) {

            if (year % 4 == 0) {
                result = "12.09." + year;
            } else {
                result = "13.09." + year;
            }

        }
        // Gregorian Calendar
        else {

            if ((year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0)) {

                result = "12.09." + year;

            } else {

                result = "13.09." + year;
            }
        }

        // Output
        System.out.println("Day of Programmer: " + result);
    }
}