import java.awt.*;
import javax.swing.*;

public class StudentDashboard extends JFrame {
    public StudentDashboard() {
        setTitle("Student Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton viewAttendanceButton = new JButton("View Attendance");
        JButton viewMarksButton = new JButton("View Marks");
        JButton updateProfileButton = new JButton("Update Profile");

        viewAttendanceButton.addActionListener(e -> viewAttendance());
        viewMarksButton.addActionListener(e -> viewMarks());
        updateProfileButton.addActionListener(e -> updateProfile());

        add(viewAttendanceButton);
        add(viewMarksButton);
        add(updateProfileButton);
    }

    private void viewAttendance() {
        // Logic to view attendance
        JOptionPane.showMessageDialog(this, "Viewing Attendance");
    }

    private void viewMarks() {
        // Logic to view marks
        JOptionPane.showMessageDialog(this, "Viewing Marks");
    }

    private void updateProfile() {
        // Logic to update profile
        JOptionPane.showMessageDialog(this, "Updating Profile");
    }
}
