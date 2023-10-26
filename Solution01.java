import java.util.HashMap;
import java.util.Map;

public class Solution01 {
//
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
//        将数组映射为（nums[i]，i）的形式存入map中
        //先找两数在数组中比较靠后一个元素，通过检查（target-当前值）是否在map中来确定是否是最终答案
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else {
                return new int[]{map.get(target - nums[i]),i};
            }
        }
//        创建数组的方法：
//        静态初始化(不知道数据的长度，但是知道数据是哪些)：int a[]=new int[]{1,2,3}，或int a[]={1,2,3}
//        动态初始化（知道数组长度但是不知道数据是什么）：int a[]=new int[3]，初始值默认为0
       return new int[]{0,0};
    }
}
