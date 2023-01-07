package homeworks.hw2;

import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class HomeWork2 {

    public static void main(String[] args) {
        Bar barA = new Bar('A');
        Bar barB = new Bar('B');
        Bar barC = new Bar('C');

        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте число дисков: ");
        int n = sc.nextInt();
        barA.fillBar(n);

        printAllBars(barA, barB, barC);
        System.out.println("--------");

        hanoi(n, barA, barB, barC);

        System.out.println("--------");
        printAllBars(barA, barB, barC);
    }

    private static void hanoi(int n, Bar bar1, Bar bar2, Bar bar3) {
        String msg = getMsg(n, bar1.getBarName(), bar3.getBarName());
        List<Integer> disksA = bar1.getDisks();
        List<Integer> disksC = bar3.getDisks();
        if (n == 1) {
            disksC.add(disksA.get(disksA.size() - 1));
            disksA.remove(disksA.get(disksA.size() - 1));
            System.out.println(msg);
            return;
        }
        hanoi(n - 1, bar1, bar3, bar2);
        disksC.add(disksA.get(disksA.size() - 1));
        disksA.remove(disksA.get(disksA.size() - 1));
        System.out.println(msg);
        hanoi(n - 1, bar2, bar1, bar3);
    }

    private static String getMsg(int n, char c1, char c2) {
        return format("Диск %d из %c на %c", n, c1, c2);
    }

    private static void printBar(Bar bar) {
        System.out.println("Стержень " + bar.getBarName() + ": " + bar.getDisks());
    }

    private static void printAllBars(Bar bar1, Bar bar2, Bar bar3) {
        printBar(bar1);
        printBar(bar2);
        printBar(bar3);
    }
}
