package org.JavaAssignment;

import java.util.HashMap;

//2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
public class RomanNumberToInteger {

    public static void main(String[] args) {
        int decimalNumber = romanToDecimal("MMMDCCXXIV");  //converting roman num to normal by passing in function
        System.out.println(decimalNumber);
    }

//    2. function to convert roman to an integer.
    public static int romanToDecimal(String roman) {
        if (roman == null || roman.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {              //itterating througt roman number in from last
            int currentValue = romanMap.get(roman.charAt(i));
            if (currentValue < prevValue) {               // if samller number is before it is reducing smaller number
                result -= currentValue;
            } else {
                result += currentValue;                    // else increasing
            }
            prevValue = currentValue;
        }

        return result;
    }

}
