public class Main {
    public static void main(String[] args) {
        // create the CEO and assign a salary
        Worker ceo = new Worker("CEO", 100);

        // create the CTO and HR managers and assign salaries
        Worker cto = new Worker("CTO", 120);
        Worker hr = new Worker("HR", 77);

        // create the RD, ENG, REL, and HIR workers and assign salaries
        Worker rd = new Worker("RD", 140);
        Worker eng = new Worker("ENG", 110);
        Worker rel = new Worker("RELATION", 22);
        Worker hir = new Worker("HIRING", 20);

        // create the binary tree and set the CEO as the root
        BinaryTree tree = new BinaryTree();
        tree.setRoot(ceo);

        // add the CTO and HR managers to the tree as children of the CEO
        tree.setLeft(ceo, cto);
        tree.setRight(ceo, hr);

        // add the RD and ENG workers to the tree as children of the CTO
        tree.setLeft(cto, rd);
        tree.setRight(cto, eng);

        // add the REL and HIR workers to the tree as children of the HR manager
        tree.setLeft(hr, rel);
        tree.setRight(hr, hir);

        // print the tree in order
        tree.printInOrder(tree.getRoot());
    }
}
