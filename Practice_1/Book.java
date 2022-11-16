package Practice_1;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return pages;
    }

    public String toString() {
        return this.name + ", pages " + this.pages;
    }
}
