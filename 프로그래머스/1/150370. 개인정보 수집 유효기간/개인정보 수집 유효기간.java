import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int[] result = new int[privacies.length];
        String[] todayList = today.split("[.]");
        int todayToInt = 0;
        int count = 0;
        Map<String, Integer> termsMap = new HashMap<>();
        
        todayToInt += Integer.parseInt(todayList[0]) * 12 * 28;
        todayToInt += Integer.parseInt(todayList[1]) * 28;
        todayToInt += Integer.parseInt(todayList[2]);
        
        for(int i = 0; i < terms.length; i++){
            String[] termList = terms[i].split(" ");
            termsMap.put(termList[0], Integer.parseInt(termList[1]) * 28);
        }
        
        for(int i = 0; i < privacies.length; i++){
            int dateInt = 0;
            String privacyDate = privacies[i].split(" ")[0];
            String privacyTerm = privacies[i].split(" ")[1];
            String[] dateList = privacyDate.split("[.]");
            dateInt += Integer.parseInt(dateList[0]) * 12 * 28;
            dateInt += Integer.parseInt(dateList[1]) * 28;
            dateInt += Integer.parseInt(dateList[2]);
            dateInt += termsMap.get(privacyTerm);
            
            if(dateInt <= todayToInt){
                result[count] = i + 1;
                    
                count++;
            }
        }
        
        answer = Arrays.copyOf(result,count);
        return answer;
    }
}