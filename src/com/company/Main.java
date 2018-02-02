package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int maxTsks = 5;
    public static int maxPts = 30;
    public static int maxAbil = 10;
    //public static int maxEmps = 50;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        double taskPts = random.nextInt(maxPts) +1;
        Task projTask = new Task(taskPts);

        ArrayList WorkerList = new ArrayList();

        boolean ask = true;
        while(ask){

            double workerAbil = random.nextInt(maxAbil) +1;
            Worker projWorker = new Worker(workerAbil);

            // calculate how many hours the worker will need
            double taskHrs = (int)Math.ceil(taskPts/workerAbil);

            System.out.println("task points " + taskPts);
            System.out.println("worker ability " + workerAbil);
            System.out.println("will take the following hours to complete: " + taskHrs);
            System.out.println("TESTING: taskPts / workerAbil = hours rounded up");

            System.out.println("Would you like to process another worker? 'Y' ");
            String userYN = sc.nextLine();
            if(userYN.equals("y")) {
                ask = true;
            } else {
                ask = false;
            }
        } // end while

    } // end main



} // end class
