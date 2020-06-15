
public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        int depX = findDepth(root, x, 0);
        int depY = findDepth(root, y, 0);
        if (depX != depY)
            return false;
        TreeNode parentX = findParent(root, x);
        TreeNode parentY = findParent(root, y);
        if (parentX == parentY)
            return false;

        return true;
    }

    private int findDepth(TreeNode root, int x, int depth) {
        if (root != null) {
            if (root.val == x)
                return depth;
            int left = findDepth(root.left, x, depth + 1);
            int right = findDepth(root.right, x, depth + 1);
            if (left != -1)
                return left;
            return right;
        } else {
            return -1;
        }
    }

    private TreeNode findParent(TreeNode root, int x) {
        if (root != null) {
            if (root.left != null && root.left.val == x) {
                return root;
            }
            if (root.right != null && root.right.val == x) {
                return root;
            }
            TreeNode left = findParent(root.left, x);
            TreeNode right = findParent(root.right, x);
            if (left != null)
                return left;
            return right;
        } else {
            return null;
        }
    }
}


