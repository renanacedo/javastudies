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
