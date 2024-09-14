package Quiz.WeeklyQuiz.Interface;

public class Grocery extends Product {
    private int discountAmount; // Grocery 할인 가격

    Grocery(String name, int price, int weight) {
        super(name, price, weight);
        this.discountAmount = 2000; // Grocery 할인 가격 초기화
    }

    // Grocery 할인 가격 반환
    public int getDiscountAmount() {
        int result = (this.getWeight() / 3) * this.discountAmount;
        return result;
    }
}
