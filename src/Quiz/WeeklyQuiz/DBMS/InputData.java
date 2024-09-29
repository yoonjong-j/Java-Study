package Quiz.WeeklyQuiz.DBMS;

import java.util.Scanner;

public class InputData {
    private String jdbc_url;
    private String jdbc_driver;
    private String usr;
    private String pw;

    InputData() {
        this.jdbc_url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        this.jdbc_driver = "com.mysql.cj.jdbc.Driver";
        this.usr = "root";

        Scanner sc = new Scanner(System.in);
        System.out.print("PW 입력 : ");
        this.pw = sc.next();
        sc.close();
    }

    public String getJdbc_url() {
        return this.jdbc_url;
    }

    public String getJdbc_driver() {
        return this.jdbc_driver;
    }

    public String getUsername() {
        return this.usr;
    }

    public String getPassword() {
        return this.pw;
    }
}
