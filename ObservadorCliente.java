public class ObservadorCliente implements Observador {

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
