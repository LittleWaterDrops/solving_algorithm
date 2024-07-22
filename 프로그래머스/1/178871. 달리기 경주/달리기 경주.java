import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> rankMap = new HashMap<>();
        String[] rankList = players;
        
        for(int i = 0; i < rankList.length; i++){
            rankMap.put(rankList[i], i);
        }
        for(int i = 0; i < callings.length; i++){
            int rank = rankMap.get(callings[i]);
            String winner = rankList[rank];
            String looser = rankList[rank - 1];
            rankMap.put(winner, rank - 1);
            rankMap.put(looser, rank);
            rankList[rank - 1] = winner;
            rankList[rank] = looser;
        }
        answer = rankList;
        return answer;
    }
}