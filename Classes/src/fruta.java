public class fruta {
    private String nome;
    private String cor;
    private double preco;

    public fruta(String nome, String cor, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    public void descrever() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Preço: R$" + preco);
    }

    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    public boolean estaMadura() {
        // Lógica para verificar se a fruta está madura
        // (exemplo simplificado)
        return true;
    }

    // Getters e setters (opcional)
}
