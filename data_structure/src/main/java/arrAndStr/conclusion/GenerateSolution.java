package arrAndStr.conclusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author longyh
 * @Description: 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * @analysis:
 * @date 2022/4/2 2:35 下午
 */
public class GenerateSolution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;

    }
}

/**
 * List<List<Integer>> arrayList = new ArrayList<>();
 * List<Integer> list = Arrays.asList(1);
 * arrayList.add(list);
 * if (numRows == 1) {
 * return arrayList;
 * }
 * <p>
 * for (int i = 1; i < numRows; i++) {
 * <p>
 * //(x-1,y-1) + (x-1,y)
 * <p>
 * list=new ArrayList<>();
 * for(int j=0;j<i +1;j++){
 * int first;
 * int second;
 * if(j-1< 0){
 * first=0;
 * }else{
 * first=arrayList.get(i-1).get(j-1);
 * }
 * <p>
 * if(arrayList.get(i-1).size()<=j){
 * second=0;
 * }else{
 * second=arrayList.get(i-1).get(j);
 * }
 * int sum=first+second;
 * list.add(sum);
 * }
 * arrayList.add(list);
 * }
 * <p>
 * return arrayList;
 */
