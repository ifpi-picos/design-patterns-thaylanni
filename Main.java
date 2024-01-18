public class Main {

    public static void main(String[] args) {

        // Instancia o notificador
        Notificador notificador = new Notificador();

        // Adiciona um observador
        ObservadorCliente observadorPrimeVideo = new ObservadorCliente();
        notificador.adicionarObservador(observadorPrimeVideo);

        // Notifica o observador
        notificador.notificar("Nova série lançada: Naruto");
    }
}
