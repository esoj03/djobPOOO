package sprint1;

import java.util.ArrayList;
import java.util.List;

public class PedradaDigital {
    private List<String> comunidade;
    private List<String> grupos;
    private List<String> eventos;
    private String currentUser;

    public class evento {
        private int id;
        private String nome;
        private TipoEvento tipo;
    }

    public class grupo {
        private int id;
        private int data;
        private String estado;
    }

    public PedradaDigital() {
        comunidade = new ArrayList<>();
        grupos = new ArrayList<>();
        eventos = new ArrayList<>();
        currentUser = null;
    }

    public void singup(String username) {
        comunidade.add(username);
    }

    public void signin(String username) {
        if (comunidade.contains(username)) {
            currentUser = username;
            System.out.println("Utilizador " + username + " logado com sucesso.");
        } else {
            System.out.println("Utilizador não encontrado na comunidade.");
        }
    }

    public void signoff() {
        if (currentUser != null) {
            currentUser = null;
            System.out.println("Utilizador deslogado com sucesso.");
        } else {
            System.out.println("Nenhum utilizador logado.");
        }
    }

    public void createGroup(String groupName) {
        if (currentUser != null) {
            grupos.add(groupName);
            System.out.println("Grupo " + groupName + " criado com sucesso.");
        } else {
            System.out.println("Você precisa estar logado para criar um grupo.");
        }
    }

    public void createEvent(String eventName) {
        if (currentUser != null) {
            eventos.add(eventName);
            System.out.println("Evento " + eventName + " criado com sucesso.");
        } else {
            System.out.println("Você precisa estar logado para criar um evento.");
        }
    }

    // Getters e setters

    public List<String> getComunidade() {

        return comunidade;
    }

    public void setComunidade(List<String> comunidade) {

        this.comunidade = comunidade;
    }

    public List<String> getGrupos() {

        return grupos;
    }

    public void setGrupos(List<String> grupos) {

        this.grupos = grupos;
    }

    public List<String> getEventos() {

        return eventos;
    }

    public void setEventos(List<String> eventos) {

        this.eventos = eventos;
    }

    public String getCurrentUser() {

        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public void listAllUsers() {
        if (getComunidade().isEmpty()) {
            System.out.println("Nenhum utilizador cadastrado.");
        } else {
            for (String username : getComunidade()) {
                System.out.println(username);
            }
        }
    }

    public void listAllGroups() {
        if (getGrupos().isEmpty()) {
            System.out.println("Nenhum grupo cadastrado.");
        } else {
            for (String groupName : getGrupos()) {
                System.out.println(groupName);
            }
        }
    }

    public void listAllEvents() {
        if (getEventos().isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (String eventName : getEventos()) {
                System.out.println(eventName);
            }
        }
    }
}
