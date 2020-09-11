

public class Recursive_Faculty {

    public static void main(String[] args) {

        // input
        int val;

        /*
        * Test 1
        * Input: val = 5
        * Forventet output: 120
        * Aktuel output: 120
        */
        System.out.println("Test 1");
        val = 5;
        Validator(val);

        /*
         * Test 2
         * Input: val = 7
         * Forventet output: 5040
         * Aktuel output: 5040
         */
        System.out.println("Test 2");
        val = 7;
        Validator(val);

        /*
         * Test 3
         * Input: val = 2
         * Forventet output: 2
         * Aktuel output: 2
         */
        System.out.println("Test 3");
        val = 2;
        Validator(val);

        /*
         * Test 4
         * Input: val = 0
         * Forventet output: 1
         * Aktuel output: 1
         */
        System.out.println("Test 4");
        val = 0;
        Validator(val);

        /*
         * Test 5
         * Input: val = -4
         * Forventet output: Error message
         * Aktuel output: Error message
         */
        System.out.println("Test 5");
        val = -4;
        Validator(val);

    }

    // this procedure is responsible for validating if the input is not invalid/un-usable
    public static void Validator(int number) {

        if (number < 0) {

            System.out.println("Error: Faculty does not accept negative numbers");

        } else {

            // Calls functions and prints it
            System.out.println(Faculty(number));

        }

    }

    // this function is responsible for calculating the faculty
    public static int Faculty(int number) {

        if (!(number <= 0)) {

            // the function calls itself until the number reaches 0
            return Faculty(number - 1) * number;

        } else {

            return 1;

        }

    }

}
