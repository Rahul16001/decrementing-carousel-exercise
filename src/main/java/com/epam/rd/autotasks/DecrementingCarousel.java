package com.epam.rd.autotasks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecrementingCarousel {
    public static ArrayDeque<Integer> que;
    public static boolean isRunning;
    public static int capacity;

    public DecrementingCarousel(int cap) {
        que = new ArrayDeque<>();
        capacity = cap;
        isRunning = false;
    }

    public boolean addElement(int element){
        if(isRunning ||que.size() == capacity) return false;
        que.offer(element);
        return true;
    }

    public CarouselRun run() {
        if(!isRunning)
        {
            isRunning = true;
            return new CarouselRun();
        }
        else return null;
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        DecrementingCarousel carousel = new DecrementingCarousel(3);
//        CarouselRun carRun = null;
//        int inp;
//        while(true)
//        {
//            System.out.println("Press 1 to add Element");
//            System.out.println("Press 2 to run carousal");
//            System.out.println("Press 3 to do next");
//            System.out.println("Press 4 to check Finished");
//            inp = scan.nextInt();
//            if(inp == 1)
//            {
//                int num = scan.nextInt();
//                System.out.println(carousel.addElement(num));
//            }
//            else if(inp == 2)
//            {
//                if(carRun != null) System.out.println("Already Running");
//                else
//                {
//                    carRun = carousel.run();
//                    System.out.println("Run started");
//                }
//            }
//            else if(inp == 3)
//            {
//                if(carRun != null)
//                {
//                    System.out.println(carRun.next());
//                }
//                else System.out.println("Carousal not running");
//            }
//            else if(inp == 4)
//            {
//                if(carRun != null)
//                {
//                    System.out.println(carRun.isFinished());
//                }
//                else{
//                    System.out.println("Carousal not running");
//                }
//            }
//        }
//    }

}
