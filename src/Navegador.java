public interface Navegador {
    String getUrl();
    void setUrl(String url);

    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
