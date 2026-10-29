package block6;

// Задача 6.2 ★★ Шаги за неделю — условие в tasks/block-6-debug.md
public class Task02 {

    public static void main(String[] args) {
        int[] steps = {8200, 12500, 6400, 10000, 15300, 3100, 11800};
        int goal = 10000;

        int total = 0;
        int goalDays = 0;
        for (int i = 0; i < steps.length; i++) {
            total = steps[i];
            if (steps[i] >= goal) {
                goalDays++;
            }
        }

        System.out.println("Всего шагов: " + total);
        System.out.println("Дней с целью: " + goalDays);
        System.out.println("В среднем за день: " + total / steps.length);
    }

    // Ответ (строки — по заготовке до исправления):
    // Где впервые расходится:
    // Исправление:
}
