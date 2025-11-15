//Q3. Write a java program to print all alphabets from a to z. - using while loop

public class Function3{
	public static void main(String args[]){
		printAlfha();
	}
	
	public static void printAlfha(){
		char ch = 'a';
		while(ch!='z'){
			System.out.print(ch+"\t");
			ch++;
		}
	}
}