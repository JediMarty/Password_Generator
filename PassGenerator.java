import java.util.Scanner;
import java.util.Random;

public class PassGenerator {

	public static void main(String[] args) {
		String array[] = {"1","2","3","4","5","6","7","8","9","0",
				"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
				"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How long you want the password to be ?");
		
		int len = scan.nextInt();
		
		System.out.println("Your password: "+pass(array,len));
	
	}
public static String pass(String[] arr,int len){
    
    Random rand = new Random(); 
		int random;
		String pass = "";
		
		for (int i = 0; i<len; i++) {
			random = rand.nextInt(arr.length); 
			pass+=arr[random];
			}
			
			return pass;
}

}
