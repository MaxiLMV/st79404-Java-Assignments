package lv.tsi.priority;

class PriorityThread extends Thread {
    static String name;
    Thread threadName = new Thread();
    PriorityThread(String name) {
        PriorityThread.name = name;
        threadName.setName(name);
    }
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println(threadName.getName() + " " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class PriorityMain {
    public static void main(String[] args) {
        PriorityThread min = new PriorityThread("min");
        min.run();
        PriorityThread norm = new PriorityThread("norm");
        norm.run();
        PriorityThread max = new PriorityThread("max");
        max.run();
    }
}