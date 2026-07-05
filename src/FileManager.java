import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveReport(Student student) {

        try {

            FileWriter writer = new FileWriter("StudentReport.txt");

            writer.write("========== STUDENT GRADE REPORT ==========\n\n");

            writer.write("Student Name : " + student.getStudentName() + "\n");
            writer.write("Roll Number  : " + student.getRollNumber() + "\n\n");

            writer.write("Subject 1 : " + student.getSubject1() + "\n");
            writer.write("Subject 2 : " + student.getSubject2() + "\n");
            writer.write("Subject 3 : " + student.getSubject3() + "\n");
            writer.write("Subject 4 : " + student.getSubject4() + "\n");
            writer.write("Subject 5 : " + student.getSubject5() + "\n\n");

            writer.write("Total       : " + student.getTotalMarks() + "\n");
            writer.write("Average     : " + student.getAverage() + "\n");
            writer.write("Percentage  : " + student.getPercentage() + "%\n");
            writer.write("Highest     : " + student.getHighestMarks() + "\n");
            writer.write("Lowest      : " + student.getLowestMarks() + "\n");
            writer.write("Grade       : " + student.getGrade() + "\n");

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}