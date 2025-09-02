import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    // --- Atributos ---
    private String modelo;
    private String cor;
    private int armazenamento;

    // --- Construtor ---
    public iPhone(String modelo, String cor, int armazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }

    // --- Getters e Setters ---
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getArmazenamento() { return armazenamento; }
    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento; }

    // --- Métodos da interface AparelhoTelefonico ---
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo uma chamada...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo uma chamada...");
    }

    // --- Métodos da interface ReprodutorMusical ---
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // --- Métodos da interface NavegadorInternet ---
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}