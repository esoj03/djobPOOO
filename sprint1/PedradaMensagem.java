package sprint1;

public class PedradaMensagem extends Pedrada{
    private String mensagem;

    public PedradaMensagem(int id, String username, String mensagem) {
        super(id, username);
        this.mensagem = mensagem;
    }

    public String getTexto() {
        return mensagem;
    }
}
