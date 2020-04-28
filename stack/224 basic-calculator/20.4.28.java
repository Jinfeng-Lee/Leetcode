class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();     //用一个栈来记录符号和之前的结果
        int sign = 1;                           //1为正数 -1为负数
        int operand = 0;                        //当前的操作数 因为出现位数很多的情况 
        int result = 0;                         //当前结果
        for(int i =0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                operand = operand * 10 + s.charAt(i)-'0';
            }else if(s.charAt(i) == '+'){
                result += operand * sign;
                sign = 1;
                operand = 0;                   
            }else if(s.charAt(i) == '-'){
                result += operand * sign;
                sign = -1;
                operand = 0;                    //碰到符号得把之前的结果累加 并修改符号 操作数归零
            }else if(s.charAt(i) == '('){
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;                     //碰到左括号压栈 并初始化
            }else if(s.charAt(i) == ')'){
                result += sign * operand;
                result *=stack.pop();
                result +=stack.pop();
                sign = 1;
                operand = 0;                    //碰到右括号出栈累加之前结果 初始化
            }
        }
        return result + sign * operand;         //记得加上可能没被计算的最后一个digit
    }
}

