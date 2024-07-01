public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.setNumero("119999-9999");
        System.out.println("Número do telefone: " + iphone.getNumero());
        Telefone.ligar(iphone.getNumero());

        iphone.setUrl("https://www.teste.com");
        System.out.println("URL: " + iphone.getUrl());
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.setMusica("Judas - Lady Gaga");
        System.out.println("Música: " + iphone.getMusica());
        iphone.selecionarMusica(iphone.getMusica());
        iphone.tocar();
        iphone.pausar();
    }
}