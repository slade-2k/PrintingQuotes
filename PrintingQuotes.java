import java.io.*;

public class PrintingQuotes {
	public static void main (String args[]) {
		PrintingQuotes mainObj = new PrintingQuotes();
		
		try {
			mainObj.getUserInput();
		} catch (IOException exception) {
			System.out.println("Oops!");
		}
	}
	
	private void getUserInput() throws IOException {
		InputStream inputStream = System.in; 
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(inputStream));
		
		System.out.print("What is the quote? ");
		String inputQuote = buffRead.readLine();
		System.out.print("Who said it? ");
		String inputAuthor = buffRead.readLine();
		System.out.println(concatenateString(inputQuote, inputAuthor));
	}
	
	public String concatenateString(String inputQuote, String inputAuthor) {
		String conOutput = inputAuthor + " says, \"" + inputQuote + "\"";
		return conOutput;
	}
}