package Quiz.WeeklyQuiz.DBMS;

public class Students {
    private String name;
    private int age;
    private String address;

    Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }
}
