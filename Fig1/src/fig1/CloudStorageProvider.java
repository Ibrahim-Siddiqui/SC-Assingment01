package fig1;

public interface CloudStorageProvider {

    void storeFile(String name);

    String getFile(String name);
}
