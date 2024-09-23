public class Main{
    public static void main(String[] args){
        
        // Instânciando
        Produto p1 = new Produto("Pao", 2.00, 10.00, "22/09/2024", "22/10/2024");
        Produto p2 = new Produto("Creme dental", 2.50, 10.00, "22/09/2024");

        // Saída construtor completo
        System.out.println("\n\nSAIDA CONSTRUTOR COMPLETO");
        System.out.println("\nProduto: " +p1.getNome()+ "\nCusto: " +p1.getPrecoCusto()+ "\nVenda: " +p1.getPrecoVenda()+ "\nFabricacao: " +p2.getFabricacao()+ "\nValidade: " +p1.getValidade());

        // Saída construtor incompleto
        System.out.println("\n\nSAIDA CONSTRUTOR INCOMPLETO");
        System.out.println("\nProduto: " +p2.getNome()+ "\nCusto: " +p2.getPrecoCusto()+ "\nVenda: " +p2.getPrecoVenda()+ "\nFabricacao: " +p2.getFabricacao()+ "\nValidade: " +p2.getValidade());
    }
}