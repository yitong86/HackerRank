package com.sophia.PreparationKit;

import java.util.*;

public class MigatoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
            Map<Integer, Integer> map = new HashMap<>();
            int number;
            int frequence;
            for (int i = 0; i < arr.size(); i++) {//arr = [1 1 2 2 3]
                number = arr.get(i);
                if (map.containsKey(arr.get(i))) {//i =0,1,2,3
                    frequence = map.get(number);
                    frequence++;
                    map.replace(number, frequence);//{1:2,2:2}

                } else {
                    map.put(number, 1);//{1:1,2:1,}

                }
            }
//map.entrySet() get set view []
        //Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
        //The set is: [20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4]
            number = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            return number;
        }
    }


//        int max = 0;//bird id
//        int timesSpotted[] = new int[arr.size()];
//        Arrays.fill(timesSpotted,0);
//        for(int i = 0;i < arr.size();i++){
//            timesSpotted[arr.get(i)] +=1;
//        }
//        for(int i = 0;i<timesSpotted.length;i++){
//            if(timesSpotted[i]>timesSpotted[max]
//            ){
//                max = i;
//            }
//        }
//        return max;
//    }
//
//}

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
