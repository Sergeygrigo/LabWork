import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class myVector<E> {
    private Object[] array;
    private int elementCount;
    private int capacity;
    private int maxSize;

    public myVector(int initialCapacity, int capacity){
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Ошибка");
        this.array=new Object[initialCapacity];
        this.capacity=capacity;
        this.maxSize=2*initialCapacity+10;
    }

    public myVector(int initialCapacity){
        this(initialCapacity, 0);
    }

    public myVector(){
        this(10);
    }

    public myVector (myVector vector){
            this(vector.capacity(),vector.size());
            for (int i=0; i<vector.size(); i++){
                add((E) vector.get(i));
            }
    }

    public void add(E obj){
        add(elementCount, obj);
    }

    public void removeLastElement(){
        int i=elementCount-1;
        if(i>=0){
            removeElementAt(i);
        }
    }

    public void removeElementAt(int index){
        if (index>=elementCount){
            throw new ArrayIndexOutOfBoundsException(index + ">=" + elementCount);
        }
        else if (index<0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int j=elementCount-index-1;
        if (j>0){
            System.arraycopy(array, index+1, array, index, j);
        }
        elementCount--;
        array[elementCount]=null;
    }

    public void add(int index, E element){
        if (index>elementCount){
            throw new ArrayIndexOutOfBoundsException(index + ">" + elementCount);
        }
        final int s=elementCount;
        Object[] elementData=this.array;
        if (s==elementData.length)
            elementData=grow();
        System.arraycopy(elementData, index, elementData, index+1, s-index);
        elementData[index]=element;
        elementCount=s+1;
    }

    private Object[] grow(){
        return array=Arrays.copyOf(array, newCapacity(elementCount+1));
    }

    private int newCapacity(int minCapacity){
        maxSize=2*minCapacity+10;
        int currentCapacity=array.length;
        int newCapacity=currentCapacity + ((capacity>0)?capacity:currentCapacity);
        if (newCapacity-minCapacity<=0) {
            if (minCapacity<0)
            throw new OutOfMemoryError();
            return minCapacity;
        }
        return newCapacity;
    }

    public void clear(){
        Object[] t=array;
        for (int to=elementCount, i=elementCount=0; i<to; i++)
            t[i]=null;
    }

    public int capacity(){
        return array.length;
    }

    public int maxSize(){
        return 2*size()+10;
    }

    public int size(){
        return elementCount;
    }

    public boolean isEmpty(){
        return elementCount==0;
    }

    public E get(int index){
        return (E) array[index];
    }

    public void write(){
        for (int i=0; i<elementCount; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
