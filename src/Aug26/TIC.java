package Aug26;

public class TIC {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter");
        BookReader reader_1 = new BookReader(book);
        BookReader reader_2 = new BookReader(book);

        Thread thread_1 = new Thread(reader_1, "Tanay");
        Thread thread_2 = new Thread(reader_2, "Yogesh");

        thread_2.start();
        thread_1.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BookWriter bookWriter = new BookWriter(book);
        Thread bookWriterThread = new Thread(bookWriter);
        bookWriterThread.start();

    }
}
