package Aula1.singleton;

public class DataBaseConnection {
    //instância ´nica
    private static DataBaseConnection instance;

    //Construtor privado
    private DataBaseConnection() {
        System.out.println("Conexão com o banco de dados estabelecida");
    }
    //Método público para obter a instância única
    public static DataBaseConnection getInstance(){
        if (instance==null){
            instance = new DataBaseConnection();
        }
        return instance;
    }
    //método para receber query
    public void executeQuery(String query){
        System.out.println("Exwcutando Query");
    }

}
