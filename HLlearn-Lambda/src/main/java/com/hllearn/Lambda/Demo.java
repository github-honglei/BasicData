package java.com.hllearn.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

    private void Demo_1(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 遍历输出
        numbers.forEach(System.out::println);
        // 遍历输出 简化版
        numbers.forEach(System.out::println);
        // Predicat 封装处理逻辑
        filter(numbers, x -> (int) x % 2 == 0);
        // stream.map
        List<Integer> l1 = numbers.stream().map(x -> (x * 2)).collect(Collectors.toList());
        // stream.map + function
        List<Integer> l2 = numbers.stream().map(x -> (addFUN(x) * 2)).collect(Collectors.toList());
        // 替代Runnable
        Runnable r = () -> {
            //TODO
        };
        Thread t = new Thread(r);
        t.start();
        // 替代Runnable 简化
        Thread t1 = new Thread(() -> {
            //TODO
        });
        t1.start();
    }

    private int addFUN(int num){
        int i = num;
        i++;
        return i;
    }

    private void filter(List list, Predicate condition){
        list.forEach(x -> {
            if(condition.test(x)){
                //TODO
            }
        });
        list.stream().filter(condition::test).forEach(x ->{
            //TODO
        });
    }



}
