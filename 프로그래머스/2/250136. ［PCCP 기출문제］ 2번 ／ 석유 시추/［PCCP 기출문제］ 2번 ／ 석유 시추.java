import java.util.*;

class Solution {
    public class Point {
        private int x;
        private int y;
       
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        int getX(){
            return x;
        }
        
        int getY(){
            return y;
        }
    }
    public int solution(int[][] land) {
        int answer = 0;
        int[] dirR = {0, 0, -1, 1};
        int[] dirC = {-1, 1, 0, 0};
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[land.length][land[0].length];
        int[] columnSumList = new int[land[0].length];
        
        for(int i = 0; i < land[0].length; i++){
            for(int j = 0; j < land.length; j++){
                int oilCount = 0;
                if(!visited[j][i] && land[j][i] == 1){
                    int maxX = i;
                    queue.offer(new Point(i, j));
                    visited[j][i] = true;
                    oilCount = 1;
                    
                    while(!queue.isEmpty()){
                        Point point = queue.poll();
                        for(int k = 0; k < 4; k++){

                            int x = point.getX() + dirR[k];
                            int y = point.getY() + dirC[k];
                            
                            if(x >= 0 && x <= land[0].length - 1 && y >= 0 && y <= land.length - 1){
                                if(land[y][x] == 1 && !visited[y][x]){
                                    maxX = Math.max(maxX, x);
                                    queue.offer(new Point(x, y));
                                    visited[y][x] = true;
                                    oilCount++;
                                }
                            }
                        }
                    }
                    for(int l = i; l <=maxX; l++){
                        columnSumList[l] += oilCount;
                    }
                }
            }
        }
        for(int j = 0; j < land[0].length;j++){
            answer = Math.max(answer, columnSumList[j]);
        }
        return answer;
    }
}
