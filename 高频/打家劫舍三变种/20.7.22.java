/**
没有限制 线性
*/
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){ return 0;}
        if(nums.length == 1){ return nums[0];}
        int[] dp = new int[2];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            dp[i&1] = Math.max(dp[i&1]+nums[i],dp[1-i&1]);
        }
        return dp[(nums.length-1) & 1];
    }
}
/**
限制:环
*/
class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){ return 0;}
        if(nums.length == 1){ return nums[0];}
        return Math.max(helper(Arrays.copyOfRange(nums,1,nums.length)),helper(Arrays.copyOfRange(nums,0,nums.length-1)));
    }
    public int helper(int[] nums){
        int cur = 0,pre = 0,temp;
        for(int num:nums){
            temp = cur;
            cur = Math.max(pre+num,cur);
            pre = temp;
        }
        return cur;
    }
}
/**
限制：二叉树
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        int[] dp = helper(root);
        return Math.max(dp[0],dp[1]);
    }
    public int[] helper(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] dp = new int[2];
        dp[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        dp[1] = left[0] + right[0] + root.val;
        return dp;
    }
}
