package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		/* ----- OPERADORES
		 * 
		 * Operadores são símbolos que representam atribuições, cálculos e ordem de dados. São elementos funcionais que atuam sobre os operandos para produzir um determinado resultado. Existem cinco tipos de operadores em Java:
		 * 
		 * Operadores aritméticos: //Operadores básicos da matemática
		 * * (+) "adição" (também usado para concatenação de strings)
		 * * (-) "subtração"
		 * * (*) "multiplicação" 
		 * * (/) "divisão"
		 * * (%) "módulo" (retorna o resto da divisão)
		 * 
		 * Operadores unários: //Operadores aritméticos que agem em apenas um operando, podem ir antes da variável (++x, pré-incremento, o incremento é feito e depois o valor é lido) ou depois da variável (x++, pós-incremento, o valor da variável é lido e depois é incrementado)
		 * * (++) "incremento"
		 * * (--) "decremento"
		 * 
		 * Operadores de atribuição: //São utilizados para atribuir um valor
		 * * (=) "atribui o valor da direita à variável da esquerda"
		 * * (+=) "atribuição com soma"
		 * * (-=) "atribuição com subtração"
		 * * (*=) "atribuição com multiplicação"
		 * * (/=) "atribuição com divisão"
		 * * (%=) "atribuição com módulo"
		 * 
		 * Operadores relacionais: //São utilizados para comparar valores entre variáveis e expressões do mesmo tipo e criar declarações condicionais
		 * * (<) "menor que"
		 * * (>) "maior que"
		 * * (<=) "menor ou igual que"
		 * * (>=) "maior ou igual que" 
		 * * (!=) "diferente de" 
		 * * (==) "igual a"
		 * Operadores lógicos: //São utilizados para realizar comparações e validações, criando condicionais complexas
		 * * (&&) "conjunção: E"
		 * * (||) "disjunção: OU" 
		 * * (!) "negação: NÃO" (inverte o valor booleano do operando)
		 */
		
		// Programa para calcular uma média ponderada
		float n1, n2, n3, media; // Criando as variáveis
		
		Scanner input = new Scanner(System.in); // Criação do scanner para receber os inputs. A palavra new instancia um novo objeto da classe scanner
		
		// Lendo as notas
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = input.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = input.nextFloat();
		
		// Em uma média ponderada, a primeira nota tem peso 2, a segunda nota tem peso 3, e a terceira nota tem peso 5, por fim, a soma das três é dividida por 10
		media = ((n1*2) + (n2*3) + (n3*5))/10; 
		
		// Printando o resultado na tela
		System.out.println("\nA média ponderada é: " + media);
		
	}

}
