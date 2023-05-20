package sprint1;
import java.util.List;

public class Isecmarini {
    protected String username;
    private String email;
    private String nome;
    private String apelido;
    private String pseudonome;
    private String alcunha;
    private String password;
    private boolean visivel;
    protected List<String> interesses;


    public Isecmarini(String username, String email, String nome, String apelido, String alcunha, String password, PedradaDigital pedradaDigital) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.alcunha = alcunha;
        this.password = password;
        this.pedradaDigital = pedradaDigital;
        this.visivel = true;
    }

    public Isecmarini() {

    }
    public void resetPassword() {
        // Lógica para redefinir a senha do utilizador
    }
    public void verPerfil() {
        // Lógica para redefinir a senha do utilizador
    }

    public void defenirVisinilidade() {
        // Lógica para redefinir a senha do utilizador
    }


    String getUsername() {
        return null;
    }

    // Getters e setters omitidos para brevidade

    // Outros métodos e funcionalidades da classe Isecmarini

    private PedradaDigital pedradaDigital;

    }




