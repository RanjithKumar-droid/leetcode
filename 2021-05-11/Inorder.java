class Inorder{
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode node){
        if(node == null) return;
        
        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
}