
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
        Aluno a14= new Aluno();
        Aluno a15= new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();

        a1.setNome("Héber Wilton");
        a2.setNome("Ricardo Oliveira");
        a3.setNome("Rebeca Silva");
        a4.setNome("Caio Alexandre");
        a5.setNome("Pedro Henrique");
        a6.setNome("Maycon Douglas");
        a7.setNome("Letícia Vitória");
        a8.setNome("Alana Patricia");
        a9.setNome("Nicolas Santos");
        a10.setNome("Gustavo Paiva");
        a11.setNome("Victor Souza");
        a12.setNome("Guilherme Albuquerque");
        a13.setNome("Karine Letícia");
        a14.setNome("Livia Emilly");
        a15.setNome("Ingrid Alicia");
        a16.setNome("Bruna Marquezine");
        a17.setNome("Neymar junior");

        // adição de 15 alunos
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


        System.out.println("Foram adicionados os seguintes alunos: " + lista);
        System.out.println(" ");

        lista.remove(13);
        lista.remove(15);

        lista.adicionaPosicao(0,a16);
        lista.adicionaPosicao(1,a17);
        System.out.println("Lista atualizada: " + lista);

    }
}