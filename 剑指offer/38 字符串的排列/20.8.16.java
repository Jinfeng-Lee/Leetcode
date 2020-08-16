import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ans = new ArrayList();
        if(str == null || str.length() < 1){return ans;}
        boolean[] chosen = new boolean[str.length()];
        dfs(str,chosen,ans,new StringBuilder());
        return ans;
     }
    public void dfs(String str,boolean[] chosen,ArrayList<String> ans,StringBuilder cur){
        if(cur.length() == chosen.length){
            if(!ans.contains(cur.toString())){
                 ans.add(cur.toString());
            }
            return;
        }
        for(int i = 0;i<chosen.length;i++){
            if(!chosen[i]){
                chosen[i] = true;
                cur.append(str.charAt(i));
                dfs(str,chosen,ans,cur);
                cur.deleteCharAt(cur.length()-1);
                chosen[i] = false;
            }
        }
    }
}
