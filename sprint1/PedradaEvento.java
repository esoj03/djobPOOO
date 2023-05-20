package sprint1;

import java.time.LocalDate;

public class PedradaEvento extends Pedrada{
    private TipoEvento tipo;
    private LocalDate data;
    private String local;
    private double entrada;
    private String status;

    public PedradaEvento(int id, String username, TipoEvento tipo, LocalDate data, String local, double entrada, String status) {
        super(id, username);
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public String getLocal() {
        return local;
    }
}

