programa
{
	
	funcao inicio()
	{
		inteiro dias,meses,anos,dataDeNascimentoEmDias
		escreva("Digite o ano do seu nascimento:")
		leia (anos)
		escreva("Digite o mes do seu nascimento:")
		leia (meses)
		escreva("Digite o dia do seu nascimento:")
		leia (dias)
		dataDeNascimentoEmDias= ((2021 - anos) * 365) + (meses * 30) + dias
		escreva("Data de nascimento em dias: ", dataDeNascimentoEmDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */