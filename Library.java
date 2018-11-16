package OopHomeWork2.Library;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public final void addBook(Book book) {
        library.add(book);
    }

    public final ArrayList<Book> findByAuthor(String author){
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : library) {
            if (book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }

    public final ArrayList<Book> findByPublishingHouse(String publishingHouse){
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : library) {
            if (book.getPublishingHouse().equals(publishingHouse)){
                result.add(book);
            }
        }
        return result;
    }

    public final ArrayList<Book> findByYearOfPublishing(int yearOfPublishing){
        ArrayList<Book> result = new ArrayList<>();

        for (Book book : library) {
            if (book.getYearOfPublishing() >= yearOfPublishing){
                result.add(book);
            }
        }
        return result;
    }
}
