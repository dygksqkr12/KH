package pizza;
/**
 * - Pizza 클래스: 다음 세 개의 필드를 지님
 * 브랜드(문자열)
 * 지름(실수형)
 * 가격(정수형)
 */
public class Pizza {

		private String brands;
		private int diameter;
		private double integer;
		
		public Pizza() {
			super();
		}
		public Pizza(String brands, int diameter, double integer) {
			super();
			this.brands = brands;
			this.diameter = diameter;
			this.integer = integer;
		}
		public String getBrands() {
			return brands;
		}
		public void setBrands(String brands) {
			this.brands = brands;
		}
		public int getDiameter() {
			return diameter;
		}
		public void setDiameter(int diameter) {
			this.diameter = diameter;
		}
		public double getInteger() {
			return integer;
		}
		public void setInteger(double integer) {
			this.integer = integer;
		}
		
		@Override
		public String toString() {
			return getBrands() + " " + getDiameter() + " " + getInteger();
		}
	

}
