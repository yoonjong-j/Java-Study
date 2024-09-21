package Quiz.WeeklyQuiz.DataStructures;

public class Contact {
    private String name;        // 이름
    private String phoneNumber; // 전화번호

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // 이름 반환
    public String getName() {
        return this.name;
    }

    // 전화번호 반환
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
