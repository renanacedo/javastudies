# Curso de Java COMPLETO 2023 - Nelio Alves

## Seção 2 - Conceitos de Programação

Basicamente explica o que é um algoritmo, programa de computador, o que é necessario para fazer um programa/aplicação.
Fala sobre sintaxe e lexica de uma linguagem de programação
Explica sobre uma IDE - No caso ele vai utilizar eclipse para o java, eu porem vou usar aqui mesmo e posteriormente o intellij (talvez direto o intellij)


## Seção 3 - Intro Lang Java

Estrutura de uma app Java
    Java é uma lang de POO - Programação Orientada a Objetos
    Unidade basica logica é  Classe
    Package = Agupamento logico de classes relacionais. Basicamente agrupar as classes que são relacionadas
    Modulo = (Java 9) Agrupamento de Package. Assuntos que constitui os pacotes relacionados
        Runtime = É um agrupamento físico - Unidade física que pode ser instalada para rodar o app
    Aplicação = Basicamente é agrupamento dos modulos que é compilado e executado como aplicação completa

## Seção 4 - Estrutura Sequencial

Expressão Aritméticas
Operadores
    + Soma
    - Subtração
    * Multiplicação
    / Divisão
    % Mod

Variáveis e Tipos básicos em Java
Var = porção de memoria RAM que armazena dados para serem utilizados nos app em execução.
    Sintaxe <tipo> <nome> = <valor da var>;
       Ex: int idade = 25;
    Possui: Tipo, Nome, Valor, Endereço (qual local da memoria RAM ela esta)

Tipos Primitivos
    byte
    short
    int
    long
    float
    double
    char
    boolean
    String
Três operações basicas
    Entrada de Dados - Usuario informa dados ao programa (que le os dados e processa)
    Processamento de Dados - 
    Saida de Dados - Programa informa dados ao usuario

Saida de dados
    System.out.println
    System.out.printf 
    Concatenando o System.out.prinf utilizando dentro do () o + entre Strings e variaveis;
        Para concatenar no print F não precisa pois a formatação ja permite inserir a Strings com variaveis no seu meio
Processamento de dados
    <variável> = <expressão>;
        A expressão é calculada e armazenada na variável determinada;
    Casting = Convesão explicita de tipos de dados;
Entrada de dados
    É necessario criar um objeto do tipo Scanner
        Scanner sc = new Scanner(System.in);

## Seção 5 - Estrutura condicional

Expressão comparativa
    Compara um dado com outro e resulta em Falso ou Verdadeiro
    >  - Maior
    <  - Menor
    >= - Maior Igual
    <= - Menor Igual
    == - Igual Igual 
    != - Diferente
Expressão lógica
    && - E - AND = Deve conter todas as condições TRUE
    || - OU - OR = Pelo menos 1 condição deve ser TRUE
    !  - NÃO - NOT = Nenhuma condição deve ser TRUE
Estrutura condicional - Estrutura de controle
    if
        if (condição){
            <comando1>;
            <comando2>;
        }
    else (condição){
        <comanado1>
    }
Sintax Opicional
    Operadores de atriuição cumulativa
        x += b <isso soma x = x+b>
Sintax opcinoal
    switch - case
        Isso serve para diminuir o montante de if-else
        Estrutura:
        switch (expressão){
            case valor1:
                comando1
                break;
            case valor2:
                comando1;
                break;
            default:
                comando1;
                break;
        }

Expressão condicional ternária
    Opcional if-else = deseja decidir um valor com base na condição
    sintaxe
        (condição) ? <valor se verdadeiro> : valor se falso
    
Escopo e inicialização
    Escopo: A variavel só pode ser referenciada se for declarada e indicado um valor
        Variavel utilizadas dentro de alguma estrutura condicional/logica/função deve ser 
        declarada fora da estura para poder ser referenciada. E tambem deve ser iniciada nas condicionais em todas as condições 

 ## Seção 6 - Estruturas repetitivas

Ele ensina o DEBUG no eclipse, ou seja, preciso aprender o debug no vscode e intellij
    ps: o que é um debug ?
        O programa executa linha por linha, apartir do breakpoint, sob meu controle de passar cada linha
    Toggle breakpoint
        No VSCode = F9 > Click direito no arquivo > Debug Java
    Basicamente ele ensinou o debug para ver as estruturas de repetição acontecendo passo a passo

Estrutura repetitiva - while (enquanto)
    estrutura de controle que repete um bloco de controle enquanto uma condição for verdadeira
    Quando usar: Quando você não sabe quantas vezes esse algoritmo/programa/bloco precisa repetir
    Sintaxe
        while(condição){
            <comando1>
            <comando2>
        }
        Se a condição é verdadeira executa e retorna
        Se a condição é verdadeira ele termina
    
    Ai ele vem e mete um teste de mesa = Pulei
    Execicios na pasta LabNelio > src > exjavas > exjava1, exjava2 e exjava3

Estrutura repetitiva FOR ( para )
    Repete um bloco de comandos para um certo intervalor de valores
    Quando usar: Quando se sabe a quantidade de repetições ou intervalo de valores (difere do while)
    Sintaxe
        for (início; condição; incremento){
            comando 1
            comando 2
        }
        Início = Executa somente a primeira vez
        Condição = V - Executa e volta F - Fim
        Incremento = Executa toda vez depois que voltar
    Essa estrutura de FOR é otima para repetição baseada em contagem
    Ai ele mostra teste de mesa e faz exercicios de teste de mesa
    Exercicios:
        LabNelio > src > exjavas > exjava4, exjava5, exjava6, exjava,7 exjava8, exjava9, exjava10

Estrutura repetiva do-while (faça enquanto)
    O bloco de comando é executado pelo menos 1 vez pois a verificação é feita no final
    Sintaxe
    do {
        comando 1 
        comando 2
    } while (condição)
    Se eu utilizar alguma variavel para a condição WHILE que esteja só dentro do bloco DO, eu preciso declarar
    essa variavel do lado de fora do bloco;

## Seção 7 - Outros tópicos básicos sobre Java
Restrições e convenções para nomes
Variaves
        não pode começar com numeral
        não usar acento ou til
        não ter espaço em branco
        Sugestão: Use nome que tenha significado com sua utilização
    camelCase
        pacotes
        atributos
        métodos
        variáveis e paramêtros
    PascalCase
        classes
    
Operadores Bitwise
    Operadores lógicos que realizam operações bit a bit
    & - AND bit a bit
    | - OR bit a bit
    ^ - XOR bit a bit
        Isso daqui pega literalmente o dado transforma e bit e compara os bits de cada informação e retorna
        o resultado de volta no formato original. 
        ex: 
        89 & 60 = 24
            89 - 0101 1001
           AND
            60 - 0011 1100
            R  - FFFV VFFF
            24 - 0001 1000
        ONDE USA ISSO ? - Isso usa em programação de baixo nivel ex: interface de rede para vefiricar um bit especifico

Funções interessantes p/ String
    Formatar
        toLowerCase(); Transforma p/ minusculo
        toUpperCase(); Transforma p/ Maiusculo
        trim(); Remover espaços
    Recortar
        substring(inicio); recorta os char apartir da posição indicada
        substring(inicio, fim); recorta apartir e até 
    Substituir
        Replace(char, char); substitui o char designado pelo outro designado
        Replace(string, string); substitui a string designado pelo outro designado
    Buscar 
        IndexOf - Ex int x = variavel.indexOf(); e ai ele indica qual a posição do valor indicado da variavel selecionada
        LastIndexOf
    str.Split(""); separa a string com base no separador escrito
        EX: String[] vect = variavel.split("");
            Estou pegando os valores numa variavel separados por espaço e crianto vetores numa array chamada vect

Comentários em Java
    Basicamente explica como colocar um comentario 
        // isso é um comentario de linha
        /*isso é um comentario de bloco */
    
Funções (sintaxe)
    Processamento que possui um significado
        Math.sqrt(double) = Raiz quadrada do parametro/valor
        System.out.println(string); = Printa algo na tela
    Vantagens
        Modularização
        Delegação 
        Reaproveitamento
    Dados de entrada e Saida
        Podem receber dados de entrada - paramentros ou argumentos
        Podem ou não retornar dados de saída
    Em POO funções em classes são metódos
    Em seguida fizemos um arquivo exemplificando como criar e utilizar uma função no mesmo arquivo
        labNelio > labJavas > Lab2.java


