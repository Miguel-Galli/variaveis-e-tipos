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
        /*char categoriaLivro;
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
        }*/

        //Classificação por Categoria
        /*double preco = 150.0;

        if (preco <= 50.0) {
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50.0 && preco <= 200.0) {
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: premium");
        }*/

        // Par ou Impar
        /*int numero = 7;
        int parOuImpar = numero % 2;

        if (parOuImpar == 0){
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse numero é impar")
            };*/

        //Conversão de moeda
        /*double valorEmReais = 451.50;
        double taxaDeCambio = 5.25;
        double valorEmDolar = valorEmReais / taxaDeCambio;
        System.out.println("Valor em dolar: " + valorEmDolar);*/

        //verificação de idade e escopo de variaveis
        /*int idade = 17;
        String mensagem;
        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);*/

        //planejando uma viagem: consumo e autonomia

        double consumoMedio = 12.5;
        double capacidadeTanque = 40.0;
        double quantidadeCombustivel = 20.0;
        double distanciaViagem = 300.0;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * quantidadeCombustivel;

        System.out.printf("Autonomia maxima do veiculo: %.1f Km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual do veiculo: %.1f Km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("voce consiguirá completar sua viagem sem precisar abastecer o tanque.");
        } else {
            System.out.println("Abasteça antes de viajar");
        }


    }
}