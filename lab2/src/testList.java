import java.util.Scanner;

public class testList {
    public static void main(String [] args) {

        System.out.println("Операции над списком СТРОК");
        myList list = new myList<String>();

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер списка: ");
        int size = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        for (int i = 0; i<size; i++) {
            System.out.println("Введите элемент списка: ");
            String item = in1.nextLine();
            list.add(item);
        }

        list.addLast("LastItem");

        list.Show();

        list.removeFirst();

        list.remove("LastItem");

        list.Show();

        myList list2 = new myList(list);

        list.clear();

        list2.Show();


    }
}
