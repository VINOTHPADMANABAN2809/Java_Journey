package TREE.Recursive_approach;

class tree{
    int data;
    tree left, right;
    tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree_postorder {
    public static void main(String[] args) {
        tree root = new tree(1);
        root.left = new tree(2);
        root.right = new tree(3);
        root.left.left = new tree(4);
        root.right.right = new tree(5);
        postorder(root);
    }

    public static void postorder(tree root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
