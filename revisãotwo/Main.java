package revisãotwo;
public class Main {
    public static void main(String[] args) {
        
        LinkedList list1 = LinkedList.generateRandomList(50, -100, 100);
        LinkedList list2 = LinkedList.generateRandomList(50, -100, 100);
        
       
        list1 = sortList(list1);
        list2 = sortList(list2);

        System.out.println("Lista 1:");
        list1.printList();
        System.out.println("Lista 2:");
        list2.printList();

        LinkedList invertedList = list1.invert();
        System.out.println("Lista 1 invertida:");
        invertedList.printList();

        
        LinkedList oddList = LinkedList.returnOdd(list1, list2);
        System.out.println("Elementos ímpares das listas 1 e 2:");
        oddList.printList();

       
        LinkedList concatenatedList = LinkedList.concatenate(list1, list2);
        System.out.println("Listas 1 e 2 concatenadas:");
        concatenatedList.printList();

        
        LinkedList intersectionList = LinkedList.intersection(list1, list2);
        System.out.println("Interseção das listas 1 e 2:");
        intersectionList.printList();

        
        LinkedList intercalatedList1 = LinkedList.intercalate1(list1, list2);
        System.out.println("Intercalamento 1 das listas 1 e 2:");
        intercalatedList1.printList();

       
        LinkedList intercalatedSortedList = LinkedList.intercalate2(list1, list2);
        System.out.println("Intercalamento ordenado das listas 1 e 2:");
        intercalatedSortedList.printList();
    }

    
    private static LinkedList sortList(LinkedList list) {
        LinkedList sortedList = new LinkedList();
        Node current = list.head;
        while (current != null) {
            sortedList.add(current.data);
            current = current.next;
        }
        sortedList = bubbleSort(sortedList);
        return sortedList;
    }

    private static LinkedList bubbleSort(LinkedList list) {
        boolean swapped;
        do {
            swapped = false;
            Node current = list.head;
            while (current != null && current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        return list;
    }
}
