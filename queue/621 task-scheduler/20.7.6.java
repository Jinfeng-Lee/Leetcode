class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks == null ){ return 0;}
        int[] maps = new int[26];
        for(char task:tasks){
            maps[task-'A']++;
        }
        int time = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        for(int map:maps){
            if(map>0){
                 queue.add(map);
            }
        }
        
        while(!queue.isEmpty()){
            int i = 0;
            List<Integer> temp = new ArrayList();
            while(i<=n){
                if(!queue.isEmpty()){
                    if(queue.peek()>1){
                        temp.add(queue.poll()-1);
                    }else{
                        queue.poll();
                    }
                }
                i++;
                time++;
                if(queue.isEmpty() && temp.size() == 0){
                    break;
                }
            }
            for(int num:temp){
                queue.add(num);
            }
        }
        return time;
    }
}
//优先队列 每次把次数最高的n+1个数加入当前cpu进程。
