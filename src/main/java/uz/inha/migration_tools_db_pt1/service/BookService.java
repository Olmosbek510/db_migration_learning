package uz.inha.migration_tools_db_pt1.service;

import org.springframework.http.ResponseEntity;
import uz.inha.migration_tools_db_pt1.entity.Book;

public interface BookService {
    ResponseEntity<?> getAllBooks();

    Book save(Book build);
}
