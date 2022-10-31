import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {

    public static void main(String[] args) {
        Task1 getNumber = new Task1();
        getNumber.add("Alymbek Sharabidinov", "996708216268");
        getNumber.add("Tima Tynychbekov", "996506213456");
        getNumber.add("Zhasmin Toichieva", "996777213456");
        getNumber.add("Erlest Seitbekov", "996554765234");
        getNumber.showInfo("Alymbek Sharabidinov");
        getNumber.showInfo("Erlest Seitbekov");
        System.out.println();
        getNumber.showAll();
    }

    private Map<String, List<String>> map;

    public Task1() {
        map = new HashMap<>();
    }

    public void add(String key, String value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public void showInfo(String name) {
        for (String key : map.keySet()) {
            if (key.equals(name)) {
                System.out.println(name + " - " + map.get(key).toString().replaceAll("^\\[|]$", ""));
            }
        }
    }

    public void showAll() {
        for (String key : map.keySet()) {
            String value = map.get(key).toString();
            System.out.println(key + " - " + value.replaceAll("^\\[|]$", ""));
        }
    }
}
