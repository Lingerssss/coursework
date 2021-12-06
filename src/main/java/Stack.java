import java.util.ArrayList;
import java.util.List;


/**
 * This is a Stack class
 * @author Jiayue Zhang
 * @version 1.0
 */
public class Stack {
    private Integer size;
    private final List<Entry> entries =new ArrayList<>();

    /**
     * This method returns the size of stack.
     * @return the size of stack.
     */
    public int size() {
        this.size=entries.size();
        return this.size;
    }

    /**
     * This method add an entry to the stack
     * @param entry The entry need to be added.
     */
    public void push(Entry entry) {
            entries.add(entry);
    }

    /**
     * This method delete the top entry of the stack
     * @exception EmptyStackException pop when the stack is empty
     * @see EmptyStackException
     */
    public void pop() {
        if (size() == 0) {
            throw new EmptyStackException("The Stack is empty");
        }
        int index = size() - 1;
        entries.remove(index);
    }

    /**
     * This method return the top entry of the stack
     * @exception EmptyStackException top when the stack is empty
     * @see EmptyStackException
     */
    public Entry top() {
        if (size() == 0) {
            throw new EmptyStackException("The Stack is empty");
        }
        int index = size() - 1;
        return entries.get(index);
    }
}
