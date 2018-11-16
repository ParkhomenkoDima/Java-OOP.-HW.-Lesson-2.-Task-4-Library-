package OopHomeWork2.Library;

public class Book {
    /*Свойства: название, автор, издательство, год издания, количество страниц, цена, тип переплета.*/
    private String name = "";
    private String author = "";
    private String publishingHouse = "";

    private int yearOfPublishing = 0;
    private int numberOfPages = 0;

    private double price = 0;

    private String bindingType = "";

    public Book(String name, String author, String publishingHouse, int yearOfPublishing, int numberOfPages, double price, String bindingType) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
