import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 8};
        System.out.println(delEven(array));
    }

    static List<Integer> delEven(Integer[] n) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : n) {
            if (integer % 2 == 1) {
                result.add(integer);
            }
        }
        return result;
    }
}
