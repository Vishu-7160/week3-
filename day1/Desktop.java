package week3.day1;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("Desktop class method");
	}
		
	public static void main(String[] args) 
	{
		
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
		
	}
}