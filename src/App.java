import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos livros você vai registar? ");

        Livro[] lista = new Livro[sc.nextInt()];
        
        Pessoa pss = new Pessoa(lista);

        sc.nextLine();
        System.out.println("Olá, qual é o seu nome? ");
        pss.setNome(sc.nextLine());
        
    
        for(int i = 0; i < lista.length; i++){
            /* Limpa o terminal */
            System.out.print("\033[H\033[2J");
            System.out.flush();
            /* Limpa o terminal */
            
        Livro lvr = new Livro();
            
        
        
        System.out.println(pss.getNome() + " Qual livro você leu? ");
        lvr.setNome(sc.next());

        sc.nextLine();
        System.out.println("Quantas páginas ele tinha? ");
        lvr.setNumeroPaginas(sc.nextInt());

        lista [i] = lvr;

        }


        System.out.println("Quantos livros você já leu? ");
        pss.setQtdLivrosLidos(sc.nextInt());

        System.out.println(pss.getNome() + " leu no total " + pss.getQtdLivrosLidos()
         + " livros");
         
         for (Livro livro : lista) {
            System.out.println("Livro: " + livro.getNome() + " - Números De Páginas: " + livro.getNumeroPaginas());
            
         }



    }
}
