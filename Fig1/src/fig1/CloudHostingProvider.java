package fig1;

import java.util.List;


public interface CloudHostingProvider {

    void createServer(String region);

   
    List<String> listServers(String region);
}
