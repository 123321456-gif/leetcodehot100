import java.util.HashMap;
import java.util.Map;

public class Solution128 {
//    思路：利用哈希存储，首先将整个数组内的元素存入hashMap中
//    从当前遍历到的值逐渐加一，依次检查其是否存在在数组中，从而确定连续序列的长度
//    难点：判断遍历到的当前值（X）是否可以直接跳过，而不必再执行上述步骤，解决方法，判断X-1是否在数组中即可
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int len=1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                len=1;
                int start=nums[i]+1;
                while(map.get(start)!=null&&map.get(start)==1){
                    len++;
                    start++;
                }
                if(map.get(start)!=null&&map.get(start)>1)len+=map.get(start);
                start=nums[i];
                int j=0;
                while(map.get(start)!=null&&map.get(start)==1){
                    map.put(start,len-j);
                    j++;
                    start++;
                }
                if(len>max)max=len;
            }
        }
        return max;
    }
}
