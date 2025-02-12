package list.linkedlist;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int id;
    private String name;
    private String author;
    private int page;

    public Book() {
    }

    public Book(int id, String name, String author, Integer page) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.page = page;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;

        return id == book.id && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(page, book.page);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Objects.hashCode(page);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + ", page=" + page + '}';
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }
}
