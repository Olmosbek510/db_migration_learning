package uz.inha.migration_tools_db_pt1.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookReqDto {
    private Integer id;
    private String title;
    private String createdBy;
}
