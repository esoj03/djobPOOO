package sprint1;


public interface GestorEvento {
    void novo();

    void novoRecorrente();

    void convidar();

    public class Estudante implements GestorEvento {
        @Override
        public void novo() {
            System.out.println("Novo evento criado!");
        }

        @Override
        public void novoRecorrente() {
            System.out.println("Novo evento recorrente criado!");
        }

        @Override
        public void convidar() {

        }
    }

    class Funcionario implements GestorEvento {

        @Override
        public void novo() {

        }

        @Override
        public void novoRecorrente() {

        }

        @Override
        public void convidar() {

        }
    }

}

