package Quiz.WeeklyQuiz.Interface;

public class Cart {
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        return 0;
    }

    public static void main(String[] args) {

    }
}
