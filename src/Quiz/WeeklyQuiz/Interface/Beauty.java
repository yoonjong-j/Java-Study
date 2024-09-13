package Quiz.WeeklyQuiz.Interface;

public class Beauty extends Product {
    private int discountAmount;

    Beauty(String name, int price, int weight) {
        super(name, price, weight);
        this.discountAmount = 10000;
    }
}
