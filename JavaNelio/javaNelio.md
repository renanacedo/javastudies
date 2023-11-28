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

 