package lv.tsi.producer_consumer;
/* Really not sure what I am supposed to do here
class Goods {
    static int amount;
    Goods(int amount) {
        Goods.amount = amount;
    }
    synchronized void produce(int amount) throws InterruptedException {
        while(amount != 0) wait();
        amount = 100;
        notify();
    }
    synchronized int consume() throws InterruptedException {
        while (!goods) wait();
        notify();
        return amount;
    }
}

class Producer extends Thread {
    Goods param;
    Producer(Goods param) {
        this.param = param;
    }
    public void run() {
        while (true) {
            param = new Goods(20);
            System.out.println("Produced: 20");
        }
    }
}

class Consumer extends Thread {
    Goods param;
    Consumer(Goods param) {
        this.param = param;
    }
    public void run() {
        while (true) {
            param = new Goods(20);
        }
    }
}

class ProducerConsumerMain {

}


 */