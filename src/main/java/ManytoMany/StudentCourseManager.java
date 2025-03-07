package ManytoMany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCourseManager {
    public static void addStudent(String name) {
        String sql = "INSERT INTO student (name) VALUES (?)";
        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("Tələbə əlavə edildi.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addCourse(String title) {
        String sql = "INSERT INTO course (title) VALUES (?)";
        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.executeUpdate();
            System.out.println("Kurs əlavə edildi.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void enrollStudentInCourse(int studentId, int courseId) {
        String sql = "INSERT INTO student_course (student_id, course_id) VALUES (?, ?)";
        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, studentId);
            pstmt.setInt(2, courseId);
            pstmt.executeUpdate();
            System.out.println("Tələbə kursa yazıldı.");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
