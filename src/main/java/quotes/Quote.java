package quotes;

public class Quote {
    // instance variables
    String author;
    String text;

    // constructor function
    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    // return in a string
    @Override
    public String toString() {
        return String.format(
                "%s wrote this amazing quote: %s",
                this.author,
                this.text);
    }
}
