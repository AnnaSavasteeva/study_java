package homeworks.hw3;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> numbersLst = asList(5, 99, 2, 124, -7, 11, 0, 1036, 344, -2057);
        List<String> stringLst = asList("Москва", "Казань", "Тверь", "Томск", "Звенигород", "Кострома", "Сочи", "Адлер");
        System.out.println(quickSort(numbersLst));
        System.out.println(quickSort(stringLst));
    }

    private static <T extends Comparable<T>> List<T> quickSort(List<T> list) {

        if (list.isEmpty()) {
            return list;
        }

        T base = list.get(0);

        List<T> left = new LinkedList<>();
        List<T> middle = new LinkedList<>();
        List<T> right = new LinkedList<>();

        for (T el : list) {
            if (el.equals(base)) {
                middle.add(el);
            } else if(el.compareTo(base) > 0) {
                right.add(el);
            } else {
                left.add(el);
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        left.addAll(middle);
        left.addAll(right);

        return left;
    }
}
