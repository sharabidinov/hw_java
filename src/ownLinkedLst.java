import java.util.LinkedList;

public class ownLinkedLst implements Queue{
    LinkedList<Integer> mylst;

    public ownLinkedLst() {
        mylst = new LinkedList<>();
    }

    @Override
    public int dequeue() {
        return mylst.pollFirst();
    }

    @Override
    public int first() {
        return mylst.getFirst();
    }

    @Override
    public void enqueue(int n) {
        mylst.add(n);
    }
}
