package io.github.adamw7.tools.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SQLCreatorTests {

    @Test
    public void tableTest() {
        String tableName = "UNKNOWN";
        String[] columnNames = {"UNKNOWN", "UNKNOWN"};
        String expected = "CREATE TABLE UNKNOWN (UNKNOWN VARCHAR(255),UNKNOWN VARCHAR(255))";
        String result = SQLCreator.table(tableName, columnNames);
        assertEquals(expected, result);
    }

    @Test
    public void insertTest() {
        String tableName = "UNKNOWN";
        String[] row = {"UNKNOWN", "UNKNOWN"};
        String expected = "INSERT INTO UNKNOWN VALUES ('UNKNOWN','UNKNOWN')";
        String result = SQLCreator.insert(tableName, row);
        assertEquals(expected, result);
    }

    @Test
    public void createSelectQueryBasedOnTest() {
        String table = "UNKNOWN";
        String[] columnNames = {"UNKNOWN", "UNKNOWN"};
        String expected = "SELECT UNKNOWN, UNKNOWN FROM UNKNOWN";
        String result = SQLCreator.createSelectQueryBasedOn(table, columnNames);
        assertEquals(expected, result);
    }
}
