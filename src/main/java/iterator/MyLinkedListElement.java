package iterator;

public class MyLinkedListElement {

    private int id;
    private String name;
    private MyLinkedListElement next;

    public MyLinkedListElement(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyLinkedListElement getNext() {
        return next;
    }

    public void setNext(MyLinkedListElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyLinkedListElement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
