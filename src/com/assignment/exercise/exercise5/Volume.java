package com.assignment.exercise.exercise5;

public class Volume {


    public int volumeOfBoxes(int dimensions[][])
    {
        int sum=0;
        for(int i=0;i<dimensions.length;i++)
        {   int volumeOfOneBox=1;
            for(int j=0;j< dimensions[i].length;j++)
            {
                volumeOfOneBox=volumeOfOneBox*dimensions[i][j];
            }
            sum=sum+volumeOfOneBox;
        }
        return sum;
    }

    public static void main(String[] args) {
        Volume volume=new Volume();
        int sum=volume.volumeOfBoxes(new int[][]{{4,5,6},{6,7,8},{8,8,8},{9,1,3}});
        System.out.println("SUMOF VOLUME OF BOXES:: "+sum);
    }
}
