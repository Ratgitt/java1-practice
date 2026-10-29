package block6;

import java.util.Scanner;

// Задача 6.4 ★★ Парковка — условие в tasks/block-6-debug.md
public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = scanner.nextInt();
        int endHour = scanner.nextInt();

        int total = 0;
        for (int hour = startHour; hour < endHour; hour++) {
            total += getHourPrice(hour);
        }
        System.out.println("Стоимость: " + total);
    }

    // Цена часа, который начинается в hour:00
    public static int getHourPrice(int hour) {
        if (hour < 8) {
            return 20;
        }
        if (hour < 19) {
            return 100;
        }
        return 50;
    }

    // Ответ (номера строк — как в заготовке до исправления):
    // 1. Что вернул Evaluate (запиши выражение и результат):
    //    getHourPrice(0) =
    //    getHourPrice(7) =
    //    getHourPrice(8) =
    //    getHourPrice(12) =
    //    getHourPrice(19) =
    //    getHourPrice(20) =
    //    getHourPrice(23) =
    //    getHourPrice(18) + getHourPrice(19) + getHourPrice(20) + getHourPrice(21) =
    // 2. На каком часе функция ошибается и почему пример 1 работает правильно:
    // 3. Исправление (было → стало):
}
