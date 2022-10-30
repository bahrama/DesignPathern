package iterator;

public class Runner {

    public static void main(String[] args) {

        MyLinkedList<MyLinkedListElement> list = new MyLinkedList<>();

        list.add(1,"Saman");
        list.add(2,"Ali");
        list.add(3,"Sasan");


        Iterator<MyLinkedListElement> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
