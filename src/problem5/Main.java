package problem5;

public class Main {
    public static void main(String[] args) {
        Book book3 = new Book("Clean Code"," Robert C. Martin",2008);
        Book book2 = new Book("1984","George Orwell",1949);
        Book book1 = new Book("The Hobbit","J.R.R. Tolkien",1937);
        System.out.println("=======Stack test=======");
        BookStack stack = new BookStack();
        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        stack.display();
        stack.pop();
        stack.peek();
        stack.display();
        System.out.println("=======Queue test=======");
        BookQueue queue = new BookQueue();
        queue.enqueue(book1);
        queue.enqueue(book2);
        queue.enqueue(book3);
        queue.display();
        queue.dequeue();
        queue.peek();
        queue.display();
    }
}
