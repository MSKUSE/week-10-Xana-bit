public class StackLinkedList implements Stack {

    private StackItem top;

    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }

    @Override
    public Object pop() {
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is " + top.getData());
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
