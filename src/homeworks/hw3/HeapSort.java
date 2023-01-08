package homeworks.hw3;

import static java.util.Arrays.stream;

public class HeapSort {

    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr);
        stream(arr).forEach(el -> System.out.printf("%d ", el));
    }

    private static void sort(Integer[] arr) {
        int count = arr.length;
        heapify(arr, count);
        int end = count - 1;
        while (end > 0) {
            Integer tmp = arr[end];
            arr[end] = arr[0];
            arr[0] = tmp;
            siftDown(arr, 0, end - 1);
            end--;
        }
    }

    private static void heapify(Integer[] a, int count) {
        int start = (count - 2) / 2;
        while(start >= 0) {
            siftDown(a, start, count - 1);
            start--;
        }
    }

    private static void siftDown(Integer[] arr, int start, int end) {
        int root = start;
        while((root * 2 + 1) <= end) {
            int child = root * 2 + 1;
            if (child + 1 <= end && arr[child] < arr[child + 1]) {
                child = child + 1;
            }
            if (arr[root] < arr[child]) {
                Integer tmp = arr[root];
                arr[root] = arr[child];
                arr[child] = tmp;
                root = child;
            } else {
                return;
            }
        }
    }
}
