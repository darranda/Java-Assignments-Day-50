public class Book {

    String bookTitle;
    int pageNum;
    int publishYear;

    public Book (String bookTitle, int pageNum, int publishYear) {
        this.bookTitle = bookTitle;
        this.pageNum = pageNum;
        this.publishYear = publishYear;
    }

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPublishYear() {
        return publishYear;
    }
    public String toString(){
        return bookTitle + ", "+ getPageNum()+ ", " + getPublishYear();
    }
}

