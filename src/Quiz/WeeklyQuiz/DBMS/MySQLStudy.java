package Quiz.WeeklyQuiz.DBMS;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLStudy {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        List<Students> students = new ArrayList<Students>();
        Connection connect = null;
        Statement state = null;
        ResultSet rSet = null;
        String sql = "";
        String name = "";
        String address = "";
        int age = 0;

        try {
            Class.forName(inputData.getJdbc_driver());
            connect = DriverManager.getConnection(inputData.getJdbc_url(), inputData.getUsername(), inputData.getPassword());
            state = connect.createStatement();
            sql = "SELECT name, age, address FROM students WHERE age BETWEEN 30 AND 39;";
            rSet = state.executeQuery(sql);

            while (rSet.next()) {
                name = rSet.getString("name");
                age = rSet.getInt("age");
                address = rSet.getString("address");
                students.add(new Students(name, age, address));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rSet.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (Students std : students) {
            System.out.println("이름: " + std.getName() + ", 나이: " + std.getAge() + ", 주소: " + std.getAddress());
        }
    }
}
