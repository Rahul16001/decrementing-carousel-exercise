package com.epam.rd.autotasks;
import java.util.ArrayDeque;


public class DecrementingCarousel{

    static boolean isRunning;
    static ArrayDeque<Integer> carousalQue;
    final int capacity;

    public DecrementingCarousel(int cap) {
        isRunning = false;
        carousalQue = new ArrayDeque<>();
        capacity = cap;
    }

    public boolean addElement(int element){
        if(isRunning || carousalQue.size() == capacity || element <= 0) return false;
        return carousalQue.offer(element);
    }

    public CarouselRun run() {
        if(!isRunning)
        {
            isRunning = true;
            return new CarouselRun(capacity);
        }
        else return null;
    }

}
