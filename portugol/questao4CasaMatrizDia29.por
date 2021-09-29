programa
{
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
//exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	
	funcao inicio()
	{
		inteiro mat[3][3],x=0,y=0, somaDiag=0, somaTotal=0
		para (x=0 ;x<3 ;x++){
			para (y=0 ;y<3; y++){
				escreva ("Escreva o valor\n")
				leia(mat[x][y])
			}
		}
		para (x=0;x<3;x++){
			para (y=0;y<3;y++){
				somaTotal+= mat[x][y]
				somaDiag = mat[0][0] + mat[1][1] + mat[2][2]
			}
		}
		escreva ("A soma total dos valores da matriz é: \n." +somaTotal+ "\n E a soma da diagonal principal é: \n"+somaDiag)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */