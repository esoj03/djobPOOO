package sprint1;

public class Riola {
    private Pedrada[] pedradas;

    public Riola() {
        this.pedradas = new Pedrada[0];
    }

    public void addPedrada(Pedrada pedrada) {
        // Redimensionar o array para adicionar a nova pedrada
        Pedrada[] novoArray = new Pedrada[pedradas.length + 1];
        System.arraycopy(pedradas, 0, novoArray, 0, pedradas.length);
        novoArray[pedradas.length] = pedrada;
        pedradas = novoArray;
    }

    public void show() {
        for (Pedrada pedrada : pedradas) {
            pedrada.display();
            System.out.println();
        }
    }
}
