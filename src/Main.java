public class Main {
    public static void main(String[] args) {
        //declaring ints
        int intOperandA = 79;
        int intOperandB = 2;
        int intSum = 23;
        int intProduct = 18;
        int intDifference = 101;
        int intQuotient = 1;
        int intModulo = 0;
        //processing
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        //outputting
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The remainder using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        //all again for the doubles
        double doubleOperandA = 12.2;
        double doubleOperandB = 9.6;
        double doubleSum = 3.1459;
        double doubleProduct = 6;
        double doubleDifference = 42.24;
        double doubleQuotient = 12.345;
        double doubleModulo = 76.1;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The remainder using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
        //Declaring variables using context
        int kidsInFamily = 2;
        int favoriteNumber = 7;
        double priceGallonGas = 3.23;
        double shoeSize = 11.5;
        String birthMonth = "August";
        String fullName = "Curtis Allen Buswell";
        boolean isRaining = false;
        System.out.println("There are " + kidsInFamily + " kids in my family.");
        System.out.println("My favorite number is " + favoriteNumber);
        System.out.println("The price of gas is $" + priceGallonGas);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);
        if (isRaining == false) {
            System.out.println("No,it's not raining");
        }
        else {
            System.out.println("Yes, it's raining.");
        }
    }
}