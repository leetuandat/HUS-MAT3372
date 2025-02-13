package lab09.Library;

public abstract class Item {
    String title;
    int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("[title=\'%s\', year=%d", title, year);
    }
}
