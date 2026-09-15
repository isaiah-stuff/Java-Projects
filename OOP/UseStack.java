package OOP;// OOP.UseStack.java
// Isaiah Stuffle

// Create a stack object
public class UseStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        //push new elements onto the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Pop the element
        while (myStack.empty() != true) {
            System.out.println(myStack.top());
            myStack.pop();
        }
    }
}
