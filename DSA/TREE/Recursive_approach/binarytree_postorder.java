package TREE.Recursive_approach;

class tr{
    int data;
    tr left, right;
    tr(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree_postorder {
    public static void main(String[] args) {
        tr root = new tr(1);
        root.left = new tr(2);
        root.right = new tr(3);
        root.left.left = new tr(4);
        root.right.right = new tr(5);
        postorder(root);
    }

    public static void postorder(tr root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
