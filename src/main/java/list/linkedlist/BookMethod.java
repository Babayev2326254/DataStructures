package list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class BookMethod {
    private LinkedList<Book> books;

    public BookMethod() {
        this.books = new LinkedList<>();
    }

    public BookMethod(LinkedList<Book> books) {
        this.books = books != null ? books : new LinkedList<>();
    }


    public LinkedList<Book> getBooks() {
        return books;
    }

    public void setBooks(LinkedList<Book> books) {
        this.books = books;
    }


    Scanner scanner = new Scanner(System.in);

    public void bookadd() {
        System.out.println("Kitabın ID-ni daxil edin:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kitabın adını daxil edin:");
        String name = scanner.nextLine();

        System.out.println("Kitabın müəllifini daxil edin:");
        String author = scanner.nextLine();

        System.out.println("Kitabın sehifesini daxil edin:");
        int year = scanner.nextInt();
        scanner.nextLine();

        Book book1 = new Book(id, name, author, year);
        books.add(book1);
        Collections.sort(books);
        System.out.println(books);
    }

    public void bookallview() {
        System.out.println(books);
    }

    public void booksdeletename() {
        System.out.println("Silinəcək kitabın adını daxil edin:");
        String namedelete = scanner.nextLine();
        boolean found = false;
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getName().equals(namedelete)) {
                books.remove(i);
                found = true;
                System.out.println("Kitab silindi.");
                break;
            }
        }
        if (!found) {
            System.out.println("Bu adda kitab yoxdur.");
        }
    }

    public void booksdeleteid() {
        System.out.println("Silinəcək kitabın ID-sini daxil edin:");
        int namedeleteid = scanner.nextInt();
        boolean found = false;
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getId() == namedeleteid) {
                books.remove(i);
                found = true;
                System.out.println("Kitab silindi.");
                break;
            }
        }
        if (!found) {
            System.out.println("Bu ID-də kitab yoxdur.");
        }
    }


    public void bookfindname() {
        System.out.println("Axtarılacaq kitabın adını daxil edin:");
        String namefind = scanner.nextLine();
        boolean found = false;
        for (Book item : books) {
            if (item.getName().equals(namefind)) {
                found = true;
                System.out.println("Kitab tapıldı: " + item);
                break;
            }
        }
        if (!found) {
            System.out.println("Bu adda kitab yoxdur.");
        }
    }

    public void bookcount() {
        int count = books.size();
        System.out.println(count);
    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof BookMethod that)) return false;

        return Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    @Override
    public String toString() {
        return "BookMethod{" +
                "books=" + books +
                '}';
    }
}
