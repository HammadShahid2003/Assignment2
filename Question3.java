/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.*;

/**
 *
 * @author hamma
 */
public class Question3 {
    
public static void main(String[] args) {
    List<int[]> intervals = new ArrayList<>();
    intervals.add(new int[]{1, 3});
    intervals.add(new int[]{2, 6});
    intervals.add(new int[]{8, 10});
    intervals.add(new int[]{15, 18});

    mergeIntervals(intervals);

    for (int[] interval : intervals) {
        System.out.println("[" + interval[0] + ", " + interval[1] + "]");
    }
}


public static void mergeIntervals(List<int[]> intervals) {
    if (intervals.isEmpty()) {
        return;
    }

    int index = 0;
    for (int i = 1; i < intervals.size(); i++) {
        int[] currentInterval = intervals.get(index);
        int[] nextInterval = intervals.get(i);

        if (currentInterval[1] >= nextInterval[0]) {
           
            currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
        } else {
            
            index++;
            intervals.set(index, nextInterval);
        }
    }

    
    intervals.subList(index + 1, intervals.size()).clear();
}




}