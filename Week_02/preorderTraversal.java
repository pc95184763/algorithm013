
public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
 


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>() ;       // 需要用栈来回溯访问根的右孩子
        LinkedList<Integer> output = new LinkedList<>();      //存放结果
        if (root == null ) {
            return output ; 
        }
        stack.push(root) ;                       // 根节点不为空，则将根节点圧栈
        while( !stack.isEmpty() ) {
            TreeNode node = stack.pop()    ;     // 访问每个子树的根节点
            output.add( node.val)  ;
            if( node.right != null )    stack.add(node.right );   //先存放右节点，则后访问右孩子节点
            if( node.left != null )     stack.add(node.left ) ;

        }
        return output ;
    }
}