package BinaryTree;

public class TreeNode {
    // nodes have 3 fields
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

//    adding constructor

    public TreeNode (int data){
        this.data = data;
    }
    // we will not allow duplicate value
    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }
// lets do inorder traversal - we visit left node first then root and
//    then right child node.
//    now if left child is not equal to null visit the leftchild
public void traverseInOrder() {
    if (leftChild != null) {
        leftChild.traverseInOrder();
    }
    System.out.print(data + ", ");
    if (rightChild != null) {
        rightChild.traverseInOrder();
    }
}


//    getters and setters

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
