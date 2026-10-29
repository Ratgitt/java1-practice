package block6;

// Задача 6.8 ★★★★ Симметричный массив — условие в tasks/block-6-debug.md
public class Task08 {

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

    // Ответ (номера строк — как в заготовке до исправления):
    // 1. Первая ошибка — строка, массив, значение i, какие элементы сравнились:
    // 2. Что стало после исправления только её и почему:
    // 3. Вторая ошибка — строка, массив, значение i:
    // 4. Почему массив 4 считался симметричным:
    // 5. Исправления (было → стало):
}
