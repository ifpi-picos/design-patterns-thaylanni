public class ObservadorPrimeVideos implements Observador {

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
