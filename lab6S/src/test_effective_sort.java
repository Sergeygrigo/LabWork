import java.util.Scanner;

public class test_effective_sort {
    public static void main(String[] args) {
        String[] stringArray = {"a","acas","basd","acasd","asdbc","a","123","321","123","acs","a","b","ab"};
        //  Integer[] intArray = {10, 69, 22, 7, 99, 23, 8,23,17,18,77,33,44};
        effective_sort Array = new effective_sort(stringArray);
        Scanner sc = new Scanner(System.in);
        int i;
        String a;
        while(true){
            System.out.println("__________________________");
            System.out.println("Ваши элементы ");
            Array.write();
            System.out.println();
            System.out.println("Что вы хотите сделать?\n"
                    + "1)Создать свой массив из элементов\n"
                    + "2)Отсортировать все методом быстрой сортировки\n"
                    + "3)Отсортировать все пирамиальным методом\n"
                    + "4)Отсортировать все Методом слияния\n"
                    + "5)Выйти");
            System.out.println("__________________________");
            i = sc.nextInt();
            switch(i){
                case 1:
                    System.out.println("Введите кол-во элементов?");
                    i = sc.nextInt();
                    stringArray = new String[i];
                    for(int j=0;j<i;j++){
                        a = sc.next();
                        stringArray[j] = a;
                        Array = new effective_sort(stringArray);
                    }
                    break;
                case 2:
                    Array.quick_sort(0, stringArray.length-1);
                    break;
                case 3:
                    Array.pyramidal_sort(stringArray.length);
                    break;
                case 4:
                    Array.merge_sort(0,stringArray.length-1);
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
