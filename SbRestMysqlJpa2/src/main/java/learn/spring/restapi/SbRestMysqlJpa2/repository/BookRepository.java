package learn.spring.restapi.SbRestMysqlJpa2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.spring.restapi.SbRestMysqlJpa2.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	List<Book> findBybookId(Long bookId);

	List<Book> findBybookName(String bookName);

	

	

	
	
	

}
