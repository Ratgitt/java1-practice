# Блок 3. Функции

После уроков 17–18. Ты умеешь писать свои функции: `public static`, тип результата, имя-глагол, параметры, `return`.
Циклов ещё нет — все задачи решаются без них.

- **Функция возвращает, `main` печатает.** Внутри функций `System.out.println` не пиши.
- **Сигнатура — точно как в условии.** Свои вспомогательные функции добавлять можно.
- Функция может вызывать другую функцию и возвращать `double` или `String` — пишется так же, как с `int`:
  `public static String getName(...)`, `return "Итого: " + sum;`.

Решения пиши в заготовках `src/block3/TaskXX.java`.

---

## Задача 3.1 ★ Прямоугольник

*Уроки 17–18*

Даны ширина и высота прямоугольника — целые положительные числа. Выведи периметр и площадь, как в примере.
Напиши функции:

```java
public static int getPerimeter(int width, int height)
public static int getArea(int width, int height)
```

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

## Задача 3.2 ★ Расстояние

*Уроки 17–18*

Даны два целых числа — координаты двух точек на прямой. Выведи расстояние между ними. Напиши функции:

```java
public static int getAbs(int number)
public static int getDistance(int a, int b)
```

`getAbs` возвращает число без знака: `-5` → `5`, `5` → `5`. `getDistance` вызывает `getAbs`.

**Пример 1**

```text
> 2
> 7
5
```

**Пример 2**

```text
> 4
> -3
7
```

---

## Задача 3.3 ★★ Средняя температура

*Уроки 17–18*

Даны четыре целых числа — температура утром, днём, вечером и ночью. Выведи среднюю температуру точно, с дробной частью.
Напиши функцию:

```java
public static double getAverage(int a, int b, int c, int d)
```

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

---

## Задача 3.4 ★★ Предскажи вывод: функции

*Уроки 17–18*

Замени содержимое класса в заготовке этим кодом. **Не запуская**, напиши рядом с каждым `println` в комментарии,
что он выведет. Потом запусти и сверь; где ошибся — допиши, почему на самом деле так.

```java
public static void main(String[] args) {
    int a = 3;
    int b = 4;
    System.out.println(getDifference(a, b));
    System.out.println(getDifference(b, a));
    square(10);
    System.out.println(square(square(2)));
    System.out.println(sumOfSquares(a, b));
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

public static double half(int number) {
    return number / 2;
}

public static boolean isBig(int number) {
    return number > 10;
}
```

Отдельно ответь: почему строка `square(10);` ничего не выводит?

---

## Задача 3.5 ★★ Счастливые билеты подряд

*Уроки 17–18, продолжение задачи 1.7*

Билет из шести цифр счастливый, если сумма первых трёх цифр равна сумме последних трёх. Дан номер билета
от 0 до 999998 (`001010` вводится как `1010`). Выведи, счастливый ли этот билет и следующий за ним. Напиши функции:

```java
public static int getDigitSum(int number)
public static boolean isLucky(int ticket)
```

`getDigitSum` возвращает сумму цифр числа от 0 до 999. `isLucky` вызывает `getDigitSum` для каждой половины номера.

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

## Задача 3.6 ★★★ Будильник

*Уроки 17–18, приём из задачи 2.4*

Даны текущее время (час от 0 до 23 и минута) и сколько минут длится сон (0 и больше). Выведи время звонка будильника
в формате `ЧЧ:ММ` — всегда двумя цифрами: `07:05`, а не `7:5`. Напиши функции:

```java
public static String formatTwoDigits(int number)
public static String getWakeUpTime(int hour, int minute, int sleepMinutes)
```

`formatTwoDigits` возвращает число от 0 до 59 двумя цифрами: `5` → `"05"`. `getWakeUpTime` вызывает `formatTwoDigits`.
Проверь переход через полночь, сон дольше суток и `0` минут сна.

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

---

## Задача 3.7 ★★★ Подъезд и этаж

*Уроки 17–18*

В доме одинаковые подъезды по `floors` этажей, на каждом этаже `flatsPerFloor` квартир. Квартиры пронумерованы с единицы:
сначала первый подъезд снизу вверх, потом второй и так далее. Даны `floors`, `flatsPerFloor` и номер квартиры —
целые положительные числа. Выведи подъезд и этаж. Напиши функции:

```java
public static int getEntrance(int flat, int floors, int flatsPerFloor)
public static int getFloor(int flat, int floors, int flatsPerFloor)
```

Проверь первую и последнюю квартиру подъезда и этажа, одноэтажный дом.

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
