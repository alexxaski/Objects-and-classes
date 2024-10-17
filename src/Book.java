import java.util.Objects;

public class Book {
        private String title;
        private int yearOfPublication;
        private Author author;

        public Book(String title, int yearOfPublication, Author author) {
            this.title = title;
            this.yearOfPublication = yearOfPublication;
            this.author = author;
        }

        public Author getAuthor() {
            return author;
        }

        public int getYearOfPublication() {
            return yearOfPublication;
        }

        public String getTitle() {
            return title;
        }

        public void setYearOfPublication(int yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

        @Override
        public String toString() {
            return '{'+ title + ' ' + yearOfPublication + ' ' +author + '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublication, author);
    }
}
