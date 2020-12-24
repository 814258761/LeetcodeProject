import java.util.HashSet;

public class Solution874 {

    class Solution {
        public int robotSim(int[] commands, int[][] obstacles) {

            HashSet hashSet = new HashSet();

            for (int[] obstacle : obstacles) {
                hashSet.add(obstacle[0]+","+obstacle[1]);
            }

            int[] dx = {0,1,0,-1};
            int[] dy = {1,0,-1,0};
            int x = 0;
            int y = 0;
            int curDir = 0;
            double dist = 0;

            for (int command : commands) {
                if (command > 0 ){
                    for (int i = 1; i <= command; i++) {
                        if(hashSet.contains((x + dx[curDir])+","+(y + dy[curDir]))){
                            break;
                        }
                        x = x + dx[curDir];
                        y = y + dy[curDir];
                        dist =Math.max(dist,Math.pow(x,2)+Math.pow(y,2));
                    }
                }else{
                    curDir = command == -1 ? (curDir + 1) % 4 : (curDir + 3) % 4;
                }
            }

            return (int)dist;
        }
    }
}
