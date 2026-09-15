package OOP;

public class RudamentayQueue {
    private int [] queueRef;
    private int maxLen, rear, head;
    // Create deconstructor
    public RudamentayQueue() {
        //create data members
        queueRef = new int [100];
        maxLen = 99;
        rear = -1;
        head = 0;
    }

    // Enqueue
    public void enqueue(int num) {
        queueRef[++rear] = num;
    }

    // Dequeue
    public void dequeue() {head++;}
    
    // Peek
    public int peek() {return queueRef[head];}

    // The empty method
    public boolean empty() {
        return head == rear + 1;
    }
}

