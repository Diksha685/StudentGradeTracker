public class Student {

    private String studentName;
    private String rollNumber;

    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;

    public Student() {

    }

    public Student(String studentName, String rollNumber,
                   int subject1, int subject2, int subject3,
                   int subject4, int subject5) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    // Getter Methods

    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getSubject1() {
        return subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public int getSubject4() {
        return subject4;
    }

    public int getSubject5() {
        return subject5;
    }

    // Setter Methods

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public void setSubject4(int subject4) {
        this.subject4 = subject4;
    }

    public void setSubject5(int subject5) {
        this.subject5 = subject5;
    }

    // Total Marks

    public int getTotalMarks() {
        return subject1 + subject2 + subject3 + subject4 + subject5;
    }

    // Average

    public double getAverage() {
        return getTotalMarks() / 5.0;
    }

    // Percentage

    public double getPercentage() {
        return getTotalMarks() / 5.0;
    }

    // Highest Marks

    public int getHighestMarks() {

        int highest = subject1;

        if(subject2 > highest)
            highest = subject2;

        if(subject3 > highest)
            highest = subject3;

        if(subject4 > highest)
            highest = subject4;

        if(subject5 > highest)
            highest = subject5;

        return highest;
    }

    // Lowest Marks

    public int getLowestMarks() {

        int lowest = subject1;

        if(subject2 < lowest)
            lowest = subject2;

        if(subject3 < lowest)
            lowest = subject3;

        if(subject4 < lowest)
            lowest = subject4;

        if(subject5 < lowest)
            lowest = subject5;

        return lowest;
    }

    // Grade

    public String getGrade() {

        double percentage = getPercentage();

        if(percentage >= 90)
            return "A+";

        else if(percentage >= 80)
            return "A";

        else if(percentage >= 70)
            return "B";

        else if(percentage >= 60)
            return "C";

        else if(percentage >= 40)
            return "D";

        else
            return "FAIL";
    }

}