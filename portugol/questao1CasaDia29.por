programa
{
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
// Encontre após a maior pontuação e a apresente. 	
	funcao inicio()
	{
		inteiro p[5], x=0, maiorNota=0
		para (x=0;x<5;x++){
		escreva ("Digite a pontuação da atividade\n")
		leia (p[x])
		}
		para (x=0;x<5;x++){
		se (maiorNota < p[x]){
			maiorNota= p[x]		
		}
		}
		escreva("\nO valor da primeira atividade é: "+p[0])
		escreva("\nO valor da segunda atividade é: "+p[1])
		escreva("\nO valor da terceira atividade é: "+p[2])
		escreva("\nO valor da quarta atividade é: "+p[3])
		escreva("\nO valor da quinta atividade é: "+p[4])
		escreva("\nO valor da maior atividade é: "+maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 705; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */