class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<String> storage_string = new LinkedList();
        LinkedList<Integer> storage_number = new LinkedList();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '['){
                storage_string.addLast(res.toString());
                storage_number.addLast(multi);
                res = new StringBuilder();
                multi = 0;
            }else if (c ==']'){
                multi = storage_number.removeLast(); 
                StringBuilder temp = new StringBuilder();
                String temp2 = res.toString();
                for(int j = 0;j<multi-1;j++){ res.append(temp2);}
                temp.append(storage_string.removeLast());
                temp.append(res);
                res = temp;
                multi = 0;
            }else if(c >= '0' && c<='9'){
                multi = multi * 10 + Integer.parseInt(c + "");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
