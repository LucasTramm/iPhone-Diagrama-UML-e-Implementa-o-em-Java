public class TesteIphone {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 13", "Preto", 128);

        System.out.println("Modelo: " + meuIphone.getModelo());
        System.out.println("Cor: " + meuIphone.getCor());
        System.out.println("Armazenamento: " + meuIphone.getArmazenamento() + "GB");

        // Testando Aparelho Telefonico
        meuIphone.fazerChamada();
        meuIphone.receberChamada();

        // Testando Reprodutor Musical
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.selecionarMusica();

        // Testando Navegador de Internet
        meuIphone.exibirPagina();
    }
    
}
