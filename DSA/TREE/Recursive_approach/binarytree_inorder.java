package TREE.Recursive_approach;

class tree{
    int data;
    tree left,right;
    tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree_inorder {
    public static void main(String[] vk){
       tree root = new tree(1);
        root.left = new tree(2);
        root.right = new tree(3);
        root.left.left = new tree(4);
        root.left.right = new tree(5);

        inorder(root);
    }

    public static void inorder(tree root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
