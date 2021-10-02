package ru.mirea.java.practice1_2;

public class Book {

        private String titleBook;

        private int pages;

        private String author;

        public String getTitleBook() {
            return titleBook;
        }

        public int getPages() {
            return pages;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitleBook(String titleBook) {
            this.titleBook = titleBook;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Book(String titleBook, int pages, String author) {
            this.titleBook = titleBook;
            this.pages = pages;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "titleBook='" + titleBook + '\'' +
                    ", pages=" + pages +
                    ", author='" + author + '\'' +
                    '}';
        }
    }
