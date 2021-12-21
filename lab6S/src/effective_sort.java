import java.util.Arrays;

public class effective_sort<T> {


    boolean compare(T a, T b){

        if (a instanceof Integer && b instanceof Integer) {
            return (Integer)a >= (Integer) b;
        }

        int lb = ((String)b).length();
        int la = ((String)a).length();
        int i=0;
        int min = Math.min(la, lb);
        while((int)(((String)a).charAt(i)) == (int)(((String)b).charAt(i)))
        {
            if (i<min-1){
                i++;
            }
            else {
                if(la>=lb) return true;
                break;
            }
        } if ((int)(((String)a).charAt(i)) > (int)(((String)b).charAt(i))) return true;
        return false;
    }

    T[] arr;


    effective_sort(T[] array){
        this.arr = array;
    }

    public void quick_sort(int start, int end){
        if(start>=end) return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (compare(arr[cur],arr[i]))) {
                i++;
            }
            while (j > cur && (compare(arr[j],arr[cur]))) {
                j--;
            }
            if (i < j) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quick_sort(start, cur);
        quick_sort(cur+1, end);

    }

    public void downHeap(T[] arr,int k, int n) {
        T new_elem;
        int child;
        new_elem = arr[k];

        while(k <= n/2) {
            child = 2*k;
            if( child < n && compare(arr[child+1],arr[child]))
                child++;
            if(compare(new_elem, arr[child])) break;
            arr[k] = arr[child];
            k = child;
        }
        arr[k] = new_elem;
    }
    public void pyramidal_sort(int size) {
        int i;
        T temp;
        for(i=size/2-1; i >= 0; i--) downHeap(arr, i, size-1);
        for(i=size-1; i > 0; i--) {
            temp=arr[i]; arr[i]=arr[0]; arr[0]=temp;
            downHeap(arr, 0, i-1);
        }
    }

    public void merge_sort(int lo, int hi){
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        merge_sort(lo, mid);
        merge_sort(mid + 1, hi);

        T[] buf = Arrays.copyOf(arr, arr.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = arr[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                arr[k] = buf[j];
                j++;
            } else if (j > hi) {
                arr[k] = buf[i];
                i++;
            } else if (compare(buf[i],buf[j])) {
                arr[k] = buf[j];
                j++;
            } else {
                arr[k] = buf[i];
                i++;
            }
        }
    }

    void write(){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

}