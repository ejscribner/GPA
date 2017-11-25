/*
    Created By: Elliot J Scribner on 11/24/17
    Student ID: ejs320
    Lab #: **Num**
    mainForm: **Description**
 */

package com.gpa;

import javax.swing.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {
    private JPanel mainPanel;
    private JButton submit;
    private JTextField grade1;
    private JTextField cred1;

    public mainForm() {
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String myGrade = grade1.getText();
                String myCred = cred1.getText();
                int intCred = Integer.parseInt(myCred);
                double intGrade = letToNum(myGrade);
                double myGPA = calcGPA(intGrade, intCred);
                JOptionPane.showMessageDialog(null, "Your GPA is: " + myGPA);
            }
        });
    }

    public static double letToNum(String grade) {
        double numGrade = 0;
        if(grade.equalsIgnoreCase("A")) {
            numGrade = 4.0;
        }
        if(grade.equalsIgnoreCase("A-")) {
            numGrade = 3.7;
        }
        if(grade.equalsIgnoreCase("B+")) {
            numGrade = 3.3;
        }
        if(grade.equalsIgnoreCase("B")) {
            numGrade = 3.0;
        }
        if(grade.equalsIgnoreCase("B-")) {
            numGrade = 2.7;
        }
        if(grade.equalsIgnoreCase("C+")) {
            numGrade = 2.3;
        }
        if(grade.equalsIgnoreCase("C")) {
            numGrade = 2.0;
        }
        if(grade.equalsIgnoreCase("C-")) {
            numGrade = 1.7;
        }
        if(grade.equalsIgnoreCase("D+")) {
            numGrade = 1.3;
        }
        if(grade.equalsIgnoreCase("D")) {
            numGrade = 1.0;
        }
        if(grade.equalsIgnoreCase("D-")) {
            numGrade = 0.7;
        }
        if(grade.equalsIgnoreCase("F")) {
            numGrade = 0.0;
        }
        return numGrade;
    }

    public static double calcGPA(double grade, int creds) {
        double gpa = grade;
        return gpa;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("frame");
        frame.setContentPane(new mainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
