class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder == null){ return false;}
        return recur(postorder,0,postorder.length-1);
    }
    public boolean recur(int[] postorder,int i,int j){
        if(i>=j){ return true;}   //二叉树为空的时候 会大于
        int p = i;
        while(postorder[p] < postorder[j]){ p++;}
        int m = p;
        while(postorder[m] > postorder[j]){ m++;}
        return m == j && recur(postorder,i,p-1) && recur(postorder,p,j-1);
        
    }
}
