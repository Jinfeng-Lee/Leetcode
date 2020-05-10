class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];    //用int数组记录每个结点入度
        List<List<Integer>> node = new ArrayList(); //用一个arraylist来记录每条边的终点
        Queue<Integer> search = new L inkedList();  //用一个queue来进行遍历
        for(int i =0;i<numCourses;i++){
            node.add(new ArrayList());
        }
        for(int[] prerequisite:prerequisites){
            indegrees[prerequisite[1]]++;
            node.get(prerequisite[0]).add(prerequisite[1]);
        }
        for(int i = 0;i<numCourses;i++){
            if(indegrees[i] == 0){
                search.add(i);
            }
        }                                           //三个初始化
        while(!search.isEmpty()){
            int temp = search.poll();               
            numCourses--;                           //每次出队列numCourses-1
            for(int i = 0;i<node.get(temp).size();i++){
                indegrees[node.get(temp).get(i)]--;     //入度表--
                if(indegrees[node.get(temp).get(i)] == 0){
                    search.add(node.get(temp).get(i));  //如果结点入度为0 加入queue
                }
            }
        }
        return numCourses == 0;//判断每一个结点是否都遍历过
    }
}
//与寻找拓扑排序一样
//入度表 邻接表
//对于DAG可以用入度为0逐个消去结点 并消去结点指向的边 如果有环 则最后存在节点入度都不为0的死循环 如果没有环 所有的节点都应该遍历过
