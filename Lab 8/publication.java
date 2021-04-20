	public class publication {
		protected String title;
		protected int price;
		
		public publication(String t, int p) {
			title=t;
			price=p;
		}
		
		public void setTitle(String n) {
			title=n;
		}
		
		public void setPrice(int pr) {
			price=pr;
		}
		
		public String getTitle() {
			return title;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void distplay() {
			System.out.println("Title: "+title+"\nPrice: "+price);
		}
	

	}
