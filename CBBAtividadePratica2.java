/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weslley
 */
public class CBBAtividadePratica2 {
     public static void main(String[] args) {
       int num1=20;
       int num2=40;
       int num3=50;
       int soma=num1+num2+num3;
       int media=soma/3;
       System.out.println("Soma dentro do print:");
       System.out.println(num1+num2+num3);
       System.out.println("Média dentro do print:");
       System.out.println((num1+num2+num3)/3);
       System.out.println("Soma por meio de variável:");
       System.out.println(soma);
       System.out.println("Média por meio de variável:");
       System.out.println(media);
       System.out.println("Soma por meio de função:");
       System.out.println(somar(num1,num2,num3));
       System.out.println("Média por meio de função:");
       System.out.println(media(num1,num2,num3));
    }
    public static int somar(int n1,int n2,int n3){
     return n1+n2+n3;
    }
    public static int media(int n1,int n2,int n3){
     return (n1+n2+n3)/3;
    }
    }
