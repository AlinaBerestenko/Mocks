import javafx.scene.chart.PieChart;

/**
 * Created by berestenko on 14.03.17.
 */
public class DatabaseDataValidator {
    private Database database;

    public DatabaseDataValidator(Database database) {
        this.database = database;
    }

    public boolean hasTextInDatabase(String text) {
        for (String savedText : database.getSavedTexts()) {
            if (text.equals(savedText)) {
                return true;
            }
        }
        return false;
    }


}
