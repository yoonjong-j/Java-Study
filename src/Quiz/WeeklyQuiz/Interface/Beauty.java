package Quiz.WeeklyQuiz.Interface;

public class Beauty extends Product {
    private int discountAmount; // Beauty 할인 가격

    Beauty(String name, int price, int weight) {
        super(name, price, weight);
        this.discountAmount = 10_000; // Beauty 할인 가격 초기화
    }

    // Beauty 할인 가격 반환
    public int getDiscountAmount() {
        int result = (this.getWeight() / 2) * this.discountAmount;
        return result;
    }
}
