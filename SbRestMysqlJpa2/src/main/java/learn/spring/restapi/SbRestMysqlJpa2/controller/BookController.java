package learn.spring.restapi.SbRestMysqlJpa2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import learn.spring.restapi.SbRestMysqlJpa2.model.Book;
import learn.spring.restapi.SbRestMysqlJpa2.repository.BookRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Book has been saved";

	}

	@PostMapping("/allBookSave")
	public String insertAllBook(@RequestBody List<Book> book) {
		bookRepository.saveAll(book);
		return "All Book have been saved";

	}

	@GetMapping("/allBookList")
	public List<Book> getBookList() {

		return bookRepository.findAll();

	}

	@GetMapping("/getBookListById/{bookId}")
	public List<Book> getBookListById(@PathVariable("bookId") Long bookId) {

		// The method name here syntax - findByvariableNameDefinedinBookClass
		// Here JPA will map Book's variable to findBy method automatically

		return bookRepository.findBybookId(bookId);

	}

	@GetMapping("/getBookListByName/{bookName}")
	public List<Book> getBookListByName(@PathVariable("bookName") String bookName) {

		return bookRepository.findBybookName(bookName);

	}

	@PutMapping("/updateDetailsById/{bookId}")
	public String updateBookListById(@PathVariable("bookId") Long bookId, @RequestBody Book book) {
		String status="";
		if(bookRepository.getReferenceById(bookId) != null) {
			Book bk=bookRepository.getReferenceById(bookId);
			//bk.setBookId(book.getBookId());
			bk.setBookName(book.getBookName());
			bk.setBookaAuthor(book.getBookaAuthor());
			bookRepository.save(bk);
			status="Updated";
			
		}
		
		return status;
	}
	
	@DeleteMapping("/deleteBookById/{bookId}")
	public String deleteBookById(@PathVariable Long bookId){
		
		String status="";
		if(bookRepository.getReferenceById(bookId) != null) {
			bookRepository.deleteById(bookId);
			status="Deleted";
			
		}
		else {
			status="Record not found";
		}
		return status;
		
	}

}
