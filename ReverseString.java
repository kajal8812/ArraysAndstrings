package ArrayAndString;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome";
String t=" ";
    for(int i=s.length()-1;i>=0;i--) {
    	t=t+s.charAt(i);
    }
    System.out.println(t);
	}

}
