import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int currentC = 0;
        int currentR = 0;
        int rowNumber = park[0].split("").length;
        int[] answerList = new int[2];
        String[][] map = new String[park.length][rowNumber];
        Map<String, Integer> routeMap = new HashMap<>();
        int[] dirC = {0, 0, 1, -1};
        int[] dirR = {1, -1, 0, 0};

        routeMap.put("E", 0);
        routeMap.put("W", 1);
        routeMap.put("S", 2);
        routeMap.put("N", 3);
        
        for(int i = 0; i < park.length; i++){
        String[] rowList = park[i].split("");
            for(int j = 0; j < rowNumber; j++){
                map[i][j] = rowList[j];
                if(rowList[j].equals("S")){
                    currentC = i;
                    currentR = j;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] routeList = routes[i].split(" ");
            String op = routeList[0];
            int n = Integer.parseInt(routeList[1]);
            int destinationC = currentC + (dirC[routeMap.get(op)] * n);
            int destinationR = currentR + (dirR[routeMap.get(op)] * n);
            boolean flag = false;
            if(destinationC >= 0 && destinationC <= map.length - 1 && destinationR >= 0 && destinationR <= map[0].length -1 ){
                for(int j = 0; j < n; j++){
                    if(routeMap.get(op) == 2 || routeMap.get(op) == 3){
                        if(map[currentC + (dirC[routeMap.get(op)] * (j + 1))][currentR].equals("X")){
                            flag = true;
                        }
                    }
                    if(routeMap.get(op) == 0 || routeMap.get(op) == 1){
                        if(map[currentC][currentR + (dirR[routeMap.get(op)] * (j + 1))].equals("X")){
                            flag = true;
                        }
                    }
                }
                if(flag == false){
                    currentC = destinationC;
                    currentR = destinationR;
                }
            }
        }
        
        answerList[0] = currentC;
        answerList[1] = currentR;
        answer = answerList;
        return answer;
    }
}