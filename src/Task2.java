//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди,
// не удаляя.

public class Task2 {
    public static void main(String[] args) {
        ownLinkedLst linkedLst = new ownLinkedLst();

        linkedLst.enqueue(123);
        linkedLst.enqueue(345);
        linkedLst.enqueue(3467);
        System.out.println(linkedLst.first());
        System.out.println(linkedLst.mylst);
        System.out.println(linkedLst.dequeue());
        System.out.println(linkedLst.mylst);
    }
}
