
public class getNum {

	public static int getchoice() {
		try {
		
		byte [] choiceInput=new byte[100];
		
		int length= System.in.read(choiceInput);
		
		byte [] newChoice_input=new byte[length-2];
		
		System.arraycopy(choiceInput, 0, newChoice_input, 0, length-2);
		
		String s=new String(newChoice_input);
		
		return  Integer.parseInt(s);
		} catch(Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	public static int getIntNum() {
		try {
		
		byte [] choiceInput=new byte[100];
		
		int length= System.in.read(choiceInput);
		
		byte [] newChoice_input=new byte[length-2];
		
		System.arraycopy(choiceInput, 0, newChoice_input, 0, length-2);
		
		String s=new String(newChoice_input);
		
		return  Integer.parseInt(s);
		} catch(Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	public static float getFloatNum() {
		try {
		
		byte [] choiceInput=new byte[100];
		
		int length= System.in.read(choiceInput);
		
		byte [] newChoice_input=new byte[length-2];
		
		System.arraycopy(choiceInput, 0, newChoice_input, 0, length-2);
		
		String s=new String(newChoice_input);
		
		return  Float.parseFloat(s);
		} catch(Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
	public static double getDoubleNum() {
		try {
		
		byte [] choiceInput=new byte[100];
		
		int length= System.in.read(choiceInput);
		
		byte [] newChoice_input=new byte[length-2];
		
		System.arraycopy(choiceInput, 0, newChoice_input, 0, length-2);
		
		String s=new String(newChoice_input);
		
		return  Double.parseDouble(s);
		} catch(Exception e) {
			System.out.println(e);
		}
		return -1;
	}
	
}
