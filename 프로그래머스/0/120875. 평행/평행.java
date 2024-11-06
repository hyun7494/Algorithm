public class Solution {
    public int solution(int[][] dots) {
        // 네 점을 두 개씩 연결한 직선의 기울기를 비교하기 위해 기울기를 크로스 곱으로 비교
        // 점 [x1, y1], [x2, y2]를 연결한 기울기 비교
        // 기울기 비교를 (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1) 형태로 계산
        
        // 각 점을 두 개씩 이을 때 평행한 직선이 있으면 1을 리턴하고 없으면 0을 리턴
        // 6가지 조합에 대해 기울기를 비교
        if (checkParallel(dots[0], dots[1], dots[2], dots[3])) return 1;  // 직선 1-2와 3-4
        if (checkParallel(dots[0], dots[2], dots[1], dots[3])) return 1;  // 직선 1-3와 2-4
        if (checkParallel(dots[0], dots[3], dots[1], dots[2])) return 1;  // 직선 1-4와 2-3
        return 0;  // 평행한 직선이 없다면 0을 리턴
    }
    
    // 두 직선이 평행한지 확인하는 메서드
    private boolean checkParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        // 직선 1-2와 직선 3-4의 기울기 비교
        int dx1 = dot2[0] - dot1[0];
        int dy1 = dot2[1] - dot1[1];
        int dx2 = dot4[0] - dot3[0];
        int dy2 = dot4[1] - dot3[1];
        
        // 크로스 곱으로 기울기 비교 (dy1/dx1 == dy2/dx2 을 (dy1 * dx2 == dy2 * dx1)로 변형)
        return dy1 * dx2 == dy2 * dx1;
    }
}