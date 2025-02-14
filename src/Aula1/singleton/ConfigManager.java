package Aula1.singleton;

public class ConfigManager {
    private static ConfigManager instance;

    //Atributo para armazenar as configuraç~eos
    private String properties ="\n app.name=Sistema Empresarial \n app.version=1.0 \n app.language=pt-BR \n currency=BRL \n timeout=300 segundos";

    //método público getInstance
    public static ConfigManager getInstance(){
        if (instance==null){
            instance=new ConfigManager();
        }
        return instance;
    }
    public String getProperties(){
        return properties;
    }

}
