package Quiz.WeeklyQuiz.DataStructures;

public class BusinessContact extends Contact {
    private String company; // 회사명

    BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    // 회사명 반환
    public String getCompany() {
        return this.company;
    }
}
