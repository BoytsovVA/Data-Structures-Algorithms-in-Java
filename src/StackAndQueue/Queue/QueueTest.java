package StackAndQueue.Queue;

public class QueueTest {
    public static void main(String[] args) {
        int n = 3;
        SimpleQueue queue = new SimpleQueue(3);
        queue.insert(10);
        queue.insert(20);
        queue.insert("fff");
        queue.insert(40);
        queue.display();
        System.out.println("__________");
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.remove());
        }
        System.out.println("__________");
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        for (int i = 0; i < 4; i++){
            System.out.print(" " + queue.remove());
        }
        queue.insert(90);
        System.out.println("_____");
        System.out.println(queue.remove());
        queue.insert(100);
        System.out.println(queue.remove());
        System.out.printf(queue.size().toString());

        System.out.println("PriorityQueue\n");
        PriorityQueue pq = new PriorityQueue(3);
        pq.insert(30);
        pq.remove();
        pq.insert(50);
        pq.insert(10);
        pq.insert(20);
        pq.insert(20);
        pq.display();
        System.out.println(" ");
//        while (!pq.isEmpty()) {
//            System.out.print(pq.remove() + " ");
//        }
        pq.remove();
        pq.remove();
        pq.remove();
        pq.remove();
        pq.insert(60);
        pq.remove();
        pq.display();
    }
}
