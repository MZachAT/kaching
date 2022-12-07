
public class Main {

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		
		String ka = "ka";
		String ching = "ching!";
		String kaching = "ka-ching!";
		
		for (int i = 1; i <= 30; i++) {
			if ((i%3 == 0) && (i%5 == 0)) {
				 System.out.println(kaching);
			
			}else if (i%3 == 0){
				System.out.println(ka);
			}else if (i%5 == 0) {
				System.out.println(ching);
			}else {
				System.out.println(i);
			}
		}
	}

}
