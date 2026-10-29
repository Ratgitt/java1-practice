# Блок 3. Функции

После уроков 17–18. Ты умеешь писать свои функции: `public static`, тип результата, имя-глагол, параметры
через запятую, `return`. Знаешь, что `return` должен сработать при любых значениях параметров (иначе
`missing return statement`), что `return` можно писать внутри `if` без `else`, а в `return` — тернарный оператор.
Знаешь `Math.max`. Всё из блоков 1–2 тоже в деле: ветвления, `switch`, склейка строк.

Важно для этого блока:

- **Циклов ещё нет** — они в уроках 20–21. Все задачи решаются без них.
- **Функция возвращает, `main` печатает.** Внутри функций `System.out.println` не пиши: функция вычисляет
  и отдаёт результат через `return`, а `main` читает ввод и выводит. Так советует автор курса.
- **Сигнатура — точно как в условии:** то же имя, те же типы и порядок параметров, тот же тип результата.
  Если хочешь — добавляй свои вспомогательные функции.
- Функции пиши в том же классе, рядом с `main` (выше или ниже — не важно).
- **Функция может вызывать другую функцию.** В уроке автор только говорил об этом — здесь будешь делать.
- **Функция может возвращать `String`.** В уроке 17 это тоже было только на словах. Пишется так же, как с `int`:
  `public static String getName(...)`, а в `return` — строка или склейка, например `return "Итого: " + sum;`.

Решения пиши в заготовках `src/block3/TaskXX.java`.

---

## Задача 3.1 ★ Прямоугольник

*Уроки 17–18*

Пользователь вводит ширину и высоту прямоугольника — целые положительные числа. Напиши две функции:

```java
public static int getPerimeter(int width, int height)
public static int getArea(int width, int height)
```

Первая возвращает периметр, вторая — площадь. В `main` выведи оба результата, как в примере.

**Пример 1**

```text
> 5
> 3
Периметр: 16
Площадь: 15
```

**Пример 2**

```text
> 7
> 7
Периметр: 28
Площадь: 49
```

---

## Задача 3.2 ★ Чётное и нечётное

*Урок 17*

Напиши две функции:

```java
public static boolean isEven(int number)
public static boolean isOdd(int number)
```

`isEven` возвращает `true`, если число чётное. `isOdd` — если нечётное, причём **`isOdd` не проверяет остаток сама,
а вызывает `isEven`**. Пользователь вводит целое число, выведи результаты обеих функций.

**Пример 1**

```text
> 7
Чётное: false
Нечётное: true
```

**Пример 2**

```text
> 0
Чётное: true
Нечётное: false
```

Проверь на отрицательных числах: `-4`, `-3`.

---

## Задача 3.3 ★★ Предскажи вывод: функции

*Уроки 17–18*

Замени содержимое класса в заготовке этим кодом (`main` и функции под ним). **Не запуская**, напиши рядом с каждым
`println` в комментарии, что он выведет. Потом запусти и сверь. Где ошибся — допиши, почему на самом деле так.

```java
public static void main(String[] args) {
    int a = 3;
    int b = 4;
    System.out.println(getDifference(a, b));
    System.out.println(getDifference(b, a));
    System.out.println("Итого: " + sum(a, b));
    System.out.println("Итого: " + a + b);
    System.out.println(sum(a, b) + 10);

    square(10);
    System.out.println(square(square(2)));
    System.out.println(sumOfSquares(a, b));

    int value = 5;
    int result = doubleValue(value);
    System.out.println(value);
    System.out.println(result);

    System.out.println(half(7));
    System.out.println(isBig(sum(a, b)));
    System.out.println(isBig(square(a + b)));
}

public static int sum(int a, int b) {
    return a + b;
}

public static int getDifference(int b, int a) {
    return a - b;
}

public static int square(int x) {
    return x * x;
}

public static int sumOfSquares(int x, int y) {
    return square(x) + square(y);
}

public static int doubleValue(int value) {
    value = value * 2;
    return value;
}

public static double half(int number) {
    return number / 2;
}

public static boolean isBig(int number) {
    return number > 10;
}
```

Отдельно ответь в комментарии: что делает строка `square(10);` и почему на экране от неё ничего нет?

---

## Задача 3.4 ★★ Найди ошибки

*Уроки 17–18*

В этом коде пять ошибок — он не компилируется. Замени содержимое класса в заготовке этим кодом, найди ошибки
(IDEA подчеркнёт их красным) и исправь каждую так, чтобы смысл остался прежним: скидка — 10 %, налог — 13 %,
сумму делят поровну на четверых.

```java
public static void main(String[] args) {
    int price = 250;
    int count = 3;
    int total = getTotal(price, count);
    System.out.println("Итого: " + total);
    System.out.println("Со скидкой: " + getDiscounted(total));
    int tax = getTax(total);
    System.out.println("Налог: " + tax);
    System.out.println("С каждого: " + getShare(total, 4));
    System.out.println("Дорого: " + isExpensive(total));
}

public static int getTotal(int price, int count) {
    int total = price * count;
}

// скидка 10 %
public static int getDiscounted(int total, int percent = 10) {
    return total - total * percent / 100;
}

// налог 13 %
public static void getTax(int total) {
    System.out.println(total * 13 / 100);
}

// сколько платит каждый, если делить поровну
public static int getShare(int total, int people) {
    return (double) total / people;
}

public static boolean isExpensive(int total) {
    if (total > 500) {
        return true;
    }
}
```

Над каждой исправленной строкой напиши в комментарии, что сообщила IDEA и почему это ошибка.
После исправлений программа должна вывести ровно это:

```text
Итого: 750
Со скидкой: 675
Налог: 97
С каждого: 187.5
Дорого: true
```

---

## Задача 3.5 ★★ Средняя температура

*Уроки 17–18*

Температуру измерили четыре раза за сутки: утром, днём, вечером и ночью — получились целые числа.
Пользователь вводит эти четыре числа. Напиши функцию

```java
public static double getAverage(int a, int b, int c, int d)
```

которая возвращает среднюю температуру — точно, с дробной частью. В `main` выведи результат.

**Пример 1**

```text
> 3
> 5
> 6
> 7
5.25
```

**Пример 2**

```text
> -3
> -2
> -2
> -2
-2.25
```

**Пример 3**

```text
> 4
> 4
> 4
> 4
4.0
```

---

## Задача 3.6 ★★ Причеши функции

*Уроки 17–18*

Этот код работает правильно, но написан неуклюже. Замени содержимое класса в заготовке этим кодом и перепиши
каждую функцию короче — так, как советует автор курса:

- `if (…) return true; else return false;` и похожие конструкции — не нужны, когда можно вернуть само условие;
- переменная, которая заводится только чтобы её вернуть, — лишняя;
- `if`/`else`, который только выбирает, какое значение вернуть, — повод для тернарного оператора;
- `else` после `return` не нужен.

В функциях `isAdult`, `isWorkingDay`, `getTicketPrice`, `isOutside` должно остаться по одной строке — `return …;`.
`main` не меняй.

```java
public static void main(String[] args) {
    System.out.println(isAdult(17));
    System.out.println(isAdult(18));
    System.out.println(isWorkingDay(3));
    System.out.println(isWorkingDay(7));
    System.out.println(getTicketPrice(6));
    System.out.println(getTicketPrice(7));
    System.out.println(isOutside(0, 1, 10));
    System.out.println(isOutside(10, 1, 10));
    System.out.println(getDeliveryPrice(500));
    System.out.println(getDeliveryPrice(1000));
    System.out.println(getDeliveryPrice(3000));
}

public static boolean isAdult(int age) {
    if (age >= 18) {
        return true;
    } else {
        return false;
    }
}

// дни недели: 1 — понедельник, …, 7 — воскресенье
public static boolean isWorkingDay(int dayOfWeek) {
    boolean result;
    if (dayOfWeek == 6 || dayOfWeek == 7) {
        result = false;
    } else {
        result = true;
    }
    return result;
}

public static int getTicketPrice(int age) {
    int price;
    if (age < 7) {
        price = 0;
    } else {
        price = 300;
    }
    return price;
}

// true, если x не лежит на отрезке от from до to
public static boolean isOutside(int x, int from, int to) {
    boolean inside = from <= x && x <= to;
    if (inside == true) {
        return false;
    } else {
        return true;
    }
}

public static int getDeliveryPrice(int orderSum) {
    if (orderSum >= 3000) {
        return 0;
    } else {
        if (orderSum >= 1000) {
            return 200;
        } else {
            return 400;
        }
    }
}
```

Вывод до и после твоих правок должен быть одинаковым:

```text
false
true
true
false
0
300
true
false
400
200
0
```

---

## Задача 3.7 ★★ Найди ошибки в логике

*Уроки 17–18*

Этот код компилируется и запускается, но выводит не то. В нём четыре ошибки. Замени содержимое класса в заготовке
этим кодом, запусти и сравни вывод с правильным (он ниже). Найди и исправь ошибки; над каждым исправлением
напиши в комментарии, в чём была ошибка.

```java
public static void main(String[] args) {
    // 100 °C — это 212 °F, 2 °C — 35.6 °F
    System.out.println(toFahrenheit(100));
    System.out.println(toFahrenheit(2));
    // 120 км за 2 часа — 60 км/ч
    System.out.println(getSpeed(2, 120));
    // подросток — от 13 до 19 лет включительно
    System.out.println(isTeenager(13));
    System.out.println(isTeenager(19));
    System.out.println(isTeenager(20));
    // скидка в процентах: от 1000 ₽ — 5, от 5000 ₽ — 10, меньше 1000 ₽ — без скидки
    System.out.println(getDiscount(500));
    System.out.println(getDiscount(2000));
    System.out.println(getDiscount(7000));
}

// формула: F = C * 9 / 5 + 32
public static double toFahrenheit(int celsius) {
    return 9 / 5 * celsius + 32;
}

public static double getSpeed(int distanceKm, int hours) {
    return (double) distanceKm / hours;
}

public static boolean isTeenager(int age) {
    return 13 < age && age < 19;
}

public static int getDiscount(int purchaseSum) {
    if (purchaseSum >= 1000) {
        return 5;
    }
    if (purchaseSum >= 5000) {
        return 10;
    }
    return 0;
}
```

Правильный вывод:

```text
212.0
35.6
60.0
true
true
false
0
5
10
```

---

## Задача 3.8 ★★ Счастливые билеты подряд

*Уроки 17–18, задача 1.11*

Вспомни задачу 1.11: билет из шести цифр счастливый, если сумма первых трёх цифр равна сумме последних трёх.
Номер может начинаться с нулей (`001010` вводится как `1010`).

Теперь реши её через функции:

```java
public static int getDigitSum(int number)
public static boolean isLucky(int ticket)
```

`getDigitSum` возвращает сумму цифр числа от 0 до 999. `isLucky` проверяет билет и для этого **вызывает
`getDigitSum`** — для каждой половины номера.

Пользователь вводит номер билета (от 0 до 999998). Выведи, счастливый ли этот билет и счастливый ли следующий за ним.

**Пример 1**

```text
> 123321
Этот: true
Следующий: false
```

**Пример 2**

```text
> 10009
Этот: false
Следующий: true
```

---

## Задача 3.9 ★★★ Будильник

*Уроки 17–18*

Пользователь вводит, который сейчас час и минута (24-часовое время), и сколько минут он собирается спать.
Выведи, во сколько прозвенит будильник, в формате `ЧЧ:ММ` — часы и минуты всегда двумя цифрами: `07:05`, а не `7:5`.
Ведущий ноль ты уже делал в задаче 2.5 — теперь этот приём живёт в отдельной функции.

Напиши функции:

```java
public static String formatTwoDigits(int number)
public static String getWakeUpTime(int hour, int minute, int sleepMinutes)
```

`formatTwoDigits` получает число от 0 до 59 и возвращает его двумя цифрами: `5` → `"05"`, `42` → `"42"`.
`getWakeUpTime` возвращает время звонка уже готовой строкой и для оформления вызывает `formatTwoDigits`.

Учти: сон может перейти через полночь и даже длиться больше суток. Проверь: ровно сутки сна, `0` минут сна,
засыпание в `23:59`.

**Пример 1**

```text
> 23
> 30
> 480
07:30
```

**Пример 2**

```text
> 22
> 55
> 70
00:05
```

**Пример 3**

```text
> 9
> 0
> 5
09:05
```

---

## Задача 3.10 ★★★ Подъезд и этаж

*Уроки 17–18*

В доме несколько одинаковых подъездов. В каждом подъезде `floors` этажей, на каждом этаже `flatsPerFloor` квартир.
Квартиры пронумерованы подряд с единицы: сначала все квартиры первого подъезда снизу вверх (на первом этаже —
квартиры 1, 2, …), потом второго и так далее.

Пользователь вводит три целых положительных числа: количество этажей, количество квартир на этаже и номер квартиры.
Напиши функции:

```java
public static int getEntrance(int flat, int floors, int flatsPerFloor)
public static int getFloor(int flat, int floors, int flatsPerFloor)
```

Они возвращают номер подъезда и номер этажа, где находится квартира. Выведи их, как в примере.

Проверь первую и последнюю квартиру подъезда, первую и последнюю квартиру этажа, дом с одной квартирой на этаже
и одноэтажный дом.

**Пример 1**

```text
> 9
> 4
> 37
Подъезд: 2
Этаж: 1
```

**Пример 2**

```text
> 9
> 4
> 36
Подъезд: 1
Этаж: 9
```

**Пример 3**

```text
> 5
> 4
> 50
Подъезд: 3
Этаж: 3
```

---

## Задача 3.11 ★★★ Шахматные ходы

*Уроки 17–18*

Клетка шахматной доски задаётся двумя числами от 1 до 8: номер столбца и номер строки. Пользователь вводит
четыре числа: столбец и строку клетки, где стоит фигура, потом столбец и строку клетки, куда её хотят поставить.
Других фигур на доске нет. Выведи для ладьи, слона, ферзя и коня, может ли эта фигура пойти так за один ход.

Как ходят фигуры:

- **ладья** — на любое число клеток по вертикали или по горизонтали;
- **слон** — на любое число клеток по диагонали;
- **ферзь** — как ладья или как слон;
- **конь** — буквой «Г»: на 2 клетки в одну сторону и на 1 в перпендикулярную.

Остаться на месте — это не ход.

Напиши функции:

```java
public static int getDistance(int a, int b)
public static boolean canRookMove(int x1, int y1, int x2, int y2)
public static boolean canBishopMove(int x1, int y1, int x2, int y2)
public static boolean canQueenMove(int x1, int y1, int x2, int y2)
public static boolean canKnightMove(int x1, int y1, int x2, int y2)
public static String toYesNo(boolean value)
```

- `getDistance` — расстояние между двумя числами на числовой прямой, всегда не меньше нуля: для `2` и `5` и для `5` и `2`
  это `3`. Пригодится для слона и коня.
- `canQueenMove` **не проверяет клетки сама**, а вызывает функции ладьи и слона.
- `toYesNo` превращает `true` в `"да"`, а `false` — в `"нет"`.

**Пример 1**

```text
> 1
> 1
> 1
> 8
Ладья: да
Слон: нет
Ферзь: да
Конь: нет
```

**Пример 2**

```text
> 6
> 4
> 3
> 1
Ладья: нет
Слон: да
Ферзь: да
Конь: нет
```

**Пример 3**

```text
> 2
> 1
> 3
> 3
Ладья: нет
Слон: нет
Ферзь: нет
Конь: да
```

---

## Задача 3.12 ★★★★ Число прописью

*Уроки 15, 17–18*

Пользователь вводит целое число от 0 до 999. Выведи его словами, как его произносят: `123` → `сто двадцать три`.
Слова разделяются одним пробелом, лишних пробелов в начале, в конце и между словами нет.

Главная функция:

```java
public static String toWords(int number)
```

Одной огромной функцией не обойтись — раздели задачу на несколько своих функций, каждая отвечает за свою часть.
Проверь числа от 10 до 19, круглые десятки и сотни, ноль, числа с нулём в середине.

**Пример 1**

```text
> 123
сто двадцать три
```

**Пример 2**

```text
> 911
девятьсот одиннадцать
```

**Пример 3**

```text
> 705
семьсот пять
```

**Пример 4**

```text
> 40
сорок
```

**Пример 5**

```text
> 0
ноль
```
