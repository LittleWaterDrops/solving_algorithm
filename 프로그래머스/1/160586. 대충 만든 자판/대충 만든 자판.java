import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        int[] result = new int[targets.length];
        Map<String,Integer> stringMap = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++){
            String[] splitedList = keymap[i].split("");
            for(int j = 0; j < splitedList.length; j++){
                if(stringMap.get(splitedList[j]) == null || stringMap.get(splitedList[j]) > j){
                    stringMap.put(splitedList[j], j + 1);
                }
            }
        }
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            String[] splitedList = targets[i].split("");
            for(int j = 0; j < splitedList.length; j++){
                if(stringMap.get(splitedList[j]) != null){
                    sum += (stringMap.get(splitedList[j]));
                }
                else{
                    sum = 0;
                    break;
                }
            }
            result[i] = sum == 0 ? -1 : sum;
        }
        answer = result;
        
        return answer;
    }
}