import java.util.ArrayList;
import java.util.List;

/**
 * Created by berestenko on 14.03.17.
 */
// я не буду усложнять. без интерйеса, будет просто класс базы данных
public class Database {

    public void saveText(String text) {
        //Допустим тут происходит сохранение
    }

    public List<String> getSavedTexts() {
        //Допустим тут идет выборка в конкретной базе данных
        return new ArrayList<String>();
    }
}
