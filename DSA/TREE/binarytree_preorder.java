package TREE;

class tree{
    int data;
    tree left,right;
    tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree_preorder {
    public static void main(String[] vk){
        tree root = new tree(1);
        root.left = new tree(2);
        root.right = new tree(3);
        root.left.left = new tree(4);
        root.left.right = new tree(5);
        preorder(root);
    }

    public static void preorder(tree root){
        if(root == null) return;
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

