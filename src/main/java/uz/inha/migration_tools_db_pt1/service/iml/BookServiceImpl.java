package uz.inha.migration_tools_db_pt1.service.iml;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.inha.migration_tools_db_pt1.entity.Book;
import uz.inha.migration_tools_db_pt1.mapper.BookMapper;
import uz.inha.migration_tools_db_pt1.repository.BookRepository;
import uz.inha.migration_tools_db_pt1.service.BookService;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok(bookRepository
                .findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList()));
    }

    @Override
    public Book save(Book build) {
        return bookRepository.save(build);
    }
}
