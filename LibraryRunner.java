package OopHomeWork2.Library;

public class LibraryRunner {
   /* Book (книга).
        Свойства: название, автор, издательство, год издания, количество страниц, цена, тип переплета.
    Library (библиотека).
        Свойства: список книг.
        Методы:
            поиск книг заданного автора
            поиск книг, выпущенных заданным издательством
            поиск книг, выпущенных после заданного года
    Клиентский класс LibraryRunner: протестировать функционал предыдущих классов.*/
   public static void main(String[] args) {
        Library library = new Library();

       Book javaBook1 = new Book("Thinking in Java", "Bruce Eckel",
               "Prentice Hall", 1998, 1489,
               100500,"https://archive.org/details/TIJ4CcR1");
       library.addBook(javaBook1);

       Book javaBook2 = new Book("Thinking C++", "Bruce Eckel",
               "Prentice Hall", 2000, 878,
               100500,"https://www.micc.unifi.it/bertini/download/programmazione/TICPP-2nd-ed-Vol-one-printed.pdf");
       library.addBook(javaBook2);

       Book javaBook3 = new Book("Clean Code", "Robert C. Martin",
               "Prentice Hall PTR", 2008, 464,
               100500,"https://www.investigatii.md/uploads/resurse/Clean_Code.pdf");
       library.addBook(javaBook3);

       Book javaBook4 = new Book("Head First Java, 2nd Edition", "Bert Bates, Kathy Sierra",
               "O'Reilly Media, Inc.", 2005, 708,
               100500,"мягкий");
       library.addBook(javaBook4);

       System.out.println("Книги автора Bruce Eckel: " + library.findByAuthor("Bruce Eckel"));
       System.out.println("Книги издательства Prentice Hall: " + library.findByPublishingHouse("Prentice Hall"));
       System.out.println("Книги после 2001 года: " + library.findByYearOfPublishing(2001));
   }


}
