public class GradeCalculator {

    // Check if marks are valid (0 to 100)
    public static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }

    // Check all five subjects
    public static boolean areAllMarksValid(int s1, int s2, int s3, int s4, int s5) {

        return isValidMarks(s1) &&
               isValidMarks(s2) &&
               isValidMarks(s3) &&
               isValidMarks(s4) &&
               isValidMarks(s5);
    }

    // Total Marks
    public static int calculateTotal(int s1, int s2, int s3, int s4, int s5) {

        return s1 + s2 + s3 + s4 + s5;

    }

    // Average
    public static double calculateAverage(int total) {

        return total / 5.0;

    }

    // Percentage
    public static double calculatePercentage(int total) {

        return total / 5.0;

    }

    // Highest Marks
    public static int highestMarks(int s1, int s2, int s3, int s4, int s5) {

        int highest = s1;

        if (s2 > highest)
            highest = s2;

        if (s3 > highest)
            highest = s3;

        if (s4 > highest)
            highest = s4;

        if (s5 > highest)
            highest = s5;

        return highest;

    }

    // Lowest Marks
    public static int lowestMarks(int s1, int s2, int s3, int s4, int s5) {

        int lowest = s1;

        if (s2 < lowest)
            lowest = s2;

        if (s3 < lowest)
            lowest = s3;

        if (s4 < lowest)
            lowest = s4;

        if (s5 < lowest)
            lowest = s5;

        return lowest;

    }

    // Grade
    public static String calculateGrade(double percentage) {

        if (percentage >= 90)
            return "A+";

        else if (percentage >= 80)
            return "A";

        else if (percentage >= 70)
            return "B";

        else if (percentage >= 60)
            return "C";

        else if (percentage >= 40)
            return "D";

        else
            return "FAIL";

    }

    // Pass or Fail
    public static String getResult(int s1, int s2, int s3, int s4, int s5) {

        if (s1 >= 40 &&
            s2 >= 40 &&
            s3 >= 40 &&
            s4 >= 40 &&
            s5 >= 40) {

            return "PASS";
        }

        return "FAIL";
    }
}