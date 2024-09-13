package Quiz.WeeklyQuiz.Interface;

public class Grocery extends Product {
    private int discountAmount;

    Grocery(String name, int price, int weight) {
        super(name, price, weight);
        this.discountAmount = 2000;
    }
}
