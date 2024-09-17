// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");

        //Encadeado
        int nota1 = 6;

        if (nota1 >= 7)
            System.out.println("Aprovado");
        else if (nota1 >= 5 && nota1 < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        //condição ternaria
        int nota2 = 7;
        String resultado2 = nota2 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado2);

        int nota3 = 6;
		String resultado3 = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado3);
    }
}