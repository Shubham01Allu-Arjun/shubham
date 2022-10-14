
public class CountVowels {

	public static int countVowels(String input) throws Exception
	{
	    char[] inputArray = input.toCharArray();
	    int vowelCount = 0;
	    for(char c : inputArray) {
	        switch(c) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                vowelCount++;
	                break;
	            case 'x':
	                throw new Exception();
	        }
	    }
	    return vowelCount;
	}
	}
	