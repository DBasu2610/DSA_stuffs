package Trees.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//to print the average value of noes at a given level in a list
//GOOGLE
public class AverageLevel {
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
    public List<Double> Avg(TreeNode root) {
        List<Double> list = new ArrayList<>();

        if(root==null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            Double average = (double) 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                average = average + currentNode.val;
                if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }
            }
            average = average/levelSize;
            list.add(average);
        }



      
        return list;
    }
}

    

