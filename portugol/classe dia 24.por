programa
{
	
	funcao inicio()
	{
		inteiro num
		
		escreva("Digite um numero inteiro maior que zero\n")
		leia(num)
		
		se (num <= 0){
			escreva("Numero inválido, digite um valor maior que Zero\n")
		}
		senao se(num % 2 ==0){
			escreva("O numero informado é par\n")
		}
		senao {
			escreva("O numero é impar\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */