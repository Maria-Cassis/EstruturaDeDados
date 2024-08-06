package revisãotwo;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

   
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

   
    public static LinkedList generateRandomList(int size, int min, int max) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++) {
            int randomNum = (int)(Math.random() * (max - min + 1) + min);
            list.add(randomNum);
        }
        return list;
    }

   
    public LinkedList invert() {
        LinkedList invertedList = new LinkedList();
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = invertedList.head;
            invertedList.head = newNode;
            current = current.next;
        }
        return invertedList;
    }

    
    public static LinkedList returnOdd(LinkedList list1, LinkedList list2) {
        LinkedList oddList = new LinkedList();
        addOddNodesFromList(list1, oddList);
        addOddNodesFromList(list2, oddList);
        return oddList;
    }

    private static void addOddNodesFromList(LinkedList list, LinkedList oddList) {
        Node current = list.head;
        while (current != null) {
            if (current.data % 2 != 0) {
                oddList.add(current.data);
            }
            current = current.next;
        }
    }

    public static LinkedList concatenate(LinkedList list1, LinkedList list2) {
        LinkedList concatenatedList = new LinkedList();
        appendList(concatenatedList, list1);
        appendList(concatenatedList, list2);
        return concatenatedList;
    }

    private static void appendList(LinkedList targetList, LinkedList sourceList) {
        Node current = sourceList.head;
        while (current != null) {
            targetList.add(current.data);
            current = current.next;
        }
    }

    public static LinkedList intersection(LinkedList list1, LinkedList list2) {
        LinkedList intersectionList = new LinkedList();
        Node current1 = list1.head;
        while (current1 != null) {
            if (contains(list2, current1.data) && !contains(intersectionList, current1.data)) {
                intersectionList.add(current1.data);
            }
            current1 = current1.next;
        }
        return intersectionList;
    }

    private static boolean contains(LinkedList list, int value) {
        Node current = list.head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static LinkedList intercalate1(LinkedList list1, LinkedList list2) {
        LinkedList intercalatedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        while (current1 != null && current2 != null) {
            intercalatedList.add(current1.data);
            intercalatedList.add(current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }
        while (current1 != null) {
            intercalatedList.add(current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            intercalatedList.add(current2.data);
            current2 = current2.next;
        }
        return intercalatedList;
    }

   
    public static LinkedList intercalate2(LinkedList list1, LinkedList list2) {
        LinkedList intercalatedSortedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                intercalatedSortedList.add(current1.data);
                current1 = current1.next;
            } else {
                intercalatedSortedList.add(current2.data);
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            intercalatedSortedList.add(current1.data);
            current1 = current1.next;
        }
        while (current2 != null) {
            intercalatedSortedList.add(current2.data);
            current2 = current2.next;
        }
        return intercalatedSortedList;
    }
}