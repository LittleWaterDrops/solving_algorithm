import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dirC = {-1, 1, 0, 0};
        int[] dirR = {0, 0, -1, 1};

        for(int k = 0; k < dirC.length; k++){
            int dh = h + dirC[k];
            int dw = w + dirR[k];
            if(dh >= 0 && dh <= board.length - 1 && dw >= 0 && dw <= board[h].length - 1){
                if(board[h][w].equals(board[dh][dw])){
                    answer++;
                }
            }
        }
        return answer;
    }
}