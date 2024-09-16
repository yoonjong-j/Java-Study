package Quiz.WeeklyQuiz.Interface;

public class Cart {
    private Product[] products;
    private int totalAmount; // 상품 최종 가격
    private int deliverycharge; // 상품 배송비

    Cart(Product[] products) {
        this.products = products;
        this.totalAmount = 0;
        this.deliverycharge = 0;
    }

    // 배송비 계산
    int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;
        int totalCharge = 0;

        for (Product product : this.products) {
            totalWeight += product.getWeight();
        }

        for (Product product : this.products) {
            totalPrice += product.getPrice();
        }

        if (totalWeight < 3) {
            totalCharge = 1000;
        }
        else if (totalWeight >= 3 && totalWeight < 10) {
            totalCharge = 5000;
        }
        else {
            totalCharge = 10_000;
        }

        if (totalPrice < 30_000) {
            totalCharge = totalCharge;
        }
        else if (totalPrice >= 30_000 && totalPrice < 100_000) {
            totalCharge -= 1000;
        }
        else {
            totalCharge = 0;
        }

        return totalCharge;
    }

    public static void main(String[] args) {

    }
}
