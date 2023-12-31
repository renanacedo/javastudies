# Capitulo 3

## Seção 8 - Introdução a Programação Orientada a Objetos (POO)
3 conceitos basicos de POO
    Classe
    Atributos
    Metodos
Muita Prática
    Resorver com e sem o POO
Membros Estáticos

Criamos um programa sem utilização de POO para medir area de 2 triangulos e destacar qual é maior

Discussão
    Triangulo é uma entidade com 3 atributos: a, b e c 
    Foi usado 3 variaveis distintas em cada triangulo para seus atributos (6 no total)
    Vamos criar uma classe para representar o triangulo

    O que é classe ? 
        Tipo estruturado que pode conter membros
            Membros: Atributos (dados/campos) - Métodos (funções/operações)
        Classe pode prover outros recursos:
            Construtores
            Sobrecarga
            Encapsulamento
            Herança
            Polimorfismo
        Exemplos
            Entidades: Produto, Cliente, Triangulo
            Serviços: ProdutoService, ClienteService
            Controladores: ProdutoController, ClienteController
            Utilitarios: Calculadora, Compactador
            Outros (views, repositórios, gerenciadores, etc)
Instanciação
Alocaçao dinamica de memória

Criando método p/ obter beneficios de reaproveitamento e delegação

Estrutura atual da classe TRIANGULO
    package labJavas.labPoo.entities < pacote da classe >

    public class Triangulo{ <publico para outros arquivos acessarem> <class> <nome da classe>
        <atributos da classe>
        public double a;   <publico> <tipo do atributo> <nome do atribto>
        public double b;     
        public double c;

        public double area(){ <publico> <tipo que retorna> <nome do método> <parametros>
            double p = (a + b + c)/2.00;   <copo do método>
            return Math.sqrt(p*(p-a)*(p-b)*(p-c)); <o que ele retorna>
        }
    }
Projeto da Classe (UML) - Diagrama de classes e suas relações
     ___________________
    |     Triangulo     |  - Nome da class
    |___________________|
    |   - A : double    |  - Atributos da class
    |   - B : double    |
    |   - C : double    |
    |___________________|
    | + Area() : double |  - Métodos da class
    |___________________|  

Qual os beneficios de utilizar os métodos de uma classe Triangulo para calcular sua area?
    Reaproveitamento de código: Eleminação de código repetido no programa principal.
    Delegação de responsabilidades: Quem deve ser responsavel por calcular a area do triangulo 
    é o próprio triangulo.
    Cada classe é responsavel por si mesma (coesão)

Um novo problema exemplo

Object e toString
    toda classe em Java é subclasse da classe Object
    Object possui os seguintes métodos:
        getClass - Retorna o tipo do objeto
        equals - compara se o objeto é igual a outro
        hashCode - retorna um código hash do objeto
        toString - converte o objeto para string
        
Membros Estáticos
    Membro de classe = oposição a membro de instancia (que voce declara um novo idente e instancia um valor para um atributo dele)
    Membros são os atributos e métodos de uma classe
    Eles são idependentes de objetos, podem ser chamados mesmo sem objeto, direto do própio nome da classe
        (esperar par ver na prática como chama)
        att: a função Math.sqrt(double); é um membro estático que estavamos usando até agora, o "Math" é uma classe e não um método de uma classe. 
    Utilização comum:
        Classes utilitarias
        Declaração de constantes
    Classe com só membros estáticos se torna uma classe estática, não recebera nada que pode ser instanciado
    Constante é uma variavel estatica que não muda em nenhum outro momento de qualquer aplicação que a use
        Constante não é uma variavel
        O que define uma constante é:
            O "final" em "public static final double NOME_DA_CONSTANTE = 11
            O nome da constante ser toda em letra maiscula separada por underline
        Uma classe/função estatica eu não preciso instanciar (criar um "objeto") na aplicação
    Qualquer valor ou dado que será o mesmo resultado independente do objeto ou da opeção é o que aponta para esse dado ser parte de uma classe estática. 
    
## Seção 9 - Construtores, palavra this, sobrecarga, encapsulamento
Construtores
    É uma operação da classe que executa na estanciação do objeto (quando cria um objeto na aplicação)
    Uso comum:
        Iniciar valores dos atributos
        Obriga a receber dados para o objeto e injeção de dependencias
        É possivel especificar mais de um construtor na mesma classe = sobrecarga

    Exemplo prático:
        Por convenção é utilizado no nome do parametro no construtor os mesmo nomes dos atributos ao qual ele se refere.
        Para referenciar a variavel do atributo dentro do construtor é só usar o "this"
            this.nome = nome;
    This 
        É uma referencia para o própio objeto
        Diferencia atributos de variaveis locais
            Na memória ele cria um escopo do construtor para obter os dados nas variaveis > passa para os campos do atributos do objeto na memória
        Passa o próprio objeto como argumento na chamada de um método ou construtor (ele disse que isso só vai aprender mais pra frente)
            EX:
            public class ChessMatch {
                (...)
                placeNewPiece('e', 1, new King(board, Color.WHITE, this));
            }
            > Aqui ele ta criando uma classe que é a partida de xadrez
            > Nesse jogo ele tem um método que cria uma peça 
            > Os argumentos tem uma chamada de uma classe que cria uma peça de Rei que tem como argumento referenciar a class ChessMatch
            > Basicamente é a criação de uma peça pra um jogo que cria especificamente um Rei que tem como argumento afirmar que ele é DESTA partida que ta criando ele

            placeNewPiece tem 3 argumentos
                - uma letra
                - um numero
                - criar uma peça
                    ela é instanciada (criada "new") que tem 3 argumentos
                        - uma variavel
                        - uma cor (membro estatico)
                        - refenciação da class em que esta sendo criada
                            basicamente afirma que essa peça criada PERTENCE ao ChessMatch em que ela esta sendo criada
    
    Sobrecarga
        Uma classe pode oferecer mais de uma operação com mesmo nome porem com diferentes parâmetros

        Exemplo na aplicação de produto e estoque

    Encapsulamento
        Principio para esconder detalhes de implementação de uma classe
        Expoem apenas operações seguras que mantenham os objetos em estado consistente
        REGRA = o objeto deve sempre estar em estado consistente e a classe deve garantir isso.
        Analogia = Um radio permite o usuario apenas botoes de play/pause/pass - Todo o sistema e operação desses botoes é "escondido" do usuario

        Regra basica
            Um objeto NÃO expoe nenhum atributo = public > private
            Os atributos devem ser acessados por métodos get e set
                Eu somente utilizo um get ou set se eu puder alterar/pegar o atributo do objeto
                ex: a quantidade no estoque de um produto só pode ser alterado pelo método addProduto / removeProduto. Então eu não posso ter um setQuantidade, evitando assim que a quantidade seja alterada por outro meio alem do add ou remove
    
    Gerando automaticamente construtores, getters e setters
        Ele ensina no eclipse, bom pesquisar em outros, mas por enquanto vou utilizar manualmente para fortalecer o conhecimento.

    Modificadores de acesso
        private - membro só pode ser acessado na própria classe
        (nada) - membro só pode ser acessado no mesmo pacote
        protected - membro só pode ser acessado no mesmo pacote e subclasses de pacotes diferentes (utiliza com herança)
        public - qualquer classe tem acesso desde que no mesmo módulo

## Sessão 10 - Comportamento de Memória, array, listas
Classes são tipos refenrência 
    Memória
        Stack
            Quando uma variavel que o tipo é uma classe ele cria espaços nesse ambiente
        Heap (onde aloca objetos em tempo de execução / alocação dinamica de memória)
            Quando eu instancio a classe variavel com seus atribuos, criando um objeto ele preenche o Stack e aloca um objeto com os atributos aqui no HEAP 

        O espaço de memória da variavel no STACK guarda um endereço de memóra HEAP onde esta alocado o objeto com os atributos instanciados
        Por isso uma variável tipo classe é uma referencia, porque ele tem como dado o endereço/referença de onde o objeto esta alocado na memória.

        Ex: Product p1 = new Product("TV", 900.00, 0);
        p1 é uma variavel do tipo classe (a classe Product no caso):
            p1 esta no STACK e armazena o endereço de memoria onde esta os atributos ("TV" | 900.00 | 0) no HEAP
        
        Se eu indicar p1 como valor de outra variavel, essa nova variavel aponta para onde a p1 aponta, ou seja, ela passa a ter o valor de endereço de memória que a p1 tem.
        Esse tipo de variavel aceita o valor null; 
    Tipos primitivos = Tipos Valor
        No caso da variavel que é um tipo primitivo (String, double, int, ...) são caixas na memória STACK
        Ele não guarda um endereço/referencia mas sim diretamente o valor/dado designado a varivel na aplicação
        Iniciar variavel 
            Variaveis precisão ser iniciadas = colocar um valor na variável.
    Valores Padrão
        Quando é alocado qualquer tipo estruturado (classe ou array) são atribuidos valores padrão aos elementos.
            numero = 0
            boolean = false
            char = 0
            objeto = null;
Desalocação de memória
    Garbage Collector - automatiza o gerenciamento de memória do app em execução
    Ele monitora os alocados no heap e desaloca os que não estão mais sendo utiliados
        Os objetos que não tem referencia (uma variavel tipo classe com seu endereço) serão desalocados 
Desalocação por escopo
    Se a váriavel é criada/chamada dentro de um scopo (função, if, swith) ao final do scopo ela é desalocada

    RESUMO: 
    Objetos alocados dinamicamente, quando não possuem mais referência serão desalocados pelo garbage collector
    Váriaveis locais são desalocados imediatamente assim que o scopo que esta inserida termina execução.

Vetores 
    Vetor é um arranjo unidimencional = array
        Homogenea
        Ordenada
        Alocada de uma vez só 
            Vantagem = Acesso imediato ao elemento em sua posição
            Desvantagem = Tamanho fixo, dificil inserir e deletar itens
        Exemplo
        Exercicios

Boxing, unboxing, e wrapper classes
    Boxing - conversão de objeto tipo valor para objeto tipo referencia compativel
        int x = 20;
        Object obj = x;
            Object = classe generica do java 
            aloca um objeto contendo do valor de x 
    Unboxing - Processo inverso
        int y = (int) obj; 
            Cria no stack uma variavel com o valor dentro do objeto obj.
            (int) = casting para indicar que obj é um valor inteiro;
    Wrapper  classes
        classes equivalentes aos tipos primitivos
        Uso comum: boxing e unboxing de maneira natural na linguagem
            campos de entidades em SI (porque aceitam null e usa OO)
        Utilizar no lugar de tipos primitivos, principalmente em classes de objetos

Laço "for each"
    Sintaxe opcional simplificada para percorrer coleções
        for (Tipo apelido : coleção) {
            < comando 1 >
            < comando 2 >
        }

        EX: percorre todo os elementos da array "vect" chamando eles de obj e printa a cada vetor que passa
        for (String obj : vect ){
            print(obj)
        }

Listas 
    É uma estrutuda de dados
        Homogenea = mesmo tipo
        Ordenada = acessado por posições
        Inicia vazia e se preenche por demanda
        Cada elemento ocupa um nó (nodo) da lista
    Tipo (interface): List - não é uma classe, ele é uma interface
        Ele disse que interface será explicado mais pra frente no curso
        Não pode ser instanciado
        Utiliza classes que implementam a lista: ArrayList, LinkedList
    Vantagens
        Tamanho váriavel - Uma array/vetor tem tamanho fixo
        Facilidade para inserir e deleter elementos 
    Desvantagens
        Acesso somente sequencial aos elementos, não posso puxar um elemento fora da ordem.
        Porem pode se otimizar ela atraves da uma implementação minimizando essa desvantagem
    Tamanho da lista list();
    Inserir e remover: add(obj), add(int, obj) -- remove(obj), remove(int), removeIf(Predicate)
    Econtrar posição: indexOf(obj); - lastIndexOf(obj);
    Filtrar lista
        List<Integrer> result= list.stream().filter(x -> x > 4).collect(Collectors.toList());
    Encontrar primeira ocorrencia
        Integrer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
        
    
