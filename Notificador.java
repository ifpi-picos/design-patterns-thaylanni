import java.util.ArrayList;
import java.util.List;
public class Notificador {

    private List<Observador> observadores;

    public Notificador() {
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void notificar(String mensagem) {
        for (Observador observador : this.observadores) {
            observador.notificar(mensagem);
        }
    }
}
