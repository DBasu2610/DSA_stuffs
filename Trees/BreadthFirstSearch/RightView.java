package Trees.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// AMAZON FLIPKART
public class RightView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if(root==null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }

                if(i==levelSize-1) {
                    list.add(currentNode.val);
                }
            }
        }
        return list;
            
    }
        

    
}
