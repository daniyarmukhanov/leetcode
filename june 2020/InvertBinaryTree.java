public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return new TreeNode(root.val, root.right, root.left);
    }
}
