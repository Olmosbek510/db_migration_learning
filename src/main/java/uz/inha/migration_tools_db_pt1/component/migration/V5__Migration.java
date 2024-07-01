package uz.inha.migration_tools_db_pt1.component.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.Statement;

@Component()
public class V5__Migration extends BaseJavaMigration {
    @Override
    public void migrate(Context context) throws Exception {
        Connection connection = context.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("alter table book add column tt varchar");
    }
}
