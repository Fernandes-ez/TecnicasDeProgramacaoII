package Aula1.singleton;

public class Main {
    public static void main(String[] args) {
        //obter una conexão-instância
        DataBaseConnection conexaoRH = DataBaseConnection.getInstance();
        DataBaseConnection conexaoTI = DataBaseConnection.getInstance();
    }
}
