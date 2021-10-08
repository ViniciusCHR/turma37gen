package application;

import enteties.Carro;

public class TesteCarroPadrao {
		public static void main(String[]args) {
			Carro carro1 = new Carro("XXX-XXXX","ONIX","");
			Carro carro2 = new Carro();
			
			carro2.setPlaca("ABC-1234");
			carro2.setModelo("Uno");
			carro1.setPlaca("ABC-1235");
			System.out.println(carro1.getModelo()+" "+carro1.getPlaca());
			System.out.println(carro2.getModelo()+" "+carro2.getPlaca());	
			
			carro1.ligarCarro();
			carro1.andarCarro();
			System.out.println();
			carro1.subirMarcha();
			carro1.acelerar();
			carro1.acelerar();
			carro1.acelerar();
			carro1.acelerar();
			System.out.println();
			carro1.subirMarcha();
			for(int x=1; x<10;x++) {
				carro1.acelerar();
			}
			for() {
				
			}
			System.out.println("marcha: "+carro1.getMarcha()+" velocidade: "+carro1.getVelocidade());
			
		}
	
}
