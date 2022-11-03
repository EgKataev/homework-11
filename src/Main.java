public class Main {
    public static void main(String[] args) {
        System.out.println("level easy");
        Author stephenKing = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation", stephenKing, 1997);

        Book secondBook = new Book("Effective Java", new Author("Joshua", "Bloch"), 2015);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());

    }
}