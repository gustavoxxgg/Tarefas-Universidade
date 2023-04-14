import java.util.Scanner;
class R15 {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int idade;
    float peso;
    float altura;
    boolean continuar = true;
    
    int qtdpessoas = 0;
    float mediaidade = 0;
    int ma90k = 0;
    int me1_5a = 0;
    float pe10e30 = 0;
    float pma1_9a = 0;

while (continuar) {
  System.out.println("Digite a sua idade");
  idade = teclado.nextInt();
  System.out.println("Digite a sua altura");
  altura = teclado.nextFloat();
  System.out.println("Digite o peso");
  peso = teclado.nextFloat();

  mediaidade += idade;
  if (peso > 90) {
    ma90k++;
  }
  if (altura < 1.5) {
    me1_5a++;
  }
  if (idade > 10 && idade < 30) {
    pe10e30++;
  }
  if (altura > 1.9) {
    pma1_9a++;
  }
  qtdpessoas++;
  System.out.println("Deseja continuar? (s)Sim (n)Não");
  char opcao = teclado.next().charAt(0);
  if (opcao == 's') {
    continuar = true;
  } else {
    continuar = false;
  }
}
mediaidade = mediaidade / qtdpessoas;
pe10e30 = pe10e30 / qtdpessoas;
pma1_9a = pma1_9a / qtdpessoas;

System.out.println("A média de idade é: " + mediaidade);
System.out.println("Quantidade de pessoas com peso maior que 90kg: " + ma90k);
System.out.println("Quantidade de pessoas com altura menor que 1.5m: " + me1_5a);
System.out.println("Percentual de pessoas com idade entre 10 e 30 anos: " + (pe10e30 * 100) + "%");
System.out.println("Percentual de pessoas com altura maior que 1.9m: " + (pma1_9a * 100) + "%");

  }
}