class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder ans = new StringBuilder();
        int[][] matrix = new int[target.length()+1][2];
        for(int i=0;i<target.length();i++){
            int temp = target.charAt(i) - 'a';
            matrix[i+1][0] = temp / 5;
            matrix[i+1][1] = temp % 5;
        }
        for(int i=1;i<target.length()+1;i++){
            if(matrix[i][0] == 5 && matrix[i][1] ==0){
                for(int j=0;j<matrix[i-1][1];j++){
                    ans.append("L");
                }
                matrix[i-1][1] = 0;
            }else if(matrix[i-1][0] == 5 && matrix[i-1][1] ==0){
                ans.append("U");
                matrix[i-1][0] = 4;
            }
            for(int j=0;j<Math.abs(matrix[i][0]-matrix[i-1][0]);j++){
                if(matrix[i][0]-matrix[i-1][0] > 0){
                    ans.append("D");
                }else{
                    ans.append("U");
                }
            }
            for(int k=0;k<Math.abs(matrix[i][1]-matrix[i-1][1]);k++){
                if(matrix[i][1]-matrix[i-1][1] > 0){
                    ans.append("R");
                }else{
                    ans.append("L");
                }  
            }
            ans.append("!");
        }
        return ans.toString(); 
    }
       
}
//其实这题可以不用一个二维数组 用两个int来存储前面的坐标 遍历时候计算坐标 将每一个for循环换成两个while语句根据上左下右的顺序 就可以解决z问题
//如果存在两个if中有在不同的情况下执行顺序不一样 可以选择拆开用while
