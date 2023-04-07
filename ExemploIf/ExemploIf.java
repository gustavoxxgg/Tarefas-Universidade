/*
Crie um programa que solicite ao usuário que informe a sua idade e informe em qual faixa etária ele se encaixa. O programa deve considerar as seguintes faixas etárias:

Criança: idade menor que 12 anos.
Adolescente: idade entre 12 e 17 anos.
Adulto: idade entre 18 e 59 anos.
Idoso: idade igual ou maior que 60 anos.

O programa deve exibir a mensagem correspondente à faixa etária em que o usuário se encontra, seguida da idade informada pelo usuário. Utilize a classe Scanner para realizar a leitura da idade digitada pelo usuário.
*/
import java.util.Scanner;
class Exemploif {
  public static void main(String[] args) {
    //Entrada Via Teclado
    Scanner teclado=new Scanner(System.in);
    
    System.out.println("Qual é a sua idade?");
    int idade=teclado.nextInt();
    //Estrutura de Decisão if else
    if(idade>=18 && idade<60) {
      System.out.println("Adulto: "+idade+" Anos");
  } 
    else if(idade>=12 && idade<18) {
      System.out.println("Adolescente: "+idade+" Anos");
    } 
    else if(idade>=60) {
      System.out.println("Idoso: "+idade+" Anos");
        }
    else {
      System.out.println("Criança: "+idade+" Anos");
    }
  teclado.close();
  }
}