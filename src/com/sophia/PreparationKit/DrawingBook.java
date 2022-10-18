package com.sophia.PreparationKit;

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // p/2 is from left to right from start
        //n/2 total pages
        //(n/2)-(p/2) is from right to left from end
        return Math.min(p/2, (n/2)-(p/2));
    }


}
