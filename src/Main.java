import java.util.*;

public class Main {

    public static void filterList(Map<String, Integer> filter, List<Task1> initialList) {
        List<Task1> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : filter.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            for (Task1 task1 : initialList) {
                switch (key) {
                    case ("RAM"):
                        if ((task1.getRam() > value)) {
                            list.add(task1);
                        }
                        break;
                    case ("HDD"):
                        if ((task1.getHdd() > value)) {
                            list.add(task1);
                        }
                        break;
                    case ("RESOLUTION"):
                        if ((task1.getRes() > value)) {
                            list.add(task1);
                        }
                        break;
                }
            }
        }
        clearScreen();
        if (!list.isEmpty()) {
            System.out.println("Вот что мне удалось найти: ");
        } else {
            System.out.println("Ничего не найдено :(");
        }
        printList(list);
        list.clear();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void printList(List<Task1> list) {
        for (Task1 task1 : list) {
            System.out.println(task1);
        }
    }

    public static void main(String[] args) {
        List<Task1> list = new ArrayList<>();
        Task1 noteBook1 = new Task1(16, 1080, 480);
        Task1 noteBook2 = new Task1(32, 720, 480);
        Task1 noteBook3 = new Task1(16, 2000, 480);
        Task1 noteBook4 = new Task1(8, 4000, 1000);
        Task1 noteBook5 = new Task1(8, 1080, 500);
        Task1 noteBook6 = new Task1(8, 2000, 240);
        Task1 noteBook7 = new Task1(16, 720, 1000);
        list.add(noteBook1);
        list.add(noteBook2);
        list.add(noteBook3);
        list.add(noteBook4);
        list.add(noteBook5);
        list.add(noteBook6);
        list.add(noteBook7);

        clearScreen();
        System.out.println("Добро пожаловать в наш маленький консольный магазин ноутбуков! Вот что у нас есть:");
        printList(list);

        Map<String, Integer> filter;
        filter = new HashMap<>();

        Scanner in = new Scanner(System.in);

        String r = "Y";
        while (!r.equals("N")) {
            System.out.println("Для работы с фильтром введите название фильтра (RAM, HDD, Resolution) и через пробел минимальное начение (например 'HDD 400') : ");
            String input = in.nextLine().toUpperCase();
            String[] keyValue = input.split(" ");
            filter.put(keyValue[0], Integer.parseInt(keyValue[1]));
            filterList(filter, list);
            System.out.println("Попробовать еще?(Y/N): ");
            r = in.nextLine().toUpperCase();
        }
        in.close();
    }
}
