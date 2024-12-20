import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        // 정답 변수: 도착못하면 -1
        int answer = -1;
        
        // 최대 x,y 변수
        int limitX = maps.length;
        int limitY = maps[0].length;
        
        // 방문 체크 변수
        boolean[][] isVisited = new boolean[limitX][limitY];
        
        // 거리 기록 변수
        int[][] distance = new int[limitX][limitY];
        
        // 방향 변수
        int[] x = new int[]{1, -1, 0, 0};
        int[] y = new int[]{0, 0, -1, 1};
        
        // 시작이 0이면 -1
        if (maps[0][0] == 0) return -1;
        
        // 시작점 변수
        int[] first = new int[]{0,0};
        
        Queue<int[]> q = new LinkedList<>();
        
        // q에 시작점 넣고 방문기록 체크, 거리 기록 +1
        q.offer(first);
        isVisited[0][0] = true;
        distance[0][0] = 1;
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int beforeX = now[0];
            int beforeY = now[1];
            
            for(int i=0; i<4; i++) {
                int nextX = beforeX + x[i];
                int nextY = beforeY + y[i];
                
                if(nextX>=limitX || nextY>=limitY || nextX<0 || nextY<0) continue;
                if(isVisited[nextX][nextY] == true) continue;
                if(maps[nextX][nextY] == 0) continue;
                
                int[] next = new int[]{nextX, nextY};
                distance[nextX][nextY] = distance[beforeX][beforeY] + 1;
                isVisited[nextX][nextY] = true;
                
                q.offer(next);
                
            }
            if (beforeX == limitX-1 && beforeY == limitY-1) {
                return distance[beforeX][beforeY];
            }
        }
        
        
        return answer;
        
    }
}