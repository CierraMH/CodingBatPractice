package Package;

public class Warmup1 {
    // Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    // I just added the par. together because I was unsure if I could use java.util
    // packages
    // such as the math one
    public int sumDouble(int a, int b) {
        if (a == b) {
            return a + a + b + b;
        } else {
            return a + b;
        }
    }

    // Given 2 ints, a and b, return true if one if them is 10 or if their sum is
    // 10.
    // I used an if else statment to compare a and b to 10 as well as to compare
    // their sum to 10
    // and returned a true or false sense this is a boolean
    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (a == 10 || b == 10) {
            return true;
        } else if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }

    // Given a string, return a new string where "not " has been added to the front.
    // However, if the string already begins with "not", return the string
    // unchanged.
    // Note: use .equals() to compare 2 strings.
    // I used an if statement that compares the sting using both equals or
    // startswith to see if it has not already
    // if it does I left the str as is and if it did not I added it using
    // concatenation
    public String notString(String str) {
        if (str.equals("not") || str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    // The parameter weekday is true if it is a weekday, and the parameter vacation
    // is true
    // if we are on vacation. We sleep in if it is not a weekday or we're on
    // vacation.
    // Return true if we sleep in.
    // I used an if statement that checks if it is not a weekday or if it is true
    // that it's
    // vacation that it returns true(sleepin!) and if it is a week day or not true
    // for vaction
    // it returns false
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

}