// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package DZ4.DZ_4;

import java.util.LinkedList;

public class HW2 {
    public static void main(String[] args) {

        int[] list = {4, 1, 8, 3, 9};
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        System.out.println("Начальная очередь: " + linkList);
        enqueue(linkList, 5);
        System.out.println("Очередь после добавления элемента: " + linkList);
        System.out.println("Удаляемый элемент: " + dequeue(linkList));
        System.out.println("Очередь после удаления элемента: " +linkList);
        System.out.println("Первый элемент: " + first(linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }
    
    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}


    

