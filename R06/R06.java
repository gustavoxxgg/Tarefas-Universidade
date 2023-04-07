/*
Crie um programa que utilize um laço de repetição para exibir na tela os múltiplos de 5 no intervalo entre 5 e 50. O programa deve exibir um número por linha, utilizando a estrutura de repetição "for" para percorrer os números. Declare uma variável inteira "n" e inicialize-a com o valor 5. Em cada iteração do laço de repetição, incremente o valor de "n" em 5 e exiba o valor de "n" na tela utilizando o comando "System.out.println()". Ao final da execução do laço, o programa deve ter exibido os múltiplos de 5 no intervalo de 5 a 50.
*/
class R06 {
  public static void main(String[] args) {
    int n;
    float resto;
      for(n=5; n<=50; n = n+5){
        System.out.println(n);
      }
  }
}