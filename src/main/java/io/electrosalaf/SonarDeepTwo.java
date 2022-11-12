package io.electrosalaf;

/**
 * THOUGHT PROCESS
 * Step1: Initialize the window sum and count to 0
 * Step2: Since we are adding in windows of 3 elements, I checked for ArrayOutBoundException
 * to see if on adding 3 more elements to the current index, we are still within the element of the array
 * If not, that specifies we cannot conduct sliding window sum of elements, hence breaking away from the loop
 * Step3: Initialize an integer to keep track of temporal summation computed and to be compared
 * Step4: Loop through the array and add up 3 elements
 * Step5: Check if the current sum is greater than the previous sum
 * Step6: Increment the counter by 1
 * Step7: Repeat the process all over until the elements cannot be summed in a sliding window of 3.
 */
public class SonarDeepTwo {
    public static int countChanges(int[] report) {

        // Initializing the sum and the count
        int sum = 0;
        int count = 0;

        for (int i = 0; i < report.length; i++) {
            // Check for ArrayOutOfBoundException if 3 more elements is
            // added to the current index and greater than length of the array
            // That signifies we cannot sum elements in 3 sliding windows
            if(i+3 > report.length - 1){
                break;
            }

            // Variable to keep track of the summation temporary
            int tempSum = 0;
            // Loop through and add the elements to the temporal sum
            for (int j = i; j < i+3; j++) {
                tempSum = report[j]+ tempSum;
            }
            // Increase the count if temporal sum is greater than the sum
            if (tempSum > sum) {
                count++;
            }
            sum = tempSum;
        }
        return count;
    }

    // Although, the solution was tested with the test cases given but was excluded at the point
    // of submission to reduce number of lines
    public static void main(String[] args) {
        int[] report = {199, 200, 208, 210, 200, 207, 240, 269, 260, 263};
        System.out.println(countChanges(report));
    }
}
