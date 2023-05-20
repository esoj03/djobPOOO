package sprint1;

public class Professor extends Isecmarini{
    private String area;
    private String grau;
    private String departamento;

    // Construtor
    public Professor(String area, String grau, String departamento) {
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
    public void mandaColegas() {
        System.out.println("Enviando mensagem para os colegas...");
        // Lógica para enviar mensagem para os colegas
    }
}
