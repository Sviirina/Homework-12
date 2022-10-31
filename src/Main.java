public class Main {

    public static void main(String[] args) {

        Author joanneRowling  = new Author ("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", joanneRowling, 1997);
        Book theIdiot = new Book("The Idiot", new Author("Fyodor","Dostoyevsky"), 1868);
        harryPotter.setYear(2000);
        System.out.println(harryPotter.getYear());
    }
}