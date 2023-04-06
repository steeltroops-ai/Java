public class diffBeDigitAndSum {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;
            digitSum += getDigitSum(num);
        }

        return Math.abs(elementSum - digitSum);
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
// Class to find the difference of the sum of elements and digit sum of elements in an array
class Solution {
    // Main function to calculate the difference of sum
    public int differenceOfSum(int[] nums) {
        // Variable to store the sum of elements in the array
        int elementSum = 0;
        // Variable to store the sum of digits of elements in the array
        int digitSum = 0;
        
        // Loop through each element in the array
        for (int num : nums) {
            // Add the element to the element sum
            elementSum += num;
            // Add the digit sum of the element to the digit sum
            digitSum += getDigitSum(num);
        }
        
        // Return the absolute difference between the element sum and digit sum
        return Math.abs(elementSum - digitSum);
    }
    
    // Function to calculate the digit sum of a number
    private int getDigitSum(int num) {
        int sum = 0;
        // Loop to add up each digit of the number
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        // Return the digit sum
        return sum;
    }
}
