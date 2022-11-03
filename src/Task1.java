//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
// необходимому критерию:

//    1 - ОЗУ
//    2 - Объем ЖД
//    3 - Операционная система
//    4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

public class Task1 {
    private Integer ram;
    private Integer res;
    private Integer hdd;


    public Task1(Integer res, Integer ram, Integer hdd) {
        this.ram = res;
        this.res = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Notebook: " + "RAM: " + ram + "GB, HDD: " + hdd + "GB, Resolution: " + res + "pp";
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRes() {
        return res;
    }

    public void setRes(Integer res) {
        this.res = res;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }
}
