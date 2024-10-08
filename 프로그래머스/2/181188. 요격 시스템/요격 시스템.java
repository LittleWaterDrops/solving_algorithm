import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int current = 0;
        Arrays.sort(targets,(o1, o2)->{
            return o1[1] - o2[1];
        });
        
        for(int i = 0; i < targets.length; i++){
            if(current <= targets[i][0]){
                current = targets[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}