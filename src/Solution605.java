public class Solution605 {
    public static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            for (int i = 0; i < flowerbed.length; i++) {
                if(i == 0 && flowerbed.length>=2 && flowerbed[i] == 1){
                    flowerbed[i+1] = 2;
                }else if(i == flowerbed.length-1 && flowerbed.length>=2 && flowerbed[i] == 1){
                    flowerbed[i-1] = 2;
                }else {
                    if (flowerbed[i] == 1){
                        if (i+1 < flowerbed.length){
                            flowerbed[i+1] = 2;
                        }

                        if (i-1 >= 0){
                            flowerbed[i-1] = 2;
                        }
                    }
                }
            }
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0){
                    count++;
                    flowerbed[i] = 1;
                    if (i+1 < flowerbed.length){
                        flowerbed[i+1] = 2;
                    }

                    if (i-1 >=0){
                        flowerbed[i-1] = 2;
                    }
                }
            }

            return count >= n;
        }
    }

    public static void main(String[] args) {
        Boolean b = new Solution().canPlaceFlowers(new int[]{0,0,1,0,0},1);
        System.out.println(b);
    }
}
