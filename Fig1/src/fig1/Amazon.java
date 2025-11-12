package fig1;

import java.util.*;


public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {
    private final Map<String, List<String>> serversByRegion = new HashMap<>();
    private final Map<String, String> storage = new HashMap<>();
    private final String cdnBase;

    public Amazon() {
        this.cdnBase = "https://cdn.amazon.example";
    }

    @Override
    public void createServer(String region) {
        Objects.requireNonNull(region, "region must not be null");
        List<String> list = serversByRegion.computeIfAbsent(region, r -> new ArrayList<>());
        String id = String.format("aws-%s-%d", region, list.size() + 1);
        list.add(id);
        System.out.println("Amazon: Created server '" + id + "' in region " + region);
    }

    @Override
    public List<String> listServers(String region) {
        if (region == null) return Collections.emptyList();
        return Collections.unmodifiableList(serversByRegion.getOrDefault(region, Collections.emptyList()));
    }

    @Override
    public void storeFile(String name) {
        Objects.requireNonNull(name, "name must not be null");
        storage.put(name, "[amazon-file] contents-of-" + name);
        System.out.println("Amazon: Stored file '" + name + "'");
    }

    @Override
    public String getFile(String name) {
        return storage.get(name);
    }

    @Override
    public String getCDNAddress(String fileName) {
        if (fileName == null) return cdnBase;
        return String.format("%s/%s", cdnBase, fileName);
    }
}
