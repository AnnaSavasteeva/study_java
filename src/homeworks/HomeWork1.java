package homeworks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class HomeWork1 {

    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 9, 0, 2, 8, 0, 9);
        HashMap<Integer, Integer> map = createMap(numbers);
        printMap(map);
    }

    private static <T> void printMap(HashMap<T, Integer> map) {
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            System.out.printf("Количество '%b': %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static <T>HashMap<T, Integer> createMap(List<T> dataList) {
        HashMap<T, Integer> map = new HashMap<>();
        for (int i = 0; i < dataList.size(); i++) {
            T key = dataList.get(i);
            if (!map.containsKey(key)) {
                Integer count = 1;
                for (int j = i + 1; j < dataList.size(); j++) {
                    if (key.equals(dataList.get(j))) count++;
                }
                map.put(key, count);
            }
        }
        return map;
    }
}
