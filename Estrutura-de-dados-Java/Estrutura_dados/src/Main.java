public class Main {
    public static void main(String[] args) {
        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("Carla");
        a8.setNome("Juricleida");
        a9.setNome("Bramusca");
        a10.setNome("Julietta");
        a11.setNome("Roberta");
        a12.setNome("Madalena");
        a13.setNome("Juninho");
        a14.setNome("Olivia");
        a15.setNome("Cesar");




        System.out.println("\nAlunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);

        System.out.println(lista);

        lista.remove(1);

        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        System.out.println(lista);

        lista.remove(0);
        lista.AdicionaPosicao(0, a7);
        lista.remove(10);
        lista.AdicionaPosicao(10, a9);
        
        System.out.println(lista);

        System.out.println(lista.contem(a4));

        System.out.println(lista.pega(5));


    }
}