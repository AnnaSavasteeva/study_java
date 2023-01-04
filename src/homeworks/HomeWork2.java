package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте число дисков: ");
        int n = sc.nextInt();
        List<Integer> listA = fillList(n);
        hanoi(n, 'A', 'B', 'C');
    }

    private static void hanoi(int n, char bar1, char bar2, char bar3) {
        String msg = getMsg(n, bar1, bar3);
        if (n == 1) {
            System.out.println(msg);
            return;
        }
        hanoi(n - 1, bar1, bar3, bar2);
        System.out.println(msg);
        hanoi(n - 1, bar2, bar1, bar3);
    }

    private static String getMsg(int n, char c1, char c2) {
        return format("Диск %d из %c на %c", n, c1, c2);
    }

    private static List<Integer> fillList(Integer n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }
}
