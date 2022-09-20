package com.sophia.days30;

public class Day17MoreException {
   // class Calculator{
        int power(int n,int p) throws Exception {
            if(n>=0 && p>=0) {
                int result = n;
                for(int i = 1;i<p;i++){
                    result = result * n;
                }
                return result;
            }else{
                throw new Exception("n and p should be non-negative");

            }

        }
    }
//class Calculator{
//    int power(int n,int p) throws Exception {
//        if(n < 0 || p < 0) {
//            throw new Exception("n and p should be non-negative");
//        }else{
//            int result = (int)Math.pow(n,p);
//            return result;
//
//        }
//
//    }
//}
