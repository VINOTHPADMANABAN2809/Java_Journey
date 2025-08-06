package TREE.Recursive_approach;

class tre{
    int data;
    tre left,right;
    tre(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree_preorder {
    public static void main(String[] vk){
        tre root = new tre(1);
        root.left = new tre(2);
        root.right = new tre(3);
        root.left.left = new tre(4);
        root.left.right = new tre(5);
        preorder(root);
    }

    public static void preorder(tre root){
        if(root == null) return;
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

