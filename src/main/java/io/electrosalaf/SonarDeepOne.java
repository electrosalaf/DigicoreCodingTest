package io.electrosalaf;

/**
 * THOUGHT PROCESS
 * Step1: Initialize the window sum and count to 0
 * Step2: Loop through the elements in the array
 * Step3: Check if the current element is greater than the previous element
 * Step4: If step3 is true,increment the counter by 1.
 * Step5: Return the counter.
 */


public class SonarDeepOne {
    public static int countChanges(int[] report) {
        int count = 0;
        for (int i = 1; i < report.length; i++) {
            if (report[i] > report[i - 1]) {
                count++;
            }
        }
        return count;
    }

    // Although, the solution was tested with the test cases given but was excluded at the point
    // of submission to reduce number of lines
    public static void main(String[] args) {
        int[] result = {199, 200, 208, 210, 200, 207, 240, 269, 260, 263};
        System.out.println(countChanges(result));
    }
}
