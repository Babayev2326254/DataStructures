package ManytoMany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentCourseViewer {

    public static void showAllStudentsWithCourses() {
        String sql = """
                    SELECT s.name AS student_name, c.title AS course_title
                    FROM student s
                    JOIN student_course sc ON s.id = sc.student_id
                    JOIN course c ON sc.course_id = c.id
                    ORDER BY s.name;
                """;

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("📌 Tələbə - Kurs siyahısı:");
            while (rs.next()) {
                String studentName = rs.getString("student_name");
                String courseTitle = rs.getString("course_title");
                System.out.println(studentName + " → " + courseTitle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        showAllStudentsWithCourses();
    }
}

