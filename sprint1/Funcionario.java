package sprint1;

public class Funcionario extends Isecmarini{
    private String uo;
    private String funcao;

    public Funcionario(String uo, String funcao){
        super();
        this.uo = uo;
        this.funcao = funcao;
    }


    public String getuo() {
        return uo;
    }

    public String getfuncao() {
        return funcao;
    }
}

