programa
{
	//código com erro//
	funcao inicio()
	{
//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
//E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
//caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
//No final do processamento imprimir o salário total e o salário excedente.
		inteiro C,N,exc,salario
		escreva("Digite o código do funcionário \n")
		leia(C)
		escreva("Digite o numero de horas trabalhadas\n")
		leia(N)

		se(N<0){
			escreva("Valor inválido\n")
		}
		senao se(N<=50){
			salario= N * 10
			exc= 0
			escreva("O salário do funcionário será de: \n",salario," O valor excedente será de: \n",exc)
		}
		senao{ 
			exc= ((N - 50) * 20)
			salario= 500 + exc
			escreva("O salário do funcionário será de: \n",salario," O valor excedente será de: \n",exc)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 951; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */