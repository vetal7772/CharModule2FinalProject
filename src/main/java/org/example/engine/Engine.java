package org.example.engine;

public class Engine {

    public  void go() {
        Thread plantRunnerThread = new Thread(new PlantRunner());
        plantRunnerThread.start();
         Thread animalRunnerThread = new Thread(new AnimalRunner());
         animalRunnerThread.start();
         Thread printInfo = new Thread(new StatisticInfo());
         printInfo.start();
    }
    public class PlantRunner implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("i= "+i);
            }
        }
    }

    public class AnimalRunner implements Runnable{

        @Override
        public void run() {
            for (int j = 100; j >0 ; j--) {
                System.out.println("j " + j);
            }
        }
    }

    public class StatisticInfo implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Print INFO");
        }
    }
}
