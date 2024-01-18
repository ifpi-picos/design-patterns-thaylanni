public class Main {

    public static void main(String[] args) {

        // Instancia o notificador
        Notificador notificador = new Notificador();

        // Adiciona um observador
        ObservadorPrimeVideo observadorPrimeVideo = new ObservadorPrimeVideo();
        notificador.adicionarObservador(observadorPrimeVideo);

        // Notifica o observador
        notificador.notificar("Nova série lançada: Naruto");
    }
}
