class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> last_occurence = new HashMap<>();
        HashSet<Character> cur = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            last_occurence.put(s.charAt(i),i);          //用HashMap根据下标遍历记录最后出现的下标
        }
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(!cur.contains(temp)){      //如果set中没有 如果有的话 那么之后的字母要么中间夹杂着字典序小的字母 无法更替前面的 要么是相同的挨着 
                while(!stack.isEmpty() && temp < stack.peek() && last_occurence.get(stack.peek()) > i){   //如果stack不为空且temp字典序
                    cur.remove(stack.pop());                                              //小于栈内字母且栈内字母后续还有补位 不会导致真正消失
                }
                stack.push(temp);       //加入栈内
                cur.add(temp);          //加入set
            }
        }
        for(Character c :stack){
            ans.append(c.charValue());    
        }
        return ans.toString();
    }
}
