package OOP;// OOP.Stack.java
// Isaiah Stuffle

// Ch.11 PE 7 stack example
public class Stack {
    private int [] stackRef;
    private int maxLen, topPtr;
    // Create deconstructor
    public Stack() {
        //create data members
        stackRef = new int [100];
        maxLen = 99;
        topPtr = -1;
    }

    // The push operation
    public void push(int num) {
        stackRef[++topPtr] = num;
    }

    //The pop operation
    public void pop() {
        topPtr--;
    }

    // The top operation
    public int top() {
        return stackRef[topPtr];
    }

    // The empty method
    public boolean empty() {
        return topPtr == -1;
    }
}
