package es.unileo.prg1.pdate;
/**
 * Implementacion de la clase Date para Programacion1
 * 
 * @author practicas
 *@version 0.1
 */
public class Date {
	
		private int day;
		private int month;
		private int year;
		
		Date() {
			this.day=1;
			this.month=1;
			this.year=2020;
		}
		
		public Date(int day, int month, int year) {
				this.day= day;
				this.month= month;
				this.year= year;
		}
		
		
		
		public boolean isSameYear(Date miFecha) {
			boolean retorno=false;
			if(this.year ==  miFecha.year)
				retorno=true;
			return retorno;
		}
		
		public boolean isSameYearsinif(Date miFecha) {
			return (this.year ==  miFecha.year);
		}
		
		
		
		public boolean isSameMonth(Date miFecha) {
			boolean retorno2=false;
			if(this.month ==  miFecha.month)
				retorno2=true;
			return retorno2;
		}
		
		public boolean isSameMonthsinif(Date miFecha) {
			return (this.month ==  miFecha.month);
		}
		
		
		
		public boolean isSameDay(Date miFecha) {
			boolean retorno3=false;
			if(this.day ==  miFecha.day)
				retorno3=true;
			return retorno3;
		}
		
		public boolean isSameDaysinif(Date miFecha) {
			return (this.day ==  miFecha.day);
		}
		
		
		
		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
		
}
