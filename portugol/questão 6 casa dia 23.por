programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//inicio ok
		//variaveis ok
		real d,x1,x2,y1,y2
		//entrada	
		escrever("Digite o valor de x1")
		leia(x1)
		escrever("Digite o valor de x2")
		leia(x2)
		escrever("Digite o valor de y1")
		leia(y1)
		escrever("Digite valor de y2")
		leia(y2)
		//processamento ok
		D= matematica.arredondar(matematica.raiz((matematica.potencia ((x2 - x1),2) + matematica.potencia(y2-y1),2),2))
		//saida ok
		escreva("O valor de D é: ",d)
		
		
		
		
		
		
		//fim ok
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */