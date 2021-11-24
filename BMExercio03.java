/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weslley
 */
public class BMExercio03{ 
    public static final float taxa=8.25F;
    public static void main(String[] args) {
    
    float copoSuco=2.95F;
    float copoRefri=3.50F;
    boolean muitoCaro;
    
    float valorTotal= copoSuco + copoRefri;
    float taxaCalculada=CalculaTaxa(valorTotal);
    float novoCusto=valorTotal+taxaCalculada;
    muitoCaro=(novoCusto>=10)? true : false;
    System.out.println("O copo do de suco custa:" + copoSuco);
    System.out.println("O copo do de suco custa:" + copoRefri);
    System.out.printf("O valor sem os impostos:%.2f\n", valorTotal);
    System.out.printf("O valor total é:%.2f\n", novoCusto);
    System.out.println("Muito caro:"+muitoCaro );
    }
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static float CalculaTaxa(float valorTotal){
        return taxa*valorTotal/100;
    }
    }
