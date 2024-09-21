package Quiz.WeeklyQuiz.DataStructures;

public class PersonalContact extends Contact {
    private String relationship; // 관계

    PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    // 관계 반환
    public String getRelationship() {
        return this.relationship;
    }
}
