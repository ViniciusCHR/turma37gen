programa
{
	
	funcao inicio()
	{
//João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento
//do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
//João precisa que você faça um sistema que leia a variável P (peso de tomates)
//e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M
//o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.

		inteiro p,exc,m

		 escreva("Digite o peso em quilos da caixa de tomates\n")
		 leia(p)
		 se(p<0){
		 	escreva("Peso informado inválido\n")
		 }
		 senao se(p<=50){
		 	escreva("Essa caixa tem o peso permitido pelo Estado de São Paulo \n")
		 }
		 senao {
		 	exc= p - 50
		 	m= exc * 4
		 	escreva("Peso: \n",p, "Excesso: \n",exc, "Multa: \n",m)
		 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */