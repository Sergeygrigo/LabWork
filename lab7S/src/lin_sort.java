import java.util.*;

public class lin_sort {


    private static int digit(int n, int k, int N, int M) {
        return (n >> (N * k) & (M - 1));
    }

    public static void sortByCount(int[] array) {
        int N = array.length;
        int temp[] = new int[N];
        boolean f = false;
        for (int shift = 0; !f; shift++) {
            int count = 0;
            f = true;
            for (int i = 0; i < N; i++) {
                int shifted = (array[i] >> shift);

                if (shifted > 0)
                    f = false;

                if (shifted % 2 == 0)
                    count++;
            }
            if (f)
                break;

            int lower = 0, upper = count;

            for (int i = 0; i < N; i++) {
                int shifted = (array[i] >> shift);

                if (shifted % 2 == 0) {
                    temp[lower++] = array[i];
                } else {
                    temp[upper++] = array[i];
                }
            }

            for (int i = 0; i < N; i++) {
                array[i] = temp[i];
            }
        }
    }

    static public void LSDSort(int[] array) {
        _LSDSort(array, 8);
    }
    private static void _LSDSort(int array[], int N) {

        int k = (32 + N - 1) / N;
        int M = 1 << N;
        int size = array.length;
        int[] b = new int[size];
        int[] c = new int[M];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < M; j++)
                c[j] = 0;
            for (int j = 0; j < array.length; j++)
                c[digit(array[j], i, N, M)]++;
            for (int j = 1; j < M; j++)
                c[j] += c[j - 1];
            for (int j = array.length - 1; j >= 0; j--)
                b[--c[digit(array[j], i, N, M)]] = array[j];
            int cur = 0;
            for (int j = 0; j < array.length; j++)
                array[j] = b[cur++];
        }
    }


    public static void MSDSort(int[] input) {

        List<Integer>[] tempList = new ArrayList[10];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = new ArrayList<Integer>();
        }
        boolean f = false;
        int tmp = -1, div = 1;
        while (!f) {
            f = true;
            for (int i : input) {
                tmp = i / div;
                tempList[tmp % 10].add(i);
                if (f && tmp > 0) {
                    f = false;
                }
            }
            int a = 0;
            for (int j = 0; j < 10; j++) {
                for (int i : tempList[j]) {
                    input[a++] = i;
                }
                tempList[j].clear();
            }
            div *= 10;
        }
    }


    public static void printArray(int[] arr) {

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+"  ");

    }

}
