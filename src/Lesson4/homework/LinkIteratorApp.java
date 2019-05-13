package Lesson4.homework;

class Link {
    public String name;
    public int age;

    public Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}

class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;

    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkInterator getIterator() {
        return new LinkInterator(this);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}

class LinkInterator {
    private Link current;
    private Link previous;
    private LinkedList list;

    public LinkInterator(LinkedList list) {
        this.list = list;
        this.reset();
    }

    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link newLink = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Link newLink = new Link(name, age);
        if (previous == null) {
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (previous == null) {
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }

        return name;
    }
}

/**
 * 2. В методе main LinkIteratorApp проверить все методы итератора.
 */
public class LinkIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkInterator itr = new LinkInterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);

        list.display();

        System.out.println("---------------------");

        itr.getCurrent().display();
        itr.nextLink();
        itr.getCurrent().display();
        itr.insertBefore("Evgen", 15);
        itr.nextLink();
        itr.insertAfter("Michael", 25);

        System.out.println("---------------------");

        list.display();

        System.out.println("---------------------");

        itr.getCurrent().display();
        itr.reset();
        itr.getCurrent().display();

        while (!itr.atEnd()) {
            itr.nextLink();
        }

        System.out.println("deletedElement: " + itr.deleteCurrent());

        itr.reset();
        itr.nextLink();
        itr.getCurrent().display();
        System.out.println("deletedElement: " + itr.deleteCurrent());

        System.out.println("---------------------");

        list.display();

        System.out.println("---------------------");
    }
}