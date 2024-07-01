package uz.inha.migration_tools_db_pt1.component;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.inha.migration_tools_db_pt1.service.BookService;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final BookService bookService;

    @Override
    public void run(String... args) throws Exception {
    }

}
