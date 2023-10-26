import java.util.*;

public class Solution49 {
//    使用哈希来减少查找的时间复杂度，对于字母异位词，可以对每个单词首先进行排序，然后将排序后的结果作为
//    键，也可以对每个字母出现的频数进行统计，将每个“字母+频度”拼接起来的字符串作为键
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
//            对数组的操作一般使用工具类Arrays，对于排序，sort后面还可以提供一个Comparator，以此来提供更多样的
//            排序，常用的内置Comparator有String.CASE_INSENSITIVE_ORDER(忽略字母大小写进行排序)，
//            还有Collections.reverseOrder()返回的逆序的排序器
//            支持排序的两种方式：第一种方式是让被排序对象实现comparable接口，第二种方式是单独写一个排序类，实现comparator<T>接口
            Arrays.sort(chars);


//            字符数组转为字符串的方法为String.valueOf(),以下这种方法转换出来的为[1,a,c,4]这种形式
            String key= Arrays.toString(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
        }
//        补充List.copyOf（）方法，将Collection对象转化为不可更改型List，如果进行操作就会抛出异常
        return new ArrayList<List<String>>(map.values());

    }

    public static void main(String[] args) {

//        二分查找api
        System.out.println(Arrays.binarySearch(new int[]{0,10,10,10,10,10},10));

    }
}
