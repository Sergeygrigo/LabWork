public class TestBinaryTree {


    static public void main(String[] args) {


        BinaryTree tree = new BinaryTree<Integer>();

        tree.addItem(10,10);

        tree.addItem(13,13);
        tree.addItem(30,666);
        tree.addItem(2,2);

        tree.addItem(4,4);


        tree.print();

        System.out.println(tree.elementBy(30));

        BinaryTree tree1 = new BinaryTree(tree);


        tree.clear();

        tree1.print();

        tree.print();


    }

}
