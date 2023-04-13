public class Robo {
    private char direcao;
    private int posicaoX, posicaoY;
    
    
    public char getDirecao() {
        return this.direcao;
    }
    
    public void setDirecao(char direcao) {
        switch (direcao) {
            case 's':
                this.direcao=direcao;
                posicaoY--;
                break;
            case 'o':
                this.direcao=direcao;
                posicaoX--;
                break;
            case 'n':
                this.direcao=direcao;
                posicaoY++;
                break;
            case 'l':    
                this.direcao=direcao;
                posicaoX++;
                break;
            default:
                System.out.println("Direção Inválida");
                break;
        }
    }
    public void mostrarPosicaoAtual(){
        System.out.println("Direção: "+this.getDirecao()+"\nPosição X: "+this.posicaoX+"\nPosição Y:"+this.posicaoY);
    }
}
