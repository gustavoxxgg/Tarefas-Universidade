/*
Crie um programa que utilize um laço de repetição para exibir na tela a metade dos números de 10 a 20. O programa deve utilizar a estrutura de repetição "for" para percorrer os números. Declare uma variável float "n" e inicialize-a com o valor 10. Em cada iteração do laço de repetição, incremente o valor de "n" em 1 e exiba na tela a metade desse valor, utilizando a operação de divisão por 2. Ao final da execução do laço, o programa deve ter exibido a metade dos números de 10 a 20.
*/
class R03 {
  public static void main(String[] args) {
    float n;
      for( n=10; n<=20; n++)
        {
          System.out.println(n/2);
        }
  }
}