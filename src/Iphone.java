public class Iphone implements Ipod, Navegador, Telefone {
    private String numero;
    private String url;
    private String musica;

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public String getMusica() {
        return musica;
    }

    @Override
    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }
}
