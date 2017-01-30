import client.ClientWindow;

/**
Created by Artem Kozhukhovsky on 24.01.2017
 */

public class TestClients {

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 9494;

    public static void main(String[] args) {
        new ClientWindow(SERVER_HOST, SERVER_PORT);
        new ClientWindow(SERVER_HOST, SERVER_PORT);
    }
}