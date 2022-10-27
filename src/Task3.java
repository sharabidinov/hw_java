// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 10; i < 121; i++) {
            linkedList.add(i);
        }

        for (Integer integer : linkedList) {
            result += integer;
        }

        System.out.println(result);
    }
}
