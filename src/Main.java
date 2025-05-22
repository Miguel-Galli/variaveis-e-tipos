public class Main {
    public static void main(String[] args) {

        //Declarando valores e variaveis
        /*String nome = "Miguel";
        int idade = 23;
        double altura = 1.83;
        boolean estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É Estudante: " + estudante);*/

        //Conversão de Tipos
        /*double valorEntrada = 19.5;

        int valorSaida = (int) valorEntrada;
        System.out.println("O valor inteiro do produto é: " + valorSaida);*/

        //Primitivos em ação
        /*double nota1;
        double nota2;
        double nota3;

        nota1 = 7.5;
        nota2 = 8.0;
        nota3 = 9.0;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);*/

        //conversão de temperatura
        /*int celsius = 20;

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(fahrenheit);*/

        //cadastro de livro
        char categoriaLivro;
        categoriaLivro = 'f';
        Livro livro = new Livro("O pequeno principe", "Antoine de Saint-exupéry", 96, 39.9, categoriaLivro);
        String saida = "Livro cadastrado: " + livro.titulo +
                ", de " + livro.autor +
                ". Ele possui " + livro.numeroPaginas +
                " paginas, custa R$ " + livro.preco +
                " e pertence a categoria ";

        if (categoriaLivro == 'F'|| categoriaLivro == 'f') {
            System.out.println(saida + "Ficção");
        } else if (categoriaLivro == 'N' || categoriaLivro == 'n') {
            System.out.println(saida + "Não ficção");
        } else if (categoriaLivro == 'T' || categoriaLivro == 't') {
            System.out.println(saida + "Tecnologia");
        } else {
            System.out.println(saida + "Hisória");
        }






    }
}