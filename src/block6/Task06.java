package block6;

// Задача 6.6 ★★★ Самый холодный день — условие в tasks/block-6-debug.md
public class Task06 {

    public static void main(String[] args) {
        int[] january = {-5, -12, 3, -8, 0};
        int[] may = {12, 18, 9, 21, 15};
        int[] oneDay = {7};
        System.out.println("Январь: " + getMin(january, 0));
        System.out.println("Май: " + getMin(may, 0));
        System.out.println("Один день: " + getMin(oneDay, 0));
    }

    // Минимум среди элементов массива с индекса from и до конца
    public static int getMin(int[] values, int from) {
        if (from == values.length) {
            return 0;
        }
        return Math.min(values[from], getMin(values, from + 1));
    }

    // Ответ (номера строк — как в заготовке до исправления):
    // 1. Фреймы в Frames в самом глубоком вызове для мая — сверху вниз, со значением from в каждом:
    // 2. В каком вызове (значение from) функция впервые вернула не то, что должна, и что вернула:
    // 3. Почему январь считается правильно:
    // 4. Исправление (было → стало):
}
