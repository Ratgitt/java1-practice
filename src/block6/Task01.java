package block6;

import java.util.Scanner;

// Задача 6.1 ★ Кофейня — условие в tasks/block-6-debug.md
public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffees = scanner.nextInt();
        int croissants = scanner.nextInt();

        int coffeePrice = 180;
        int croissantPrice = 120;
        int sum = coffees * coffeePrice + croissants * croissantPrice;

        int discount = 0;
        if (sum >= 1000) {
            discount = sum / 100 * 10;
        }
        int total = sum - discount;
        System.out.println("К оплате: " + total);
    }

    // Ответ (строки — по заготовке до исправления):
    // Где впервые расходится:
    // Исправление:
}
