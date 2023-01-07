package lessons;

import java.util.List;

public class Lesson3 {

    public static void main(String[] args) {
        List<Character> list = List.of('a', 'b', 'c', 'd');
        System.out.println(list);
//        Добавить или удалить элемент из коллекции, созданной с помощью метода of() (а также copyOf()), нельзя,
//        т.к. этот метод создает неизменяемый (unmodifiable) список.
//        Вместо добавления/удаления элемента получим UnsupportedOperationException
        list.add('e');
        list.remove(list.size() - 1);
    }
}
