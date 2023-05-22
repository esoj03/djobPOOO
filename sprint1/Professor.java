package sprint1;

import java.util.Collections;
import java.util.List;

public class Professor extends Isecmarini{
    private String area;
    private String grau;
    private String departamento;

    // Construtor


    public Professor(String username, String email, String nome,
                     String apelido, String pseudonome, String alcunha, String password, boolean visivel,
                     List<String> interesses, PedradaDigital pedradaDigital, String area, String grau, String departamento) {
        super(username, email, nome, apelido, pseudonome, alcunha, password, visivel,
                Collections.singletonList(interesses.toString()), pedradaDigital);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método mandaColegas
    // Lógica para enviar mensagem para os colegas
    public void mandaColegas() {
        System.out.println("Enviando mensagem para os colegas...");
        List<String> colegas = this.getPedradaDigital().getComunidade();
        for (String colega : colegas) {
            System.out.println("Mensagem enviado para " + colega);
        }
    }
}

