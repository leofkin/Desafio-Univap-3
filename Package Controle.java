
package controle;

import modelo.Cliente;
import modelo.Veiculo;

public class Principal {
    public static void main(String [] args){
    Cliente cli = new Cliente();
    Veiculo vei = new Veiculo();
    
    cli.Cliente("000000000", "Leandro", "Rua tal", "0xx-1111-1111", "Leandro@exemplo.com");
    
    vei.Veiculo("RRR-0000", "Modelo tal", 1978, "fabricante tal", "Vermelho", cli);
    
    
    System.out.println("Cliente: " + vei.toString());
    
     }
}