package Aula1.exercicio;

public class Main {
    public static void main(String[] args) {
        // Criar a única instância do gerenciador de configurações
        Configuracao config = Configuracao.getInstance();

        // Mostrar configurações padrão
        config.mostrarConfiguracoes();

        // Atualizar configurações
        config.setTema("escuro");
        config.setIdioma("en-US");
        config.setNotificacoes(false);

        // Mostrar configurações atualizadas
        System.out.println("\nApós atualização:");
        config.mostrarConfiguracoes();
    }
}

