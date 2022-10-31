import java.util.*;

// Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки можно использовать TreeMap,
// мы не успели, но я расписал пример использования и прикрепил к материалам урока в файле TestTreeMap
public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов");
        showResult(list);
    }

    private Map<String, Integer> map;

    public Task2() {
        map = new HashMap<>();
    }

    public void add(String key) {
        String name = key.split(" ")[0];
        if (map.containsKey(name)) {
            Integer counter = map.get(name) + 1;
            map.put(name, counter);
        } else {
            map.put(name, 1);
        }
    }

    private static Map<String, Integer> valueSort(Map<String, Integer> data) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(data.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        Map<String, Integer> resultSorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            resultSorted.put(entry.getKey(), entry.getValue());
        }
        return resultSorted;
    }

    public void showNames() {
        for (String key : valueSort(map).keySet()) {
            System.out.println(map.get(key) + " = " + key);
        }
    }

    public static void showResult(List<String> list) {
        Iterator<String> it = list.iterator();
        Integer length = list.size();
        Task2 names = new Task2();
        for (int i = 0; i < length; i++) {
            names.add(it.next());
        }
        names.showNames();
    }
}
