package lv.tsi.sync;

class TaskManager {
    synchronized static void performTask(Thread threadName, int taskId) {
        System.out.println(threadName.getName() + " " + taskId);
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName.getName() + " " + taskId);
    }

}

class TaskThread extends Thread {
    static String name;
    Thread threadName = new Thread();
    int taskId;
    TaskManager obj;
    TaskThread(String name, int taskId, TaskManager obj) {
        TaskThread.name = name;
        threadName.setName(name);
        this.taskId = taskId;
        this.obj = obj;
    }
    public void run() {
        TaskManager.performTask(threadName, taskId);
    }
}

class SyncMain {
    public static void main(String[] args) throws InterruptedException {
        final TaskManager obj = new TaskManager();
        TaskThread name1 = new TaskThread("name1", 1, obj);
        TaskThread name2 = new TaskThread("name2", 2, obj);
        name1.run();
        Thread.sleep(2);
        name2.run();
    }
}