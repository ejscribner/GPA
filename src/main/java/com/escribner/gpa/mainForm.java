package com.escribner.gpa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {
    private JPanel mainPanel;
    private JButton submit;
    private JTextField grade1;
    private JTextField cred1;
    private JTextField grade2;
    private JTextField grade3;
    private JTextField cred2;
    private JTextField cred3;
    private JTextField grade4;
    private JTextField grade5;
    private JTextField cred4;
    private JTextField cred5;
    private JTextField cred6;
    private JTextField cred7;
    private JTextField grade6;
    private JTextField grade7;

    public mainForm() {
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String myCred = cred1.getText();
                String[] grades = {grade1.getText(), grade2.getText(), grade3.getText(), grade4.getText(), grade5.getText(), grade6.getText(), grade7.getText()};
                //int intCred = Integer.parseInt(myCred);
                double myGPA = avgGPA(grades);
                myGPA = Math.round(myGPA*100.00);
                myGPA = myGPA/100.00;
                JOptionPane.showMessageDialog(null, "Your GPA is: " + myGPA);
            }
        });
    }

    public static double avgGPA(String[] grades) {
        double sum = 0;
        double counts = 0;
        double avg;
        for(int j = 0; j < grades.length; j++) {
            String currGrade = grades[j];
            Double currGradeNum = letToNum(currGrade);
            if(currGradeNum != -40.0) {
                for (int i = 0; i < grades.length; i++) {
                    sum += currGradeNum;
                    counts++;
                }
            }
        }
        avg = sum/counts;
        return avg;
    }

    public static double letToNum(String grade) {
        double numGrade = 0;
        if(grade.equalsIgnoreCase("A")) {
            numGrade = 4.0;
        }else if(grade.equalsIgnoreCase("A-")) {
            numGrade = 3.7;
        }else if(grade.equalsIgnoreCase("B+")) {
            numGrade = 3.3;
        }else if(grade.equalsIgnoreCase("B")) {
            numGrade = 3.0;
        }else if(grade.equalsIgnoreCase("B-")) {
            numGrade = 2.7;
        }else if(grade.equalsIgnoreCase("C+")) {
            numGrade = 2.3;
        }else if(grade.equalsIgnoreCase("C")) {
            numGrade = 2.0;
        }else if(grade.equalsIgnoreCase("C-")) {
            numGrade = 1.7;
        }else if(grade.equalsIgnoreCase("D+")) {
            numGrade = 1.3;
        }else if(grade.equalsIgnoreCase("D")) {
            numGrade = 1.0;
        }else if(grade.equalsIgnoreCase("D-")) {
            numGrade = 0.7;
        }else if(grade.equalsIgnoreCase("F")) {
            numGrade = 0.0;
        }else {
            numGrade = -40.0;
        }

        return numGrade;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("frame");
        frame.setContentPane(new mainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

