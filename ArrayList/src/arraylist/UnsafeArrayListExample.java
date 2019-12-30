/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author asus
 */
public class UnsafeArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(2);
        unsafeArrayList.add(3);
        
        // Tạo nhóm luồng có kích thước 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        // Tạo một tác vụ Runnable tăng từng phần tử của ArrayList lên một
            Runnable task = () -> {
            incrementArrayList(unsafeArrayList);
        };
        // Gửi tác vụ đến dịch vụ thực thi 100 lần.
        // Tất cả các tác vụ sẽ sửa đổi ArrayList đồng thời
            for (int i = 0; i < 100; i++) {
                executorService.submit(task);
            }
            executorService.shutdown();
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        
            System.out.println(unsafeArrayList);
        }    
        // Tăng tất cả các giá trị trong ArrayList bởi một
        private static void incrementArrayList(List<Integer> unsafeArrayList){
                for (int i = 0; i < unsafeArrayList.size(); i++) {
                    Integer value = unsafeArrayList.get(i);
                    unsafeArrayList.set(i,value + 1);
                }
            }
        }
    

