import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] sList = s.split("");
        int[] result = new int[sList.length];
        Map<String, Integer> stringMap = new HashMap<>();
        for(int i = 0; i < sList.length; i++){
            Integer prevIndex = stringMap.get(sList[i]);
            result[i] = prevIndex == null ? -1 : i - prevIndex;
            stringMap.put(sList[i], i);
            
        }
        
        answer = result;
        return answer;
    }
}