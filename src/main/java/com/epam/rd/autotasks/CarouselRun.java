package com.epam.rd.autotasks;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

import static com.epam.rd.autotasks.DecrementingCarousel.isRunning;
import static com.epam.rd.autotasks.DecrementingCarousel.que;

public class CarouselRun{

    public CarouselRun() {
    }

    public int next() {
       int currentElement = -1 ;
        if(que.isEmpty())
        {
            return currentElement;
        }
       else {
           currentElement = que.poll();
           if(!(currentElement-1 <= 0)) que.offer(currentElement-1);
           if(que.isEmpty()) isRunning = false;
       }
       return  currentElement;
    }

    public boolean isFinished() {
        return que.isEmpty();
    }
}
