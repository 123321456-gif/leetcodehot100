public class Solution283 {
    public void moveZeroes(int[] nums) {
//        使用双指针法，将所有非零元素前移到开头，最后给所有元素赋值
           int i=0,j=0;
           for (j=0;j< nums.length;j++){
               if(nums[j]!=0){
                   nums[i]=nums[j];
                   i++;
               }
           }
           while(i<nums.length)nums[i++]=0;
    }
}
