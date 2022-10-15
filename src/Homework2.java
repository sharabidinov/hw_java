// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1

public class Homework2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int result = 0;

        for (int i : arr) {
            if (i == 1) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }

        }
        System.out.println(result);
    }
}
