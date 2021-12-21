import java.lang.reflect.Array;
import java.util.Scanner;

public class testsimplesort {
    public static void main(String[] args) {
        String[] s = {"g", "f", "e", "d", "c", "b", "a"};
        Integer[] arr = {1,10,3,11,24,3,14,33};
        simplesort Array = new simplesort<String>(s);
        Scanner in = new Scanner(System.in);
        int i;
        String a;

        while(true) {
            System.out.println("-------------------------");
            System.out.println("\tЭлементы массива: ");
            Array.write();
            System.out.println();
            System.out.println("\tЧто вы хотите сделать?\n"
                    + "1)Создать свой массив из элементов\n"
                    + "2)Отсортировать все Пузырьковым методом\n"
                    + "3)Отсортировать все Методом вставок\n"
                    + "4)Отсортировать все Методом выборки\n"
                    + "5)Выйти");
            System.out.println("-------------------------");
            i = in.nextInt();
            int src, dest;
            switch(i){
                case 1:
                    System.out.println("Введите кол-во элементов?");
                    i = in.nextInt();
                    s = new String[i];
                    for(int j=0;j<i;j++){
                        a = in.next();
                        s[j] = a;
                        Array = new simplesort(s);
                    }
                    break;
                case 2:
                    System.out.println("Введите подпоследовательность, которую необходимо отсортировать (-1,-1 если целиком)"); //Вводятся индексы массива

                    src = in.nextInt();
                    dest = in.nextInt();
                    if (src != -1 && dest != -1)
                        Array.puz_sort(src,dest);
                    else
                        Array.puz_sort();


                    break;
                case 3:

                    System.out.println("Введите подпоследовательность, которую необходимо отсортировать (-1,-1 если целиком)"); //Вводятся индексы массива

                    src = in.nextInt();
                    dest = in.nextInt();
                    if (src != -1 && dest != -1)
                        Array.vstavka_sort(src,dest);
                    else
                        Array.vstavka_sort();
                    break;
                case 4:
                    System.out.println("Введите подпоследовательность, которую необходимо отсортировать (-1,-1 если целиком)"); //Вводятся индексы массива

                    src = in.nextInt();
                    dest = in.nextInt();
                    if (src != -1 && dest != -1)
                        Array.vybor_sort(src,dest);
                    else
                        Array.vybor_sort();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }
    }
}