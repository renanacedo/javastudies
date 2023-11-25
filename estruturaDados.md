d# Estrutura de Dados - Prof. Isidro - Youtube

## Aula 01 - Tipos Abstrato de Dados 
    Tipos abstratos de dados tem o objetivo de esconder os detalhes de quem o utiliza
    Você criar classes e objetos que utilizam as classes e depois criar e utilizar objetos em aplicações.
        Esse esta sendo o processo para explicar os dados abstratos. No caso a classe e o objeto contem dados
        abstratos, pois são dados/algoritimos utilizados por uma aplicação sem necessariamente ela saber o que 
        esses algoritimos fazem. 
            Como exemplo ele criou uma class televisao com um construtor de uma televisao e contem metodos para se utilizar uma TV.
            Depois criou um objeto com suas variaveis de aspectos do objeto necessarios para os metodos, e os metodos que utilizam/modificam as variaveis. 
                Eu tenho um objeto com variaves (caracteristicas) e metodos que executam alguma ação (funções) nessas variaveis, seja modificar ou somente chamar/utilizar.
                E tenho uma classe que cria um novo objeto e executa/chama os metodos do objeto aplicando (ou não) algum valor a esses metodos que modificam suas variaveis.

                O arquivo do objeto que contem as variaveis e metodos não é o objeto em si, ele é um "quadro em branco" com lacunas que devo preencher. Cada vez que utilizo esse objeto em alguma aplicação definindo ele em alguma variavel diferente da outra estou criando objetos separados. 
                O arquivo do objeto, no caso televisao.java, é somente para eu definir metodos e caracteriscas a uma variavel na minha aplicação, eu nao preciso saber exatamente como os metodos da televisao.java fazem o que faz, eu so preciso saber como utiliza-los (quais dados preciso fornecer para o metodo executar)

                Ficou a duvida: É a classe que usa o objeto ou o objeto que usa a classe, ou uma aplicação que usa classes que usam objetos ?? 
            Então
                Os dados abstratos são as classes e os objetos, com seus metodos e atributos, com suas estruturas, encapsulados para somente serem chamados nas aplicações através de funções sem a necessidade da aplicação (quem a constroi na verdade né) saber como esta estruturado os dados/metodos/funções. 

## Aula 02 - Pilha: Conceitos e Implementações
Recapitulação da aula 01

    Quem vai usar o tipo de dado que defino não precisa saber a parte interna/implementação do dado, só precisa saber como usar.
    Eu que sou o dev preciso saber como implementar e deixar blindado*, porque eu que vou fazer.
Pilha
Vamos trabalhar 5 operaçoes em pilha

        1 - Cria a pilha
        2 - Verifica se esta vazia
        3 - Verifica se esta cheia
        4 - Empilhar
        5 - Desempilhar

O que é uma pliha ?

        Conjunto de elementos do mesmo tipo, utilizando vetor/array armazenando segundo uma estratégia
        1 elemento sempre vai no topo da pilha, e os seguintes um acima do outro. 
        Eu só enxergo o elemento que esta no topo, quantos tem e quais não é possivel saber, tem como inserir (push) e tirar (pop). *ou seja, para ver os proximos elementos só desempilhanado. 
        De fato, só da pra criar, ver se ta vazia ou cheia, empillhar e desempilhar.
        NÃO É HERANÇA
        Para que serve ? Como implementa ? 

#Criando uma estrutura de pilha (vou criar um arquivo java para melhor visualização e boto aqui a imagem depois)
<div align ="center">
    <img src="https://github.com/renanacedo/javastudies/assets/110266440/97abe34e-5123-4d3e-bd8d-2faabc5e55ce" width="550px" />
</div>


