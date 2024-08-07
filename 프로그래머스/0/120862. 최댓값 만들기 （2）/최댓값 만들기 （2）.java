class Solution {
    public int solution(int[] numbers) {
        //int max = 0;
        // 최댓값이 음수일 케이스 생각
        int max = Integer.MIN_VALUE;

        
        for(int i = 0; i < numbers.length - 1; i++) {
            // 중복x ex) 0.0, 1.1
            for(int j = i + 1; j < numbers.length; j++) {
                int gop = numbers[i]*numbers[j];
                
                if(gop > max) {
                    max = gop;
                }
            }
        }
        
        return max;
    }
}
// 추가로 Arrays.sort 사용하여 정열 후 맨 앞 2개, 맨 뒤 2개 비교 후 최댓값 찾기 (음수의 곱, 양수의 곱 비교)
