public class Vetor{
    private Aluno[] alunos = new Aluno[100];

    private int totalDealunos = 0;

    private void garantaEspaco(){
        if(this.totalDealunos == this.alunos.length){
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];

            for(int i = 0; i < this.alunos.length; i ++){
                novaArray[i] = this.alunos[i];
            }

            this.alunos = novaArray;
        }
    }

    public void Adiciona(Aluno aluno){
        this.garantaEspaco();
        this.alunos[this.totalDealunos]= aluno;
        this.totalDealunos++;
    }

    public void AdicionaPosicao(int posicao, Aluno aluno){
        this.garantaEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException(("Posição inválida"));
        }

        for(int i = this.totalDealunos - 1; i >= posicao; i -= 1){
            this.alunos[i + 1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;
        this.totalDealunos++;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDealunos;
    }

    public int getTotalDealunos(){
        return totalDealunos;
    }

    public Aluno pega(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao){
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.totalDealunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }

        this.totalDealunos--;
    }

    public  boolean contem(Aluno aluno){

        for(int i = 0; i < this.alunos.length; i++){
            if (aluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.totalDealunos;
    }

    public String toString(){
        if(this.totalDealunos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDealunos - 1; i++){
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDealunos;
    }

}
