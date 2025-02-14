package Aula1.exercicio;

public class Configuracao {
    private static Configuracao instance;

    private String tema;
    private String idioma;
    private boolean notificacoes;

    private Configuracao() {
        this.tema = "claro";
        this.idioma = "pt-BR";
        this.notificacoes = true;
    }

    // Método para obter a única instância da classe
    public static Configuracao getInstance() {
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }

    // Métodos para atualizar as configurações
    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNotificacoes(boolean notificacoes) {
        this.notificacoes = notificacoes;
    }

    // Métodos para recuperar as configurações
    public String getTema() {
        return tema;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean getNotificacoes() {
        return notificacoes;
    }

    // Método para mostrar todas as configurações
    public void mostrarConfiguracoes() {
        System.out.println("Configurações do Usuário:");
        System.out.println("Tema: " + tema);
        System.out.println("Idioma: " + idioma);
        System.out.println("Notificações: " + (notificacoes ? "Ativadas" : "Desativadas"));
    }
}

