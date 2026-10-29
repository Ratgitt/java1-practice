package block6;

// Задача 6.7 ★★★ Нули в конец — условие в tasks/block-6-debug.md
public class Task07 {

    public static void main(String[] args) {
        int[] values = {0, 3, 0, 0, 7, 1, 0, 5};

        int writeIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != 0) {
                values[writeIndex] = values[i];
                writeIndex++;
            }
        }
        for (int i = writeIndex; i < values.length; i++) {
            values[i] = 0;
        }

        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Ответы:
    // 1. Таблица по итерациям первого цикла (i, values[i], writeIndex до и после, массив после):
    // 2. Может ли writeIndex стать больше i? Почему запись в values[writeIndex] не портит непросмотренные числа:
    // 3. Массив сразу после первого цикла и зачем нужен второй цикл:
    // 4. Почему второй цикл начинается с writeIndex:
    // 5. Что происходит на массиве {4, 2, 9}:
}
