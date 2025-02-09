public class BinarySearchTree {
    Node root;

    // insert method
    public void insert(int data) {
        root=insertRec(root,data);
    }

    // insert recursion method
    public Node insertRec(Node root,int data) {
        if(root==null) {
            root=new Node(data);
        } else if(data < root.data) {
            root.left=insertRec(root.left,data);
        } else if(data > root.data) {
            root.right=insertRec(root.right,data);
        }

        return root;
    }

    // Inorder Traversal
    public void inorderShow() {
        inorderRecShow(root);
    }

    // Inorder Traversal Recursion
    public void inorderRecShow(Node root) {
        if(root!=null) {
            inorderRecShow(root.left);
            System.out.print(root.data + " ");
            inorderRecShow(root.right);
        }
    }

    // Preorder Traversal
    public void preorderShow() {
        preorderRecShow(root);
    }

    // Preorder Traversal Recursion
    public void preorderRecShow(Node root) {
        if(root!=null) {
            System.out.print(root.data + " ");
            inorderRecShow(root.left);
            inorderRecShow(root.right);
        }
    }

    // Postorder Traversal
    public void postorderShow() {
        postorderRecShow(root);
    }

    // Postorder Traversal Recursion
    public void postorderRecShow(Node root) {
        if(root!=null) {
            inorderRecShow(root.left);
            inorderRecShow(root.right);
            System.out.print(root.data + " ");
        }
    }
}

// Tree has three types of traversal

// 1. Inorder --> left then root then right
// 2. Preorder --> root then left then right
// 3. Postorder --> left then right then root
