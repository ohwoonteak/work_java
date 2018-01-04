package practice;

public class no9 {

		private double width;
		private double height;
		
		public no9(double width,double height) {
			this.width = width;
			this.height = height;
			
		}
		
		public double getArea() {
			return (this.width *this.height)*2;
		}
		public static void main(String[] args) {
			no9 rc = new no9(3.82,8.65);
			System.out.println("면적: " + rc.getArea());
			
		}
}
