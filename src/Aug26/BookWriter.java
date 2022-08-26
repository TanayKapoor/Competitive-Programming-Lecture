package Aug26;

public class BookWriter implements Runnable {

    final Book book;

    public BookWriter(Book book) {
        super();
        this.book = book;
    }

    @Override
    public void run() {
        synchronized (book) {
            System.out.println("Starting : " + book.getTitle());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            book.setFinished(true);
            System.out.println("Book completed!");

//            book.notify();
//            System.out.println("Notified reader");

            book.notifyAll();
            System.out.println("Notified reader");

        }
    }
}