package excecao;

public class Excecao {

    public static void main(String[] args) {
        
        System.out.println("passo 01");
        System.out.println("passo 02");

        Cliente cliente = new Cliente();
        
        cliente.setNome("Luiz Franciso");
        cliente.setSexo('M');
        
       
        try {
            System.out.println(cliente.testeExcecao());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        System.out.println("passo 03");
        System.out.println("passo 04");
        System.out.println("passo 05");
        
        
         /*
        try {
            System.out.println("Abrir conexão");
            System.out.println("Abrir ResultSet");
            System.out.println("Abrir Statements");
            
            System.out.println(2 / 0);
            
            System.out.println("Fechar conexão");
            System.out.println("Fechar ResultSet");
            System.out.println("Fechar Statements");
        } catch (ArithmeticException e) {
            
            System.out.println("Erro de divisão por zero");
            System.out.println(e);
            
        }         
       
       

        try {
            System.out.println("Abrir conexão");
            System.out.println("Abrir ResultSet");
            System.out.println("Abrir Statements");

            System.out.println(cliente.getNome());

        } catch (ArithmeticException e) {
            //System.out.println("Erro de divisão por zero");
            System.out.println(e);
        } finally {
            System.out.println("Fechar conexão");
            System.out.println("Fechar ResultSet");
            System.out.println("Fechar Statements");
        }
         */
    }
}
