/*
Crie um programa que utilize um laço de repetição para exibir na tela os números de 100 a 200. O programa deve utilizar a estrutura de repetição "for" para percorrer os números. Declare uma variável inteira "n" e inicialize-a com o valor 100. Em cada iteração do laço de repetição, incremente o valor de "n" em 1 e exiba na tela o valor atual de "n". Ao final da execução do laço, o programa deve ter exibido os números de 100 a 200.
*/
class R02 {
  public static void main(String[] args) {
    int n;
      for(n = 100; n <=200; n++ )
        {
          System.out.println(n);
        }
  }
}