import java.util.LinkedList;

public class t_1 {
    public static void main(String[] args) {
        int[] listMas = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("linkList = " + linkList);
    }

    public static void main_2(String[] args) {
        int[] list = { 3, 5, 7, 2, 4, 6 };
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        System.out.println(linkList);
        enqueue(linkList, 9);
        System.out.println(linkList);
        System.out.println(dequeue(linkList));
        System.out.println(linkList);
        System.out.println(first(linkList));
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