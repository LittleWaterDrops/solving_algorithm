import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        int[] result = new int[photo.length];
        Map<String, Integer> nameMap = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            nameMap.put(name[i], i);    
        }
        for(int i = 0; i < photo.length; i++){
            int valueSum = 0;
            for(int j = 0; j < photo[i].length; j++){
                Integer index = nameMap.get(photo[i][j]);
                if(index != null){
                    valueSum += yearning[index];
                }
            }
            result[i] = valueSum;
        }
        answer = result;
        return answer;
    }
}