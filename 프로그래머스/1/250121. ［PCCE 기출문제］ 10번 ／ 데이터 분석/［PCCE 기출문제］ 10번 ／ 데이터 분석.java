import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer ={};
        int[][] tempList= new int[data.length][4];
        int count = 0;
        Map<String, Integer> extMap = new HashMap<String, Integer>();
        extMap.put("code", 0);
        extMap.put("date", 1);
        extMap.put("maximum", 2);
        extMap.put("remain", 3);
        for(int i = 0; i < data.length; i++){
            if(data[i][extMap.get(ext)] < val_ext){
                tempList[count++] = data[i];
            }
        }
        tempList = Arrays.copyOf(tempList, count);
        Arrays.sort(tempList, (o1, o2) -> {
            return o1[extMap.get(sort_by)] - o2[extMap.get(sort_by)];
        });
        answer = tempList;
        return answer;
    }
}