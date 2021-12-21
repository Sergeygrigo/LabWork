public class BinaryTree<E> {


    class BinaryTreeNode<E> {

        private int key; //Ключ
        private E data; //Информационная часть узла
        private BinaryTreeNode left; //Указатель на левое поддерево
        private BinaryTreeNode right; //Указатель на правое поддерево

        public BinaryTreeNode(int key, E data) {

            this.key = key;
            this.data = data;

            left = null;
            right = null;
        }

        public E getData() {
            return data;
        }


    }


    private BinaryTreeNode root; //Корень дерева
    private int elementCount; //Число элементов в дереве

    //Конструктор
    public BinaryTree(){
        root = null;
    }

    //Конструктор копирования
    public BinaryTree(BinaryTree tree) {
        root = null;
        copy(this.root,tree.root);

    }

    //Добавление элемента
    public void addItem(int key, E data) {
        root = insert(root, key, data);
    }

    //Поиск элемента
    public Object elementBy(int key) {
        BinaryTreeNode node = root;

        while((node != null)&&(node.key != key ))
            if(key < (node.key))
                node = node.left;
            else
                node = node.right;
        return node.data;
    }


    //Удаление всех элементов
    public void clear() {
        root = null;
    }



    private BinaryTreeNode insert(BinaryTreeNode root, int key, E data) {


        if (root == null) {
            root = new BinaryTreeNode(key, data);

            return root;
        } else if (key < root.key) {
            root.left = insert(root.left, key, data);
        } else if (key >= root.key) {
            root.right = insert(root.right, key, data);
        }
        return root;
    }


    public void print() {
        print(root, 0);
    }

    int pos = 30;
    private void print(BinaryTreeNode root, int space) //печать дерева
    {
        if (root == null) {
            return;
        }

        space += 10;

        print(root.right, space);

        System.out.print("\n");
        for (int i = 10; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(root.data + "\n");

        print(root.left, space);

    }

    private void copy(BinaryTreeNode curNode, BinaryTreeNode node) {
        if (node != null) {
            BinaryTreeNode newNode = new BinaryTreeNode(node.key, node.data);
            curNode = node;


            if (root == null)
                root = curNode;
            if (node.left != null) {
                copy(curNode.left, node.left);
            }
            if (node.right != null) {
                copy(curNode.right, node.right);
            }
        }
    }
}
