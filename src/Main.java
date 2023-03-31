/* Exercício 01) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
   - Ter no mínimo 65 anos de idade.
   - Ter trabalhado no mínimo 30 anos.
   - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um programa que leia: o número do empregado (código), o ano
de seu nascimento e o ano de seu ingresso na empresa.
O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria'
ou 'Não requerer'.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int anoNascimento;
        int anoAdmissao;
        int codigo;
        int tempoEmpresa;
        int anoAtual = 2023;

        System.out.println("Informe seu código:");
        codigo = entrada.nextInt();
        System.out.println("Informe seu ano de nascimento:");
        anoNascimento = entrada.nextInt();
        System.out.println("Informe o ano de entrada na empresa:");
        anoAdmissao = entrada.nextInt();
        idade = anoAtual - anoNascimento;
        tempoEmpresa = anoAtual - anoAdmissao;
        if (idade>=65){
            System.out.println("Pode requer a aposentadoria");
        }
        else if (tempoEmpresa>=30) {
            System.out.println("Pode requer a aposentadoria");
        }
        else if (idade>=60 && tempoEmpresa>=25) {
            System.out.println("Pode requer a aposentadoria");
        }
        else {
            System.out.println("Não pode requer a aposentadoria");
        }

    }
}