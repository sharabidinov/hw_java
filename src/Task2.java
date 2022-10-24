import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
// (Collections.max())
// *Реализовать алгоритм сортировки слиянием

public class Task2 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(100);
        lst.add(29);
        lst.add(57);
        lst.add(9);
        lst.add(12);
        System.out.println("max: " + Collections.max(lst));
        System.out.println("min: " + Collections.min(lst));
        System.out.println("average: " + result(lst));
    }

    static int result(List<Integer> data) {
        int sum = data.stream().mapToInt(Integer::intValue).sum();
        return sum / (data.size());
    }
}
