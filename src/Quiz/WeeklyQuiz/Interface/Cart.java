package Quiz.WeeklyQuiz.Interface;

public class Cart {
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
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
            totalPrice += product.getPrice() - product.getDiscountAmount();
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

        if (totalPrice >= 30_000 && totalPrice < 100_000) {
            totalCharge -= 1000;
        }
        else if (totalPrice >= 100_000) {
            totalCharge = 0;
        }
        else {
            // 배송비 변화 없음
        }

        return totalCharge;
    }

    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 30_000, 2);
        Product grocery = new Grocery("grocery", 20_000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliacne", 50_000, 5);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println("배송비 : " + totalDeliveryCharge); // 배송비 : 9000
    }
}
