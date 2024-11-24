package learn.spring.restapi.SbRestMysqlJpa2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	
	private String bookName;
	private String bookaAuthor;
	
	
	
	public String getBookaAuthor() {
		return bookaAuthor;
	}
	public void setBookaAuthor(String bookaAuthor) {
		this.bookaAuthor = bookaAuthor;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookaAuthor=" + bookaAuthor + "]";
	}
	
	

}
