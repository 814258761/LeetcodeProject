import java.util.*;

public class Solution173 {
     public class TreeNode {

         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {}

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    class BSTIterator {
        List<Integer> list;
        int index;
        public BSTIterator(TreeNode root) {
            this.index = -1;
            this.list = midOrderTraverse(root);
        } 

        //二叉搜索树中序遍历
        public List<Integer> midOrderTraverse(TreeNode root){
            List<Integer> list = new ArrayList<Integer>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode tag = root;
            while (tag != null || !stack.isEmpty()){
                while(tag != null){
                    stack.push(tag);
                    tag = tag.left;
                }
                tag = stack.pop();
                list.add(tag.val);
                tag = tag.right;
            }
            return list;
        }

        public int next() {
            return list.get(++index);
        }

        public boolean hasNext() {
            return (index < list.size()-1);
        }
    }
}
