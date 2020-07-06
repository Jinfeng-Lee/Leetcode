class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s == null){ return new LinkedList<Integer>();}
        char[] arrayS = s.toCharArray();
        char[] arrayP = p.toCharArray();
    
        int[] windows = new int[26];
        int[] needs = new int[26];
        
        for(int i = 0;i<p.length();i++){
            needs[p.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = 0;
        List<Integer> ans = new ArrayList();
        while(right < s.length()){
            int temp = s.charAt(right)-'a';
            windows[temp]++;
            right++;
            while(windows[temp] > needs[temp] ){
                int temp2 = s.charAt(left) - 'a';
                windows[temp2]--;
                left++;
            }
            if(right - left == p.length()){ ans.add(left);} //注意这里
        }
        return ans;
    }
}
//标准的滑动窗口
