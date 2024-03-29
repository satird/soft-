package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 100, 20, 66, 16};
        int[] result = decryptData(arr, 50, 1, 3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] decryptData(int[] price, int discount, int offset, int readLength) {
        return Arrays.stream(price).skip(offset).limit(readLength).mapToDouble(d -> (double) d).map(e -> e/100*discount).mapToInt(i ->(int)i).toArray();
    }
// Если нельзя использовать StreamAPI из Java 8 (minSdkVersion = 21, а не minSdkVersion = 24)
//    private static int[] decryptData(int[] price, int discount, int offset, int readLength) {
//        List<Integer> list = new ArrayList<>(price.length);
//        for (int integer:  price) {
//            list.add(integer);
//        }
//        List<Integer> sublist = list.subList(offset, offset+readLength);
//        List<Double> resultDouble = new ArrayList<>(sublist.size());
//        for (Integer item: sublist) {
//            resultDouble.add(Double.valueOf(item)/100*discount);
//        }
//        List<Integer> resultInteger = new ArrayList<>();
//        for (Double item: resultDouble) {
//            resultInteger.add(item.intValue());
//        }
//        return toIntArray(resultInteger);
//    }
//
//
//    public static int[] toIntArray(List<Integer> list)  {
//        int[] ret = new int[list.size()];
//        int i = 0;
//        for (Integer e : list)
//            ret[i++] = e;
//        return ret;
//    }

}
