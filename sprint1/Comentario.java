package sprint1;
import java.time.LocalDateTime;

public class Comentario {
    private String texto;
    private LocalDateTime dataHora;
    private int gostos;

    public Comentario() {
        this.texto = texto;
        this.dataHora = LocalDateTime.now();
        this.gostos = 0;
    }

    public Comentario responder(String textoResposta) {
        return new Comentario();
    }

    public void gosto() {
        gostos++;
    }

    public void tragosto() {
        gostos--;
    }

    // Getters e setters

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public int getGostos() {
        return gostos;
    }

    public void setGostos(int gostos) {
        this.gostos = gostos;
    }
}
