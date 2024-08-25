package Trees.BreadthFirstSearch;

public class CousinsBFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return ((level(root, xx, 0) == level(root, yy, 0) && !isSibling(root, xx, yy)));
    }

    int level(TreeNode node, TreeNode xx, int level) {
        if(node==null) {
            return 0;
        }
        if(node==xx) {
            return level;
        }
        int l = level(node, xx, level+1);
        if(l!=0) {
            return l;
        }
        return level(node.right,xx,level+1);
    }

    TreeNode findNode(TreeNode node, int y) {
        if (node == null) {
            return null;
        }
        if (node.val == y) {
            return node;
        }
        TreeNode node2 = findNode(node.left, y);
        if (node2 != null) {
            return node2;
        }
        return findNode(node.right, y);
    }

    boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }
        return ((node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left, x, y)
                || isSibling(node.right, x, y));
    }

}
