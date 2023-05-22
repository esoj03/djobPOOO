package sprint1;

import java.util.List;
import java.util.Random;


public abstract class Isecmarini {
    protected String username;
    private String email;
    private String nome;
    private String apelido;
    private String pseudonome;
    private String alcunha;
    private String password;
    private boolean visivel;
    protected List<String> interesses;
    private PedradaDigital pedradaDigital;


    public Isecmarini(String username, String email, String nome, String apelido, String pseudonome, String alcunha, String password, boolean visivel, List<String> interesses, PedradaDigital pedradaDigital) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.pseudonome = pseudonome;
        this.alcunha = alcunha;
        this.password = password;
        this.visivel = visivel;
        this.interesses = interesses;
        this.pedradaDigital = pedradaDigital;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getPseudonome() {
        return pseudonome;
    }

    public String getAlcunha() {
        return alcunha;
    }


    String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public PedradaDigital getPedradaDigital() {
        return pedradaDigital;
    }

    private Object generateRandomPassword() {
        // Gera uma senha aleatória com 12 caracteres
        return new Random().ints(33, 126).limit(12);
    }

    // Lógica para redefinir a senha do utilizador
    public void resetPassword() {
        this.password = (String) generateRandomPassword();
        System.out.println("A senha foi redefinida com sucesso!");
    }

    public void verPerfil() {
        // Lógica para visualizar o perfil do utilizador
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Pseudonome: " + getPseudonome());
        System.out.println("Alcunha: " + getAlcunha());
        System.out.println("Visivel: " + isVisivel());
        System.out.println("Interesses: " + getInteresses());
    }
    // Lógica para definir a visibilidade do perfil do utilizador
    public void defenirVisinilidade() {
        this.visivel = !this.visivel;
        System.out.println("Visibilidade definida com sucesso!");
    }

}
