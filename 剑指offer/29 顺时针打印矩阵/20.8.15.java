import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> ans = new ArrayList();
       if(matrix == null || matrix.length < 1 || matrix[0].length<1){
           return ans;
       }
       int l = 0,r = matrix[0].length-1,t = 0,b = matrix.length-1;
       while(true){
           for(int i = l;i<=r;i++){ ans.add(matrix[t][i]);}
           if(++t>b){ break;}
           for(int i = t;i<=b;i++){ ans.add(matrix[i][r]);}
           if(--r<l){ break;}
           for(int i = r;i>=l;i--){ ans.add(matrix[b][i]);}
           if(--b<t){ break;}
           for(int i = b;i>=t;i--){ ans.add(matrix[i][l]);}
           if(++l>r){ break;}  
       }
       return ans;
    }
}
//矩阵也一样
