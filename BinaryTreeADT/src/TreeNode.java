public class TreeNode {
    private Worker worker;  // The worker object stored in the node
    private TreeNode left;  // The left child of the node
    private TreeNode right;  // The right child of the node
    private TreeNode parent;  // The parent of the node

    // Constructor for creating a new tree node
    public TreeNode(Worker worker, TreeNode parent) {
        this.worker = worker;
        this.parent = parent;
    }

    // Getter method for the worker object stored in the node
    public Worker getWorker() {
        return worker;
    }

    // Getter method for the left child of the node
    public TreeNode getLeft() {
        return left;
    }

    // Getter method for the right child of the node
    public TreeNode getRight() {
        return right;
    }

    // Getter method for the parent of the node
    public TreeNode getParent() {
        return parent;
    }

    // Setter method for the left child of the node
    public void setLeft(Worker worker) {
        this.left = new TreeNode(worker, this);
    }

    // Setter method for the right child of the node
    public void setRight(Worker worker) {
        this.right = new TreeNode(worker, this);
    }
}
