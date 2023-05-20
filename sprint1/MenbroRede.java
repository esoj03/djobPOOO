package sprint1;

public interface MenbroRede {
    Pedrada manda(MenbroRede membro);
    void mostraPerfil();
    void mudarVisibilidade();
    void manda();
    void escreveNaPedra(Isecmarini membro);
    void conecta(Isecmarini outroMembro);
    void desconectar(Isecmarini outroMembro);
}


/*
    class Isecmarini implements MenbroRede {
        // Implementação dos métodos da ‘interface’

        @Override
        public Pedrada manda(MenbroRede membro) {
            // Implementação do método manda()
            // ...
            //return new Pedrada();
            return null;
        }

        @Override
        public void mostraPerfil() {
            // Implementação do método mostraPerfil()
            // ...
            System.out.println("Perfil do membro");
        }

        @Override
        public void manda() {
            // Implementação do método manda()
            // ...
            System.out.println("Mensagem enviada");
        }

        @Override
        public void escreveNaPedra(Isecmarini membro) {
            // Implementação do método escreveNaPedra()
            // ...
            System.out.println("Mensagem escrita na pedra para o membro " + membro.getUsername());
        }

        @Override
        public String getUsername() {
            return null;
        }

    }

    String getUsername();*/

