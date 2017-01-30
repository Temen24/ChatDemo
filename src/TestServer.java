
import filters.firstFilter;
import server.Server;

/**
 Created by Artem Kozhukhovsky on 24.01.2017
 */

public class TestServer {

    public static final String SERVER_HOST = "localhost"; //127.0.0.1
    public static final int SERVER_PORT = 9494;
    public static final String DB_NAME = "chat.db";

    public static void main(String[] args) {
        Server server = new Server(SERVER_PORT, DB_NAME);

        new Thread(new Runnable() {
            @Override
            public void run() {
                server.waitForClient();
            }
        }).start();
        server.addFilter(new firstFilter());

    }
}