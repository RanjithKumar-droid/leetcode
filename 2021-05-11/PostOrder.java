class PostOrder{
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        postorder(root);
        return ans;
    }
    
    public void postorder(TreeNode node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        ans.add(node.val);
    }
}