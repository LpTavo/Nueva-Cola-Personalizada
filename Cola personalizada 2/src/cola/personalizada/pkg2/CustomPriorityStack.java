import java.util.ArrayList;
import java.util.List;

public class CustomPriorityStack<T> {
    private List<T> stack;

    public CustomPriorityStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

   
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int lastIndex = stack.size() - 1;
        return stack.remove(lastIndex);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

 
    public void printStack() {
        System.out.println("Contenido de la cola:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}
