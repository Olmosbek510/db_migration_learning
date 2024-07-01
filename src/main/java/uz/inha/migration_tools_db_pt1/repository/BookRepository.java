package uz.inha.migration_tools_db_pt1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.inha.migration_tools_db_pt1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}