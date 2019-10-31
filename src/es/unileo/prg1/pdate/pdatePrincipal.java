package es.unileo.prg1.pdate;
/**
 * Implementacion de la clase Date para Programacion1
 * 
 * @author practicas
 *@version 0.1
 */
public class pdatePrincipal {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Date miFecha= new Date();
		Date miFecha2=new Date(1,11,2019);
		System.out.println(miFecha);
		System.out.println(miFecha2);
	
		
		
		System.out.println("Opcion 1");
		
		if(miFecha.isSameYear(miFecha2)) 
			System.out.println("Es el mismo AÑO");
		else 
				System.out.println("Es distinto AÑO");
		
		if(miFecha.isSameMonth(miFecha2)) 
			System.out.println("Es el mismo MES");
		else
				System.out.println("Es distinto MES");
		
		if(miFecha.isSameDay(miFecha2)) 
			System.out.println("Es el mismo DIA");
		else
				System.out.println("Es distinto DIA");
		
		
		
		System.out.println("Opcion sin IF");
		
		if(miFecha.isSameYearsinif(miFecha2)) 
			System.out.println(" Es el mismo AÑO");
		else 
				System.out.println("Es distinto AÑO");
		
		if(miFecha.isSameMonthsinif(miFecha2)) 
			System.out.println(" Es el mismo MES");
		else 
				System.out.println("Es distinto MES");
		
		if(miFecha.isSameDaysinif(miFecha2)) 
			System.out.println("Es el mismo DIA");
		else 
				System.out.println("Es distinto DIA");
	}
}