/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weslley
 */
public class CBBAtividadePratica4 {
    public static void main(String[] args){
     float  comprimento=6.02F;
     float  largura=3.02F;
     float  profundidade=1.40F;
     System.out.printf("Comprimento:\n");
     System.out.printf("%.2f\n", comprimento);
     System.out.printf("Largura:\n");
     System.out.printf("%.2f\n", largura);
     System.out.printf("Profundidade:\n");
     System.out.printf("%.2f\n", profundidade);
     float metrosCubicos=CalculaMetrosCubicos(comprimento,largura,profundidade);
     System.out.printf("Metros Cúbicos:\n");
     System.out.printf("%.2f"+"m³\n",metrosCubicos);
     System.out.printf("Orçamento da Piscina:\n");
     System.out.printf("%.2f"+"R$", CalculaOrcamento(metrosCubicos));
     }
      public static float CalculaMetrosCubicos(float comprimento,float largura ,float profundidade){
      return comprimento*largura*profundidade;
      }
      public static float CalculaOrcamento(float n){
       return n*100;
      }
}
