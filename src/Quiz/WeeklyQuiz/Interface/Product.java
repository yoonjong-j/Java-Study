package Quiz.WeeklyQuiz.Interface;

public class Product implements Promotion {
    private String name; // 제품 이름
    private int price; // 제품 가격
    private int weight; // 제품 무게

    Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // 제품 가격 반환
    int getPrice() {
        return this.price;
    }

    // 제품 무게 반환
    int getWeight() {
        return this.weight;
    }

    // 제품 할인 가격 반환
    public int getDiscountAmount() {
        return 0;
    }
}
