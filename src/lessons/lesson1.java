package lessons;

import java.util.Scanner;

public class lesson1 {

    public static void main(String[] args) {
//        Определение типа
        Integer integer = 11111;
        System.out.println(integer.getClass().getSimpleName());

//        Очередность декремента: постфиксный и префиксный
        int n1 = 123;
        var d1 = n1-- - --n1;
        int n2 = 123;
        int d2 = --n2 - --n2;
        System.out.println(d1);
        System.out.println(d2);

//        Проверка типа вводимых с консоли данных
        Scanner sc = new Scanner(System.in);
        System.out.print("age: ");
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            System.out.printf("Your age is %d!%n", age);
        }
        sc.close();

//        Конкатенация строк
//        Это опасная очень операция, которая может дать сильную просадку по производительности (не только в Java):
//        - str - одна строка
//        - в процессе конкатенации n неявно преобразуется во вторую строку и где-то хранится в памяти
//        - выражение str + n дает третью временную строку, хранящуюся где-то в памяти
//        - res - результат конкатенации, четвертая строка, полученная из временной памяти
        String str = "abc";
        int n = 123;
        String res = str + n;
        System.out.println(res);

//       Форматирование строк
        int a = 1, b = 2;
        int c = a + b;
        String strF = String.format("%d + %d = %d%n", a, b, c);
        System.out.print(strF);
        System.out.printf("%d + %d = %d%n", a, b, c);

//        Область видимости переменных
//        int x = 35; // при объявлении x выше {} ее нельзя объявить внутри {}
//        Это относится только к вот таким отдельным блокам кода
        {
            int x = 47;
            System.out.println(x);
        }
        int x = 35;
    }
}
