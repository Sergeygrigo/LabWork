import java.lang.reflect.Type;
import java.util.Scanner;

public class simplesort<ValueType> {

    public boolean compare(String a, String b) {
        int i=0;
        int lb = b.length();
        int la = a.length();

        while((int)(a.charAt(i)) == (int)(b.charAt(i))) {
            if (i>la && i>lb) {
                i++;
            }
            else {
                if(la>lb)
                    return true;
                break;
            }
        }
        if ((int)(a.charAt(i)) > (int)(b.charAt(i)))
            return true;
        return false;
    }

    Object[] arr;
    simplesort(ValueType[] array) {

        this.arr = array;
    }

    public void puz_sort() {
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1;j++)

                if (arr[j] instanceof String && arr[j+1] instanceof String) {
                    if (compare((String) arr[j],(String) arr[j+1])) {
                        String tmp = (String) arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
                else
                if (arr[j] instanceof Integer && arr[j+1] instanceof Integer){
                    if ((Integer)arr[j] > (Integer)arr[j+ 1]) {
                        Integer tmp = (Integer) arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }

    }
    public void puz_sort(int src, int dest) {
        for(int i=src;i<dest-1;i++)
            for(int j=src;j<dest-1;j++)

                if (arr[j] instanceof String && arr[j+1] instanceof String) {
                    if (compare((String) arr[j],(String) arr[j+1])) {
                        String tmp = (String) arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
                else
                if (arr[j] instanceof Integer && arr[j+1] instanceof Integer){
                    if ((Integer)arr[j] > (Integer)arr[j+ 1]) {
                        Integer tmp = (Integer) arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }

    }

    public void vstavka_sort() {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j>0;j--)
                if (arr[j] instanceof String && arr[j-1] instanceof String) {
                    if(compare((String)arr[j-1],(String)arr[j])) {
                        String tmp = (String)arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=tmp;
                    }
                }
                else

                if (arr[j] instanceof Integer && arr[j-1] instanceof Integer){
                    if ((Integer)arr[j-1] > (Integer)arr[j]) {
                        int tmp = (int)arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=tmp;
                    }
                }
        }

    }
    public void vstavka_sort(int src, int dest) {
        for(int i=src;i<dest-1;i++) {
            for(int j=i+1;j>src;j--)
                if (arr[j] instanceof String && arr[j-1] instanceof String) {
                    if(compare((String)arr[j-1],(String)arr[j])) {
                        String tmp = (String)arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=tmp;
                    }
                }
                else

                if (arr[j] instanceof Integer && arr[j-1] instanceof Integer){
                    if ((Integer)arr[j-1] > (Integer)arr[j]) {
                        int tmp = (int)arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=tmp;
                    }
                }
        }

    }
    public void vybor_sort() {
        String max = " ";
        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[min] instanceof String && arr[j] instanceof String) {
                    if (compare((String)arr[min],(String)arr[j])) {
                        min =j;
                    }

                    String tmp = (String)arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                } else
                if (arr[min] instanceof Integer && arr[j] instanceof Integer){
                    if ((Integer)arr[min] > (Integer)arr[j]) {
                        min = j;
                    }
                    Integer tmp = (Integer) arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                }

            }
        }
    }

    public void vybor_sort(int src, int dest) {
        String max = " ";
        for(int i=src;i<dest-1;i++) {
            int min = i;
            for(int j=i+1;j<dest;j++) {
                if (arr[min] instanceof String && arr[j] instanceof String) {
                    if (compare((String)arr[min],(String)arr[j])) {
                        min =j;
                    }

                    String tmp = (String)arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                } else
                if (arr[min] instanceof Integer && arr[j] instanceof Integer){
                    if ((Integer)arr[min] > (Integer)arr[j]) {
                        min = j;
                    }
                    Integer tmp = (Integer) arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                }

            }
        }
    }


    public void write() {

        for(int i=0;i<arr.length;i++)
            if (arr[i] instanceof String)
                System.out.print((String)arr[i]+' ');
            else if (arr[i] instanceof Integer)
                System.out.print((Integer) arr[i]+"  ");

    }
}