package uz.inha.migration_tools_db_pt1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.inha.migration_tools_db_pt1.entity.Book;
import uz.inha.migration_tools_db_pt1.model.request.BookReqDto;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper BOOK_MAPPER = Mappers.getMapper(BookMapper.class);

    Book toEntity(BookReqDto bookReqDto);

    BookReqDto toDto(Book book);
}
