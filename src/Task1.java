import java.util.LinkedList;
import java.util.Objects;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
// вернет “перевернутый” список.

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int num = 1;
        for (int i = 0; i < 40; i++) {
            linkedList.add(num++);
        }
        System.out.println(reverse(linkedList));
    }

    static LinkedList<String> reverse(LinkedList<Integer> linkedList) {
        LinkedList<String> newLinkedList = new LinkedList<>();
        int length = linkedList.size();
        for (int i = 0; i < length; i++) {
            newLinkedList.add(Objects.requireNonNull(linkedList.pollLast()).toString());
        }
        return newLinkedList;
    }
}
