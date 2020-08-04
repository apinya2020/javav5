package week5;

public class variable101 {
	String freinds4 = "Jenny";//instance variable out of method main
	static int count = 4;//static variable is Global variable
	final String song = "How you like that";//Final variable
	static String version ="V1.1";
	
	public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
		variable101 member = new variable101();
		String friends1 = "Lisa";//local variable
		System.out.println("Version : "+ version);
		System.out.println("Member of Blackping have : " + count);
		System.out.println("first member of Blackpink name is : " + friends1);
		System.out.println("===========");
		member.blackpink();
	}
	
	public void blackpink() {//sub method 
		String friends2="Jisoo";//Local variable 
		String freinds3="Rose";
		System.out.println("Secound member of Blackpink name is : "+ friends2);
		System.out.println("Third member of Blackpink name is : "+ freinds3);
		System.out.println("Third member of Blackpink name is : "+ freinds4);
		System.out.println("Pre Release name of song :  " + song );
	}
}
