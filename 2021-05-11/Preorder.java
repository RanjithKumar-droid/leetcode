class Preorder{
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        preOrder(root);
        return ans;
    }
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        ans.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
}