import java.util.ArrayList;

public class StackArray implements Stack {

    private ArrayList<Object> stack = new ArrayList<>();

    // Yığına bir eleman ekler
    @Override
    public void push(Object item) {
        stack.add(0, item);  // başa ekle
    }
    // Yığından en üstteki elemanı çıkarıyormuş ve döndürüyormuş
    @Override
    public Object pop() {
        return stack.remove(0);  // baştan çıkar
    }
    // Yığının en üstündeki elemanı gösterir
    @Override
    public void peek() {
        System.out.println("The top is " + stack.get(0));
    }
    // Yığının boş olup olmadığını kontrol etmesi için
    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
