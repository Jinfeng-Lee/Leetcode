class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();
        int sign = 1;
        int operand = 0;
        int result = 0;
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
                operand = 0;
            }else if(s.charAt(i) == '('){
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            }else if(s.charAt(i) == ')'){
                result += sign * operand;
                result *=stack.pop();
                result +=stack.pop();
                sign = 1;
                operand = 0;
            }
        }
        return result + sign * operand;
    }
}
