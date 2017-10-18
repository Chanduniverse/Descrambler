import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Descrambler {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		String scrambled = sc.next();
		char[] array = scrambled.toCharArray();
		Arrays.sort(array);
		sc.close();
		Scanner s = new Scanner(new File("C:/Users/Chand/workspace/Projects/src/dictionary_1.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		for(int i = 0; i < 58110; i++) {
			if(scrambled.length() == list.get(i).length()) {
				char[] word = (list.get(i)).toCharArray();
				Arrays.sort(word);
				if(Arrays.equals(array, word)) {
					System.out.println(list.get(i));
					}
				}
			}
	}
}




