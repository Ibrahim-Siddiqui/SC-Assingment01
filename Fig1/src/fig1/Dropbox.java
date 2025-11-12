package fig1;

import java.util.HashMap;
import java.util.Map;

public class Dropbox implements CloudStorageProvider {
    private final Map<String, String> storage = new HashMap<>();

    @Override
    public void storeFile(String name) {
        storage.put(name, "[dropbox-file] data-for-" + name);
        System.out.println("Dropbox: Stored file '" + name + "'");
    }

    @Override
    public String getFile(String name) {
        return storage.get(name);
    }
}
