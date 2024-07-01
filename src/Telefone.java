public interface Telefone {
    String getNumero();
    void setNumero(String numero);

    static void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    static void atender() {
        System.out.println("Aceita ligação");
    }

    static void iniciarCorreioVoz() {
        System.out.println("Mensagem correio de voz.");
    }
}