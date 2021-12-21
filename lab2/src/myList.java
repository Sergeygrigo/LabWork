import java.util.NoSuchElementException;

public class myList<E> {

    private class Node<E>{
        public E value;
        public Node<E> next;

        public Node() {
            value = null;
            next = null;
        }

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

    }

    private Node<E> firstItem;
    private Node<E> lastItem;
    private int size;

    public Node<E> getFirstItem() {
        if (firstItem == null) {
            throw new NoSuchElementException();
        }
        return firstItem;
    }

    public Node<E> getLastItem() {
        if (lastItem == null) {
            throw new NoSuchElementException();
        }
        return lastItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void Show() {
        Node node = firstItem;
        for (int i = 0; i < getSize(); i++){
            System.out.print(node.value+" ");
            node = node.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }


    public myList() {
        firstItem = null;
        lastItem = null;
        size = 0;
    }

    public myList(myList list){

        Node curr = list.getFirstItem();

        for (int i = 0; i < list.getSize(); i++){
            addLast((E) curr.value);
            curr = curr.next;
        }
    }

    public void add(E value) {
        if (value == null) { throw new NullPointerException("Введен пустой элемент"); }
        if (!isEmpty()) {
            Node prev = lastItem;
            lastItem = new Node(value, null);
            prev.next = lastItem;
        }
        else {
            lastItem = new Node(value, null);
            firstItem = lastItem;
        }
        this.size++;

    }

    public void addLast(E value) {
        if (value == null) {
            throw new NullPointerException("Введен пустой элемент");
        }
        Node node = new Node<E>(value, null);
        if (lastItem != null){
            getLastItem().next = node;
            lastItem = node;
        } else {
            firstItem = node;
            lastItem = node;
        }
        size++;



    }

    public void removeFirst() {
        if (isEmpty() ) {
            throw new IllegalStateException("Ошибка при удалении");
        }
        firstItem = getFirstItem().next;

        size--;

    }

    public void remove(E value) {

        if (isEmpty() ) {
            throw new IllegalStateException("Ошибка при удалении");
        }

        boolean result = false;
        Node prev = firstItem;
        Node curr = firstItem;
        while (curr.next != null || curr == lastItem) {
            if (curr.value == value) {
                if (getSize() == 1) {
                    firstItem = null;
                    lastItem = null;
                }
                else if (curr == firstItem) {
                    firstItem = firstItem.next;
                }
                else if (curr == lastItem) {
                    lastItem = prev;
                    lastItem.next = null;
                }
                else {
                    prev.next = curr.next;
                }
                size--;
                result = true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }

    }

    public void clear() {

        size = 0;
        firstItem = null;
        lastItem = null;
    }
}