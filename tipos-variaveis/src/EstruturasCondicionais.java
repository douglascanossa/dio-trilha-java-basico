public class EstruturasCondicionais {
    public static void main(String[] args) {

        // CaixaEletronico.java
        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;
 
         System.out.println(saldo);
 
        // ResultadoEscolar.java
        int nota = 6;
       
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else
         System.out.println("Reprovado");

        // ResultadoEscolar.java
        int znota = 6;
    
        if (znota >= 7)
            System.out.println("Aprovado");
        else if (znota >= 5 && znota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");


        // Condição Ternaria
        int ynota = 7;
		String yresultado = ynota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(yresultado);

        int wnota = 6;
		String wresultado = nota >=7 ? "Aprovado" : wnota >=5 && wnota <7 ? "Recuperação" : "Reprovado";
		System.out.println(wresultado);

        // Switch Case

        // SistemaMedida.java
        // Modo condicional if/else
        String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MEDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");

    // Modo condicional switch / case
        switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MEDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}

        //Sistema de plano telefônico
        String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
		}

        // Modo condicional switch/case
        String zplano = "M"; // M / T

		switch (zplano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

     }
}
