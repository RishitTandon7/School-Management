import java.awt.*;
import javax.swing.*;

public class TeacherDashboard extends JFrame {
    public TeacherDashboard() {
        setTitle("Teacher Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton markAttendanceButton = new JButton("Mark Attendance");
        JButton uploadMarksButton = new JButton("Upload Marks");
        JButton manageStudentsButton = new JButton("Manage Students");

        markAttendanceButton.addActionListener(e -> markAttendance());
        uploadMarksButton.addActionListener(e -> uploadMarks());
        manageStudentsButton.addActionListener(e -> manageStudents());

        add(markAttendanceButton);
        add(uploadMarksButton);
        add(manageStudentsButton);
    }

    private void markAttendance() {
        // Logic to mark attendance
        JOptionPane.showMessageDialog(this, "Marking Attendance");
    }

    private void uploadMarks() {
        // Logic to upload marks
        JOptionPane.showMessageDialog(this, "Uploading Marks");
    }

    private void manageStudents() {
        // Logic to manage students
        JOptionPane.showMessageDialog(this, "Managing Students");
    }
}
