# Практика по курсу Java-1

| Блок | После уроков | Условия |
|---|---|---|
| 0 | 1–4 | [Первая программа](tasks/block-0-start.md) |
| 1 | 5–10 | [Данные, операции, логика](tasks/block-1-data.md) |
| 2 | 11–16 | [Ветвления](tasks/block-2-branching.md) |
| 3 | 17–18 | [Функции](tasks/block-3-functions.md) |
| 4 | 20–23 | [Циклы и рекурсия](tasks/block-4-loops.md) |
| 5 | 25–28 | [Массивы](tasks/block-5-arrays.md) |
| 6 | 30 | [Отладка](tasks/block-6-debug.md) |

Сложность: ★ разминка · ★★ применение · ★★★ подумать · ★★★★ по желанию.

## Правила

- Решение — в заготовке `src/blockN/TaskXX.java`. Классы и пакеты не переименовывать.
- Только то, что было в курсе.
- Вывод — точно как в примере.
- «Предскажи вывод»: ответ в комментарии **до** запуска.
- Перед сдачей — Ctrl+Alt+L (⌥⌘L).

## Примеры

Строки с `> ` — ввод, остальное — вывод программы:

```text
> 17
> 5
22
```

## Ввод с клавиатуры

```java
import java.util.Scanner;                  // над классом

Scanner scanner = new Scanner(System.in);  // в начале main
int a = scanner.nextInt();                 // число
String word = scanner.next();              // слово
char c = scanner.next().charAt(0);         // символ
```

## Сдача

Блок = ветка `block-N` → pull request в `main`. Пошагово — [SUBMIT.md](SUBMIT.md).
