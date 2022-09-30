
class FlipCoin {
	public static void main(String[] args) {
		int random=(int)(Math.random()*2)%2;
		System.out.println(random);
		  if(random<0.5) {
			System.out.println("tail");
		}
		   else {
			System.out.println("Head");
		}
	
	}
	

}
