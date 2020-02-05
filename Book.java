package unl.cse.library;

import java.time.LocalDate;
import java.time.Period;

public class Book {

    private String title;
    private String isbn;
    private Author author;
    private LocalDate publishDate;

    /**
     * Getter method for author
     * @return
     */
    public Author getAuthor() {
        return this.author;
    }

    /**
     * Setter method for authors
     * @param author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Getter method for call number.
     * @return
     */
    public String getISBN() {
        return this.isbn;
    }

    /**
     * Setter method for call number.
     * @param callNumber
     */
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter method for title
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter method for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for the publish date
     * @return publishDate
     */
    public String getPublishDate() {
    	return this.publishDate.toString();
    }
    
    /**
     * Setter method for the publish date
     * @param date
     */
    public void setPublishDate(String date) {
    	this.publishDate = LocalDate.parse(date);
    }
    
  public int getAge() {
	 int years = Period.between(this.publishDate, LocalDate.now()).getYears();
	 return years;
  }
    
}
