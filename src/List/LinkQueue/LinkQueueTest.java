package List.LinkQueue;

import List.LinkQueue.LinkQueue;

public class LinkQueueTest {
    public static void main(String[] args) {
        LinkQueue lq = new LinkQueue();
        lq.insert(20);
        lq.insert(40);
        lq.display();
        lq.insert(60);
        lq.insert(80);
        lq.display();
        lq.remove();
        lq.remove();
        lq.display();
    }
}
