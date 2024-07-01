public interface Ipod {
    String getMusica();
    void setMusica(String musica);

    void selecionarMusica(String musica);
    void pausar();
    void tocar();
}