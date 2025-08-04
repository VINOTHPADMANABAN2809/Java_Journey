package TREE.Iterative_approach; // using stack for iterative inorder traversal

import java.util.*;

class tree{
    int data;
    tree left;
    tree right;
    tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static List<Integer> inorderTraversal(tree root) {
    List<Integer> result = new ArrayList<>();
    Stack<tree> stack = new Stack<>();
    tree current = root;

    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        result.add(current.data);
        current = current.right;
    }

    return result;
}
}

public class binarytree_inorder {

  

    public static void main(String[] vk){
        tree root = new tree(1);
        root.left = new tree(2);
        root.right = new tree(3);
        root.left.left = new tree(4);
        root.left.right = new tree(5);

        System.out.print(tree.inorderTraversal(root));


    }
}

