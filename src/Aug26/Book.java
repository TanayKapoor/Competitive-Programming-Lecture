package Aug26;

public class Book {
    String title;
    boolean isFinished;

    public Book(String title) {
        super();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isFinished() {
        return isFinished;
    }
    public void setFinished(boolean isCompleted) {
        this.isFinished = isCompleted;
    }
}
