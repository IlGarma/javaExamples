/**
 * Created by Garma on 05/07/2015.
 */
public class TestAll {

    public static boolean testNumber(TestNumberInterface ti, int number) {
        return ti.test(number);
    }

    public static void main(String[] args) {
        //Lambda no parameter
        MyValue myValue;
        myValue = () -> 1.0;
        System.out.println("The value is "+ myValue.getValue());

        MyValue reciprocal = () -> 11/2;
        System.out.println("The reciprocal of 11/2 is "+reciprocal.getValue());

        //Lambda one parameter
        GetDoubleValue doubleValue;
        doubleValue = (n) -> 1/n;

        double[] doubleValues = {1.2,2.3,4.0};

        for (int i=0; i<doubleValues.length; i++) {
            System.out.println("The reciprocal of "+doubleValues[i] + " is "+ doubleValue.getValue(doubleValues[i]));
        }

        //Lambda generic
        GetGenericSum<Integer, Integer> getSumInteger = (n,m) -> {

            return n+m;

        };
        System.out.println("Generic sum of 1 and 2 is"+getSumInteger.getSum(new Integer(1),new Integer(2)));


        GetGenericSum<Double, Double> getSumDouble = (n,m) -> {
            return n+m;
        };

        System.out.println("Generic sum of double 1.34 and 3.98 is "+getSumDouble.getSum(new Double(1.34), new Double(3.98)));

        //Method Reference to static method
        System.out.println("\nMethod reference to static methods...");
        System.out.println("Is 3 an even number? "+ testNumber(TestNumber::isEven, 3));
        System.out.println("Is 3 an odd number? "+testNumber(TestNumber :: isOdd, 3));
        System.out.println("Is 3 positive? " + testNumber(TestNumber::isPositive, 3));
        System.out.println("Is 3 negative? "+ testNumber(TestNumber::isNegative, 3));

        //Method reference to instance method
        System.out.println("\nMethod reference to instance methods...");
        TestNumberGreaterThanAnother tNumberGreater = new TestNumberGreaterThanAnother(2);
        TestNumberInterface tiGreaterThan = tNumberGreater::isGreater;
        System.out.println("2 is greater than 4? "+tiGreaterThan.test(4));

    }

}
