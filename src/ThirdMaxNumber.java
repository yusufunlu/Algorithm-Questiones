// @author yusufu
public class ThirdMaxNumber {

    public static void main(String[] ars){
        int[] a = new int[]{2,1, 3, 5, 3, 2};

        thirdMax(a);
    }

    public static int thirdMax(int[] nums) {

        long  max1= Long.MIN_VALUE;
        long  max2= Long.MIN_VALUE;
        long  max3= Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if( nums[i]>max1) {
                max3=max2;
                max2=max1;
                max1=nums[i];
            } else if(nums[i]>max2 && nums[i]!=max1){
                max3=max2;
                max2=nums[i];
            } else if(nums[i]>max3 && nums[i]!=max1 && nums[i]!=max2){
                max3=nums[i];
            }
        }


        System.out.println("maxes: "+ max1+""+ max2+""+ max3);

        if(max3==Long.MIN_VALUE){
            return (int)max1;
        } else {
            return (int)max3;
        }

    }
}
