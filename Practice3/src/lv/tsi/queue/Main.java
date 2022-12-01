package lv.tsi.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class AddingThread extends Thread {
    BlockingQueue<String> bq;
    AddingThread(BlockingQueue<String> bq) {
        this.bq = bq;
    }
    public void run() {
        for(int i = 0; i < 3; i++) {
            bq.add("Element" + i);
            System.out.println("Element" + i + " has been added.");
        }
    }
}

class TakingThread extends Thread {
    BlockingQueue<String> bq;
    TakingThread(BlockingQueue<String> bq) {
        this.bq = bq;
    }
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 3; i++) {
            try {
                bq.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Element" + i + " has been taken.");
        }
    }
}

class BlockingMain {
    public static void main(String[] args) {
        final BlockingQueue<String> obj = new BlockingQueue<>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public void put(String s) throws InterruptedException {

            }

            @Override
            public boolean offer(String s, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public String take() throws InterruptedException {
                return null;
            }

            @Override
            public String poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public int remainingCapacity() {
                return 0;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public int drainTo(Collection<? super String> c) {
                return 0;
            }

            @Override
            public int drainTo(Collection<? super String> c, int maxElements) {
                return 0;
            }
        };
        Thread addingThread = new AddingThread(obj);
        Thread takingThread = new TakingThread(obj);
        addingThread.run();
        takingThread.run();
    }
}