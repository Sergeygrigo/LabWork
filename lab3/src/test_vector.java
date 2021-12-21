public class test_vector {
    public static void main(String[] args){
        myVector array=new myVector<Double>(40, 12);
        array.add(50);
        array.add(40);
        array.add(30);
        array.add(20);
        array.add(10);
        array.add(0);
        array.add(0,50);
        array.add(1,40);
        array.add(2,30);
        array.add(3,20);
        array.add(4,10);
        array.add(5,0);

        myVector array2=new myVector<Double>(array);
        array2.write();

        array.write();
        array.removeLastElement();
        array.removeElementAt(3);
        array.write();
    }
}
