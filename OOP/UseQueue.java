package OOP;

public class UseQueue {
    public static void main(String[] args) {
        RudamentayQueue myQueue = new RudamentayQueue();

        //OOP.Queue new elements onto the OOP.Queue
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        while (!myQueue.empty()) {
            System.out.println(myQueue.peek());
            myQueue.dequeue();
        }
    }
}
