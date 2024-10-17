
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
    }
