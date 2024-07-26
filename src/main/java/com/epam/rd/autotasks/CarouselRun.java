package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.carousalQue;
import static com.epam.rd.autotasks.DecrementingCarousel.isRunning;

public class CarouselRun{
    int capacity;
    CarouselRun(int capacity)
    {
        this.capacity = capacity;
    }

    public int next() {
       int currentElement = -1 ;
        if(carousalQue.isEmpty())
        {
            return currentElement;
        }
       else {
           currentElement = carousalQue.poll();
           if(!(currentElement-1 <= 0)) carousalQue.offer(currentElement-1);
           if(carousalQue.isEmpty()) isRunning = false;
       }
       return  currentElement;
    }

    public boolean isFinished() {
        return carousalQue.isEmpty();
    }
}
