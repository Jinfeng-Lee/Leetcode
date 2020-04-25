class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);         //先排序
        int ans  = 0;
        int cur = g.length-1;
        for(int i = s.length-1;i>=0;i--){     //从最大饼干开始遍历
            for(int j=cur;j>=0;j--){          //从胃口最大的小朋友遍历
                if(s[i] >= g[j]){             //如果符合条件
                    ans++;
                    cur = j-1;
                    break;                    //记得break
                }
            }
        }
        return ans;
    }
}
//本题使用贪心算法，把最大的饼干给胃口最大的小朋友
