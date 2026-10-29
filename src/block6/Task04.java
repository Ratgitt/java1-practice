package block6;

// Задача 6.4 ★★★ Ударный режим — условие в tasks/block-6-debug.md
public class Task04 {

    public static void main(String[] args) {
        int[][] logs = {
                {30, 15, 0, 20, 25, 40, 0, 0, 10},
                {0, 10, 0, 5, 15, 20, 30},
                {20, 20, 20, 20, 20},
                {0, 0, 0}
        };
        for (int i = 0; i < logs.length; i++) {
            System.out.println("Ученик " + (i + 1) + ": " + getLongestStreak(logs[i]));
        }
    }

    // Самая длинная серия дней подряд, когда занимался (больше 0 минут)
    public static int getLongestStreak(int[] minutes) {
        int longest = 0;
        int current = 0;
        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] > 0) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 0;
            }
        }
        return longest;
    }

    // Ответ (строки — по заготовке до исправления):
    // Где впервые расходится:
    // Исправление:
}
