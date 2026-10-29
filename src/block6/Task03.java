package block6;

// Задача 6.3 ★★ Три по цене двух — условие в tasks/block-6-debug.md
public class Task03 {

    public static void main(String[] args) {
        int[] prices = {150, 320, 55, 90};
        int[] quantities = {3, 2, 6, 4};
        System.out.println("К оплате: " + getTotal(prices, quantities));
    }

    public static int getTotal(int[] prices, int[] quantities) {
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += getCost(prices[i], quantities[i]);
        }
        return total;
    }

    // Акция «3 по цене 2»: каждая третья единица одного товара бесплатно
    public static int getCost(int price, int quantity) {
        int paidQuantity = quantity / 3 * 2;
        return paidQuantity * price;
    }

    // Ответ (строки — по заготовке до исправления):
    // Где впервые расходится:
    // Исправление:
}
