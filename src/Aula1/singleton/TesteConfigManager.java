package Aula1.singleton;

public class TesteConfigManager {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        System.out.println(config.getProperties());
    }
}
