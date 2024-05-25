public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGACAO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA " + url + " NO NAVEGADOR");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO NAVEGADOR");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA NO NAVEGADOR");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MUSICA " + musica);
    }
    
}
