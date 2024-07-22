class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int[] result = new int[]{50, 50, 0, 0};

        for(int i = 0; i < wallpaper.length; i++){
            String[] row = wallpaper[i].split("");
            for(int j = 0; j < row.length; j++){
                if(row[j].equals("#")){
                    result[0] = result[0] > i ? i : result[0];
                    result[1] = result[1] > j ? j : result[1];
                    result[2] = result[2] > i ? result[2] : i;
                    result[3] = result[3] > j ? result[3] : j;
                }
            }
        }
        result[2] += 1;
        result[3] +=1;
        answer = result;
        return answer;
    }
}