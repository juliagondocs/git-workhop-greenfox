public class future {
	public static void printHoroscopes (String yourSign){
		System.out.println("Eszti: skorpio, Evelin: Ikrek", "Klari: taurus");
		System.out.println(yourSign);
		System.out.println("Your future is: " + yourSign);
		}

	public static void twoparam (String param1, String param2) {
		System.out.println(param1, param2);
		}
    public static void main(String[] args) {
	printHoroscopes();
	twoparam("P1", "P2");

    }
}
