package com.sophia.PreparationKit;

import java.util.Arrays;
import java.util.List;

public class MigatoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int max = 0;//bird id
        int timesSpotted[] = new int[arr.size()];
        Arrays.fill(timesSpotted,0);
        for(int i = 0;i < arr.size();i++){
            timesSpotted[arr.get(i)] +=1;
        }
        for(int i = 0;i<timesSpotted.length;i++){
            if(timesSpotted[i]>timesSpotted[max]
            ){
                max = i;
            }
        }
        return max;
    }

}

//    public static int migratoryBirds(List<Integer> arr) {
//        // Write your code here
//        int birdId =1;
//        for(int i = 2;i<=5;i++){ i = bird Id
//            if(Collections.frequency(arr, i)> Collections.frequency(arr, birdId)){
//                birdId = i;
//            }
//        }
//        return birdId;
//    }
//}
