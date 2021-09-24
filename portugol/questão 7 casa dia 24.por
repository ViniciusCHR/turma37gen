programa
{
	
	funcao inicio()
	{
//Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero).
//Em caso afirmativo, calcular a área do triângulo.
		real b,alt,A
		escreva("Digite um valor positivo para altura do triangulo\n")
		leia(alt)
		escreva ("Digite um valor positivo para base do triangulo\n")
		leia(b)

		se(alt<=0){
			escreva("Valor inválido\n")
		}
		senao{
			A= (b * alt) / 2
		}
		se(b<=0){
			escreva("Valor inválido\n")
		}
		senao{
			A=(b * alt) / 2
			escreva ("A área do triângulo é: \n",A)
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */