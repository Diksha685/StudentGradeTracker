import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentGradeTrackerGUI extends JFrame implements ActionListener {

    // ====================== Labels ======================

    JLabel titleLabel;

    JLabel nameLabel;
    JLabel rollLabel;

    JLabel sub1Label;
    JLabel sub2Label;
    JLabel sub3Label;
    JLabel sub4Label;
    JLabel sub5Label;

    JLabel totalLabel;
    JLabel averageLabel;
    JLabel percentageLabel;
    JLabel highestLabel;
    JLabel lowestLabel;
    JLabel gradeLabel;
    JLabel resultLabel;

    JLabel totalValue;
    JLabel averageValue;
    JLabel percentageValue;
    JLabel highestValue;
    JLabel lowestValue;
    JLabel gradeValue;
    JLabel resultValue;

    // ====================== TextFields ======================

    JTextField nameField;
    JTextField rollField;

    JTextField sub1Field;
    JTextField sub2Field;
    JTextField sub3Field;
    JTextField sub4Field;
    JTextField sub5Field;

    // ====================== Buttons ======================

    JButton calculateButton;
    JButton clearButton;
    JButton saveButton;
    JButton exitButton;

    JPanel resultPanel;

    public StudentGradeTrackerGUI() {

        setTitle("Student Grade Tracker");

        setSize(950,700);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        getContentPane().setBackground(new Color(240,248,255));

        // ====================== TITLE ======================

        titleLabel = new JLabel("STUDENT GRADE TRACKER");

        titleLabel.setBounds(220,20,500,40);

        titleLabel.setFont(new Font("Arial",Font.BOLD,30));

        titleLabel.setForeground(new Color(0,70,140));

        add(titleLabel);

        // ====================== STUDENT DETAILS ======================

        nameLabel = new JLabel("Student Name");

        nameLabel.setBounds(60,100,150,30);

        nameLabel.setFont(new Font("Arial",Font.BOLD,16));

        add(nameLabel);

        nameField = new JTextField();

        nameField.setBounds(220,100,220,30);

        add(nameField);

        rollLabel = new JLabel("Roll Number");

        rollLabel.setBounds(60,150,150,30);

        rollLabel.setFont(new Font("Arial",Font.BOLD,16));

        add(rollLabel);

        rollField = new JTextField();

        rollField.setBounds(220,150,220,30);

        add(rollField);

        sub1Label = new JLabel("Subject 1");

        sub1Label.setBounds(60,220,150,30);

        sub1Label.setFont(new Font("Arial",Font.BOLD,16));

        add(sub1Label);

        sub1Field = new JTextField();

        sub1Field.setBounds(220,220,120,30);

        add(sub1Field);

        sub2Label = new JLabel("Subject 2");

        sub2Label.setBounds(60,270,150,30);

        sub2Label.setFont(new Font("Arial",Font.BOLD,16));

        add(sub2Label);

        sub2Field = new JTextField();

        sub2Field.setBounds(220,270,100,30);

        add(sub2Field);

        sub3Label = new JLabel("Subject 3");

        sub3Label.setBounds(60,320,150,30);

        sub3Label.setFont(new Font("Arial",Font.BOLD,16));

        add(sub3Label);

        sub3Field = new JTextField();

        sub3Field.setBounds(220,320,100,30);

        add(sub3Field);

        sub4Label = new JLabel("Subject 4");

        sub4Label.setBounds(60,370,150,30);

        sub4Label.setFont(new Font("Arial",Font.BOLD,16));

        add(sub4Label);

        sub4Field = new JTextField();

        sub4Field.setBounds(220,370,100,30);

        add(sub4Field);

        sub5Label = new JLabel("Subject 5");

        sub5Label.setBounds(60,420,150,30);

        sub5Label.setFont(new Font("Arial",Font.BOLD,16));

        add(sub5Label);

        sub5Field = new JTextField();

        sub5Field.setBounds(220,420,100,30);

        add(sub5Field);

        // ====================== RESULT PANEL ======================

        resultPanel = new JPanel();

        resultPanel.setLayout(null);

        resultPanel.setBounds(520,100,350,420);

        resultPanel.setBackground(new Color(225,240,255));

        resultPanel.setBorder(BorderFactory.createTitledBorder("RESULT"));

        add(resultPanel);

                // ====================== TOTAL ======================

        totalLabel = new JLabel("Total Marks");
        totalLabel.setBounds(20,40,120,30);
        totalLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(totalLabel);

        totalValue = new JLabel("-");
        totalValue.setBounds(180,40,120,30);
        totalValue.setFont(new Font("Arial",Font.PLAIN,16));
        resultPanel.add(totalValue);

        // ====================== AVERAGE ======================

        averageLabel = new JLabel("Average");
        averageLabel.setBounds(20,90,120,30);
        averageLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(averageLabel);

        averageValue = new JLabel("-");
        averageValue.setBounds(180,90,120,30);
        averageValue.setFont(new Font("Arial",Font.PLAIN,16));
        resultPanel.add(averageValue);

        // ====================== PERCENTAGE ======================

        percentageLabel = new JLabel("Percentage");
        percentageLabel.setBounds(20,140,120,30);
        percentageLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(percentageLabel);

        percentageValue = new JLabel("-");
        percentageValue.setBounds(180,140,120,30);
        percentageValue.setFont(new Font("Arial",Font.PLAIN,16));
        resultPanel.add(percentageValue);

        // ====================== HIGHEST ======================

        highestLabel = new JLabel("Highest");
        highestLabel.setBounds(20,190,120,30);
        highestLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(highestLabel);

        highestValue = new JLabel("-");
        highestValue.setBounds(180,190,120,30);
        highestValue.setFont(new Font("Arial",Font.PLAIN,16));
        resultPanel.add(highestValue);

        // ====================== LOWEST ======================

        lowestLabel = new JLabel("Lowest");
        lowestLabel.setBounds(20,240,120,30);
        lowestLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(lowestLabel);

        lowestValue = new JLabel("-");
        lowestValue.setBounds(180,240,120,30);
        lowestValue.setFont(new Font("Arial",Font.PLAIN,16));
        resultPanel.add(lowestValue);

        // ====================== GRADE ======================

        gradeLabel = new JLabel("Grade");
        gradeLabel.setBounds(20,290,120,30);
        gradeLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(gradeLabel);

       gradeValue = new JLabel("-");
        gradeValue.setBounds(180,290,120,30);
        gradeValue.setFont(new Font("Arial",Font.BOLD,20));
        gradeValue.setForeground(Color.RED);
        resultPanel.add(gradeValue);

        // ====================== RESULT ======================

        resultLabel = new JLabel("Result");
        resultLabel.setBounds(20,340,120,30);
        resultLabel.setFont(new Font("Arial",Font.BOLD,16));
        resultPanel.add(resultLabel);

        resultValue = new JLabel("-");
        resultValue.setBounds(180,340,120,30);
        resultValue.setFont(new Font("Arial",Font.BOLD,20));
        resultPanel.add(resultValue);

        // ====================== BUTTONS ======================

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150,560,120,40);
        calculateButton.addActionListener(this);
        add(calculateButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(300,560,120,40);
        clearButton.addActionListener(this);
        add(clearButton);

        saveButton = new JButton("Save");
        saveButton.setBounds(450,560,120,40);
        saveButton.addActionListener(this);
        add(saveButton);

        exitButton = new JButton("Exit");
        exitButton.setBounds(600,560,120,40);
        exitButton.addActionListener(this);
        add(exitButton);

        setVisible(true);

    }

    @Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == calculateButton) {

        try {

            String name = nameField.getText().trim();
            String roll = rollField.getText().trim();

            if (name.isEmpty() || roll.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please enter Student Name and Roll Number.");
                return;
            }

            int s1 = Integer.parseInt(sub1Field.getText().trim());
            int s2 = Integer.parseInt(sub2Field.getText().trim());
            int s3 = Integer.parseInt(sub3Field.getText().trim());
            int s4 = Integer.parseInt(sub4Field.getText().trim());
            int s5 = Integer.parseInt(sub5Field.getText().trim());

            if (!GradeCalculator.areAllMarksValid(s1, s2, s3, s4, s5)) {

                JOptionPane.showMessageDialog(this,
                        "Marks should be between 0 and 100.");

                return;
            }

            Student student = new Student(
                    name,
                    roll,
                    s1,
                    s2,
                    s3,
                    s4,
                    s5
            );

            int total = student.getTotalMarks();

            double average = student.getAverage();

            double percentage = student.getPercentage();

            int highest = student.getHighestMarks();

            int lowest = student.getLowestMarks();

            String grade = student.getGrade();

            String result = GradeCalculator.getResult(
                    s1, s2, s3, s4, s5
            );

           totalValue.setText(String.valueOf(total));

averageValue.setText(String.format("%.2f", average));

percentageValue.setText(String.format("%.2f %%", percentage));

highestValue.setText(String.valueOf(highest));

lowestValue.setText(String.valueOf(lowest));

// Grade
gradeValue.setText(grade);

if (grade.equals("A+")) {
    gradeValue.setForeground(new Color(0, 128, 0));
}
else if (grade.equals("A")) {
    gradeValue.setForeground(new Color(0, 102, 204));
}
else if (grade.equals("B")) {
    gradeValue.setForeground(new Color(255, 140, 0));
}
else {
    gradeValue.setForeground(Color.RED);
}

// Result
resultValue.setText(result);

if (result.equals("PASS")) {
    resultValue.setForeground(new Color(0, 128, 0));
}
else {
    resultValue.setForeground(Color.RED);
}

        }
        catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this,
                    "Please enter valid numeric marks.");

        }

    }

    else if (e.getSource() == clearButton) {

        nameField.setText("");
        rollField.setText("");

        sub1Field.setText("");
        sub2Field.setText("");
        sub3Field.setText("");
        sub4Field.setText("");
        sub5Field.setText("");

        totalValue.setText("-");
        averageValue.setText("-");
        percentageValue.setText("-");
        highestValue.setText("-");
        lowestValue.setText("-");
        gradeValue.setText("-");
        resultValue.setText("-");

    }

    else if (e.getSource() == exitButton) {

        System.exit(0);

    }

    else if (e.getSource() == saveButton) {

    try {

        Student student = new Student(

                nameField.getText(),

                rollField.getText(),

                Integer.parseInt(sub1Field.getText()),

                Integer.parseInt(sub2Field.getText()),

                Integer.parseInt(sub3Field.getText()),

                Integer.parseInt(sub4Field.getText()),

                Integer.parseInt(sub5Field.getText())

        );

        FileManager.saveReport(student);

        JOptionPane.showMessageDialog(this,
                "Report Saved Successfully!");

    }
    catch (Exception ex) {

        JOptionPane.showMessageDialog(this,
                "Please calculate and enter valid data first.");

    }

}
}
}
