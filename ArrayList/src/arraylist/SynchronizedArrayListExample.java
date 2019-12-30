/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author asus
 */
public class SynchronizedArrayListExample {
    public static void main(String[] args) throws InterruptedException{
        List<Integer> safeArrayList = Collections.synchronizedList(new ArrayList<>());
        safeArrayList.add(1);
        safeArrayList.add(2);
        safeArrayList.add(3);
        
        // tạo một nhóm luồng có kích thước 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        // Tạo một tác vụ có thể chạy để tăng từng phần tử của ArrayList lên một
        Runnable task = () ->{
            incrementArrayList(safeArrayList);
        };
        
        // gửi nhiệm vụ cho dịch vụ thực thi 100 lần.
        // Tất cả các tác vụ sẽ sửa đổi đồng thời ArrayList
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
         
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        
        System.out.println(safeArrayList);
    }
    // tăng tất cả các giá trị trong ArrayList lên một
    private static void incrementArrayList(List<Integer> safeArrayList){
        synchronized(safeArrayList){
            for (int i = 0; i < safeArrayList.size(); i++) {
                Integer value = safeArrayList.get(i);
                safeArrayList.set(i, value+1);
            }
        }
    }
}
