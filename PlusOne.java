/*
 * <aside>
💡 **Question 5**
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

</aside>
 * 
 * 
 */

package in.ineuron.gouthami;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the digit
            digits[i]++;

            // If the digit becomes less than 10, no carry-over
            if (digits[i] < 10) {
                return digits;
            }

            // Carry-over to the next digit
            digits[i] = 0;
        }

        // If all digits are 9, add an extra digit
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("The incremented Array is :: " +Arrays.toString(result));
    }
}