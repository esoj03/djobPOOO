package sprint1;

public class PedradaFoto extends Pedrada{
    private String nomeFicheiro;
    private String legenda;

    public PedradaFoto(int id, String username, String nomeFicheiro, String legenda) {
        super(id, username);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    public String getLegenda() {
        return legenda;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Nome do arquivo: " + getNomeFicheiro());
        System.out.println("Legenda: " + getLegenda());
    }
}

