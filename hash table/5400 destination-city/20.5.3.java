class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> cur = new HashSet();
        for(List<String> path:paths){
            cur.add(path.get(0));
        }
        for(List<String> path:paths){
            if(!cur.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
}
