class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> cur = new HashMap<>();
        if(strs.length == 0) {
            return new ArrayList();
        }
        for(String a:strs){
            char[] ch = a.toCharArray();          //将string转换为char数组
            Arrays.sort(ch);                      //对char数组进行排序
            String b = String.valueOf(ch);        //将char数组转换为string
            if(!cur.containsKey(b)){              //如果存在hashmap中则不用创建，反之创建一个新的List
                cur.put(b,new ArrayList());
            }
            cur.get(b).add(a);                    //无论如何都将他放入对应的list中
    }
        return new ArrayList(cur.values());       //将hashmap的value值添加到一个新的list中返回
    }
}
