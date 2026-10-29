package block6;

// Задача 6.5 ★★★★ Симметричный массив — условие в tasks/block-6-debug.md
public class Task05 {

    public static void main(String[] args) {
        int[][] tests = {
                {1, 2, 3, 2, 1},
                {4, 7, 7, 4},
                {5, 1, 2, 5},
                {6, 9},
                {8},
                {1, 2, 3, 2, 9}
        };
        for (int i = 0; i < tests.length; i++) {
            System.out.println("Массив " + (i + 1) + ": " + isSymmetric(tests[i]));
        }
    }

    // Симметричный — читается одинаково слева направо и справа налево
    public static boolean isSymmetric(int[] values) {
        for (int i = 1; i < values.length / 2; i++) {
            if (values[i] != values[values.length - i]) {
                return false;
            }
        }
        return true;
    }

    // Ответ (строки — по заготовке до исправления):
    // Ошибка 1 (где) и исправление:
    // Что стало после исправления только её:
    // Ошибка 2 (где) и исправление:
}
