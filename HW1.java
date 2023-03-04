//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package DZ4.DZ_4;

import java.util.LinkedList;

public class HW1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedli = new LinkedList<Integer>();
        linkedli.add(3);
        linkedli.add(2);
        linkedli.add(1);
        System.out.print("Начальный список элементов: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nПеревёрнутый список элементов: " + linkedli);
    }
 
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}