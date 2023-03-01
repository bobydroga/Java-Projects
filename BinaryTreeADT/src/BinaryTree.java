public class BinaryTree {
    private TreeNode root;
    private int size;

    // Sets the root of the tree to a new worker node
    public void setRoot(Worker worker) {
        root = new TreeNode(worker, null);
        size = 1;
    }

    // Returns the root of the tree
    public TreeNode getRoot() {
        return root;
    }

    // Recursively searches the tree for a node containing a worker object
    private TreeNode findNode(Worker worker, TreeNode node) {
        if (node == null) {
            return null;
        } else if (node.getWorker() == worker) {
            return node;
        } else {
            TreeNode left = findNode(worker, node.getLeft());
            if (left != null) {
                return left;
            }
            return findNode(worker, node.getRight());
        }
    }

    // Adds a new worker node as the left child of a specified worker node
    public Worker setLeft(Worker p, Worker leftWorker) {
        TreeNode node = findNode(p, root);
        if (node == null) {
            return null;
        }
        if (node.getLeft() == null) {
            node.setLeft(leftWorker);
            size++;
            return leftWorker;
        } else {
            TreeNode temp = node.getLeft();
            node.setLeft(leftWorker);
            node.getLeft().setLeft(temp.getWorker());
            size++;
            return leftWorker;
        }
    }

    // Adds a new worker node as the right child of a specified worker node
    public Worker setRight(Worker p, Worker rightWorker) {
        TreeNode node = findNode(p, root);
        if (node == null) {
            return null;
        }
        if (node.getRight() == null) {
            node.setRight(rightWorker);
            size++;
            return rightWorker;
        } else {
            TreeNode temp = node.getRight();
            node.setRight(rightWorker);
            node.getRight().setRight(temp.getWorker());
            size++;
            return rightWorker;
        }
    }

    // Prints the workers in the tree in-order
    public void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.println(node.getWorker());
            printInOrder(node.getRight());
        }
    }

    // Starts printing the workers in the tree in-order, beginning with the root
    public void printInOrder() {
        printInOrder(root);
    }

    // Returns the number of nodes in the tree
    public int getSize() {
        return size;
    }
}
