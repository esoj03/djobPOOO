package sprint1;
import java.time.LocalTime;
import java.time.Clock;
public class Pedrada {
    private int id;
    private String username;
    private long carimbotempo;
    private int gostos;
    private Comentario[] comentarios;

    public Pedrada(int id, String username) {
        this.id = id;
        this.username = username;
        this.carimbotempo = System.currentTimeMillis();
        this.gostos = 0;
        this.comentarios = new Comentario[0];
    }


    public void gosto() {
        gostos++;
    }

    public void tragosto() {
        gostos--;
    }

    public Comentario masriola() {
        return new Comentario();
    }

    public LocalTime getCarimboTempo() {
        Clock clock = Clock.systemDefaultZone();
        LocalTime horaAtual = LocalTime.now(clock);
        return horaAtual;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Gostos: " + gostos);
        System.out.println("Carimbo de Tempo: " + getCarimboTempo());

        // Print all comments
        for (Comentario comentario : comentarios) {
            System.out.println("Comentário: " + comentario.getTexto());
        }
    }
}



