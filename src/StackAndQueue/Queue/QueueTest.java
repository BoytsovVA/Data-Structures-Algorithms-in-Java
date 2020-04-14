package StackAndQueue.Queue;

public class QueueTest {
    public static void main(String[] args) {
        int n = 3;
        SimpleQueue queue = new SimpleQueue(3);
        System.err.println("\nSimpleQueue\n");
        for (int i = 0; i < 12; i ++) {
            queue.insert(i * 10);
        }
        queue.display();
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.remove());
        }
        System.out.println(" ");
        System.err.println("Новая вставка");
        for (int i = 0; i < 12; i ++) {
            queue.insert(i * 100);
        }
        queue.display();
        System.out.println("\n");
        for (int i = 0; i < 4; i++){
            System.out.print(" " + queue.remove());
        }
        for (int i = 0; i < 4; i ++) {
            queue.insert(i);
        }
        System.out.println("\n_____");
        queue.display();
        System.out.println("Еще удаление");
        for (int i = 0; i < 12; i++)
            System.out.print(queue.remove() + " ");

        System.out.printf("\n" + queue.size().toString());

        System.err.println("\nPriorityQueue\n");
        PriorityQueue pq = new PriorityQueue(3);
        for (int i = 0; i < 12; i ++) {
            pq.insert(i * 10);
        }
        pq.display();
        System.out.println(" ");
//        while (!pq.isEmpty()) {
//            System.out.print(pq.remove() + " ");
//        }
        pq.remove();
        pq.remove();
        pq.remove();
        System.err.println("После удаления");
        pq.display();
        System.out.println(" ");
        System.err.println("Новая вставка");

        for (int i = 0; i < 12; i ++) {
            pq.insert(i * 100);
        }
        pq.display();
        System.out.println("\n");
        pq.remove();
        pq.display();
        System.out.println();
        pq.remove();
        pq.remove();
        pq.remove();
        pq.display();
        System.out.println();
        pq.insert(60);
        pq.display();
    }
}
