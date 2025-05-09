public class Main {
    public static void main(String[] args) {
        Stack stack = new StackArray();

        stack.push("This is a string");
        stack.push(5);

        stack.peek();  // En üsttekini göster demekmiş
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Pop = " + stack.pop());
        stack.peek(); // en üstteki elemanı gösteriyormuş
    }
}
