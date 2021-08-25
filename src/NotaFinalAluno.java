import java.util.Scanner;

public class NotaFinalAluno {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("insira as notas do aluno abaixo:");
		
	 
	   
		
		double bimestre1;
		double bimestre2; 
		double bimestre3; 
		double bimestre4; 
		double media;
		
		
		System.out.print("Nota 1 bimestre:");
		bimestre1 = leitor.nextDouble();
	    
		System.out.print("Nota 2 bimestre:");
		bimestre2 = leitor.nextDouble();
		
		System.out.print("Nota 3 bimestre:");
		bimestre3 = leitor.nextDouble();
		
		System.out.print("Nota 4 bimestre:");
		bimestre4 = leitor.nextDouble();
		
		
		media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) /4;
		System.out.println("Média final: " + media);
		
		if (media >=6) {
			System.out.println("O aluno foi aprovado");
			
		}
		
		else { 
		System.out.println("O aluno foi reprovado");	
		}
			
			
		
		
		 
		 
		 
	
				
		
		
	    
		
		
		
		
		
	
		
		

		
		
	}

}
