class Solution {
    public String minNumber(int[] nums) {
        String[] attrs = new String[nums.length];
        int count = 0;
        for(int num:nums){
            attrs[count++] = String.valueOf(num);
        }
        fastSort(attrs,0,attrs.length-1);
        StringBuilder ans = new StringBuilder();
        for(String attr:attrs){
            ans.append(attr);
        }
        return ans.toString();
    }
    public void fastSort(String[] attrs,int l,int r){
        if(l>=r){ return;}
        int i = l,j = r;
        String temp = attrs[l];
        while(i<j){
            while((attrs[l] + attrs[j]).compareTo(attrs[j] + attrs[l])<=0 && i<j) j--;
            while((attrs[l] + attrs[i]).compareTo(attrs[i] + attrs[l])>=0 && i<j) i++;
            String temp2 = attrs[i];
            attrs[i] = attrs[j];
            attrs[j] = temp2;
        }
        attrs[l] = attrs[i];
        attrs[i] = temp;
        fastSort(attrs,l,i-1);
        fastSort(attrs,i+1,r);
    }
}
//快速排序 NlogN
