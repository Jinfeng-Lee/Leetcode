public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length < 1){ return false;}
        return recur(sequence,0,sequence.length-1);
    }
    public boolean recur(int[] sequence,int m,int n){
        if(m>=n){ return true;}
        int i = m;
        while(sequence[i] < sequence[n]){ i++;}
        int j = i;
        while(sequence[j] > sequence[n]){ j++;}
        return j==n && recur(sequence,m,i-1) && recur(sequence,i,n-1);
    }
}
//递归
