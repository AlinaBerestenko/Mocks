import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;


/**
 * Created by berestenko on 14.03.17.
 */
public class Test {

    public static void main(String[] args) {
        MockDatabase database = new MockDatabase();
        database.saveText("Bogdan");
        database.saveText("Alina");
        database.saveText("ololo");
        DatabaseDataValidator databaseDataValidator = new DatabaseDataValidator(database);
        if (databaseDataValidator.hasTextInDatabase("Andrew")) {
            System.out.println("Test success");
        } else {
            System.out.println("Test failed");
        }

    }

    static class MockDatabase extends Database {
        private List<String> mData;

        public MockDatabase() {
            mData = new ArrayList<String>();
        }

        @Override
        public void saveText(String text) {
            mData.add(text);
        }

        @Override
        public List<String> getSavedTexts() {
            return mData;
        }
    }

}
