package uz.inha.migration_tools_db_pt1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.inha.migration_tools_db_pt1.service.BookService;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    public ResponseEntity<?> getAll(){
        return bookService.getAllBooks();
    }
}
