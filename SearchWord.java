package Day16;

public class SearchWord {
	
	static boolean WordPresent(String Sentence,String word)
	{
		String []a= Sentence.split(" ");
		
		for (String temp :a)
		{
			if(temp.compareTo(word) == 0)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) 
	{
		String a = "Hello everyone how are you ";
		String word = "hi";
		
		if(WordPresent(a,word))
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
