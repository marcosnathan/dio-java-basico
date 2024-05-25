public class App {
    public static void main(String[] args) throws Exception {
        iPhone iphone = new iPhone();

        ReprodutorMusical rm = iphone;
        NavegadorInternet ni = iphone;
        AparelhoTelefonico ae = iphone;

        rm.tocar();
        rm.pausar();
        rm.selecionarMusica("AUTO REVERSE - ORAPPA");

        ni.exibirPagina("https://dio.me/users/mnengcomp");
        ni.atualizarPagina();
        ni.adicionarNovaAba();

        ae.ligar("79999999999");
        ae.atender();
        ae.iniciarCorreioVoz();
    }
}
