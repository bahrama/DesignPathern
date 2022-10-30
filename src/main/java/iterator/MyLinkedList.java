package iterator;

public class MyLinkedList<T extends MyLinkedListElement> implements Repo<MyLinkedListElement> {

    private MyLinkedListElement first;


    @Override
    public Iterator<MyLinkedListElement> iterator() {
        return new MyLinkedListIterator(first);
    }

    public void add(int id, String name) {
        if (first == null) {
            first = new MyLinkedListElement(id, name);
        } else {

            MyLinkedListElement cur = first;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }

            cur.setNext(new MyLinkedListElement(id, name));
        }
    }

}
