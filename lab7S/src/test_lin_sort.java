import java.util.Random;
import java.util.Scanner;

public class test_lin_sort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++)
            arr[i] = Math.abs(new Random().nextInt() % 100);

        lin_sort.printArray(arr);
        Scanner in = new Scanner(System.in);
        int i;
        String a;

        int[] arrCopy = null;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("\tЭлементы массива: ");

            System.out.println();
            System.out.println("\tЧто вы хотите сделать?\n"
                    + "1)Использовать метод LSD\n"
                    + "2)Использовать метод MSD\n"
                    + "3)Использовать сортировку подсчетом\n"
                    + "4)Выйти");
            System.out.println("-------------------------\n>>> ");
            i = in.nextInt();
            int src, dest;
            switch (i) {
                case 1:
                    arrCopy = new int[arr.length];
                    for (int j = 0; j < arr.length; j++)
                        arrCopy[j] = arr[j];

                    lin_sort.LSDSort(arrCopy);
                    break;
                case 2:
                    arrCopy = new int[arr.length];
                    for (int j = 0; j < arr.length; j++)
                        arrCopy[j] = arr[j];

                    lin_sort.MSDSort(arrCopy);
                    break;
                case 3:
                    arrCopy = new int[arr.length];
                    for (int j = 0; j < arr.length; j++)
                        arrCopy[j] = arr[j];

                    lin_sort.sortByCount(arrCopy);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
            lin_sort.printArray(arrCopy);
        }
    }
}


