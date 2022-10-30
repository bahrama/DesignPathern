package iterator;

public class MyLinkedListIterator implements Iterator<MyLinkedListElement> {

    private MyLinkedListElement current;

    public MyLinkedListIterator(MyLinkedListElement first) {
        if (this.current == null) {
            this.current = first;
        }
    }

    @Override
    public boolean hasNext() {
        return current.getNext() != null;
    }

    @Override
    public MyLinkedListElement next() {
        MyLinkedListElement res = current;

        current = current.getNext();
        return res;
    }
}
