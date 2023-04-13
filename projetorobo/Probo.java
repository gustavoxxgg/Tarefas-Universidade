import java.util.Scanner;

class Probo {

    public static void main(String[] args) {
        Robo robo = new Robo(); //Instanciar a classe Robo
        Scanner teclado = new Scanner(System.in);
        int resp = 1;
        while (resp == 1) {
            System.out.println("Informe a direção");
            char direcao = teclado.nextLine().charAt(0);
            robo.setDirecao(direcao);
            robo.mostrarPosicaoAtual();
            System.out.println("Deseja continuar? \n 1 - Sim \n Ou pressione qualquer outro número para sair");
            resp=teclado.nextInt();
            teclado.nextLine();//Capturar o enter
        }
        teclado.close();
    }

}
