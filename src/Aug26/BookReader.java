package Aug26;

public class BookReader implements Runnable {

    final Book book;


    public BookReader(Book book) {
        super();
        this.book = book;
    }

    @Override
    public void run() {
        synchronized (book) {
            System.out.println(Thread.currentThread().getName() + " Waiting ... " + book.getTitle());
            try {
                book.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Completed! ");
        }
    }

}