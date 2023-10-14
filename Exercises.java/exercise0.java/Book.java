public class Book {
    private static int instanceCount = 0;
    private int id;
    private String title;
    private String author;
    private String genre;
    private int numPages;
    private int publicationYear;
    private String isbn;
    private String coverType;
    private double price;

    public Book(String title, String author, String genre, int numPages,
            int publicationYear, String isbn, String coverType, double price) {
        this.id = ++instanceCount;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.coverType = coverType;
        this.price = price;

        System.out.println("Created Book #" + id + " - " + title + " by " + author+ " " + genre+ " " + numPages+ " " + publicationYear+ " " + isbn+ " " + coverType+ " " + price);
    }

    public void open() {
    }

    public void readPage() {
    }

    public void close() {
    }
}
