package com.example.javalearning;

public class myMEthods {
    public static void main(String[] args) {
        String TvShow = "TrueBlood";
        //starting point
        GetMapData();

        GetTvShows(TvShow, 9);

        getArea(81, 54);
    }
    public static void GetMapData(){
        System.out.println("It is Wednesday");
    }
    public static void GetTvShows(String TvShow, int yearsOn){


        System.out.println(TvShow + " Years on TV is " + yearsOn);
    }
    public static int getArea(int length, int width){
        int MyReturnValue = length + width;
        //return length + width;
        return MyReturnValue;
    }
}