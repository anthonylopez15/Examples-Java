package capitulo.um.ClassesUtilitarias.Wrapper;

public class TesteWrapperClasses {
	
	public static void main(String[] args){

	//exemplo de utiliza�ao da classe Boolean
	System.out.println("\nExemplo de utilização da classe Boolean:");
	Boolean b1 = new Boolean(true);
	Boolean b2 = new Boolean("true");
	System.out.println("bb1 = " + b1.booleanValue());
	System.out.println("bb2 = " + b2.booleanValue());
	
	//exemplo de utiliza��o da classe Integer
	System.out.println("\nExemplo de utilizacao da classe Integer");
	Integer i1 = new Integer(12);
	Integer i2 = new Integer("12");
	System.out.println("i1 = " + i1.intValue());
	System.out.println("i2 = " + i2.intValue());
	String binaryString = Integer.toBinaryString(23);
	System.out.println("23 (em numero binario) = " + binaryString);
	int i3 = Integer.parseInt("12456");
        System.out.println(i3);
	
	//exemplo de utilizacao da classe Double
	System.out.println("\nExemplo de utilizacao da classe Double");
	Double d1 = new Double(45.9);
	Double d2 = new Double(45.5);
	System.out.println("d1 = " + d1.doubleValue());
	System.out.println("d2 = " + d2.doubleValue());
	//UTILIZANDO O METODO intValue para transformar um double em int
	System.out.println("d1(int) = " + d1.intValue());
	
	//Exemplo de utilizac�o da classe Character
	System.out.println("\nExemplo de utilizacao da classe Character");
	Character c1 = new Character('1');
	System.out.println("c1 = " + c1.charValue());
	
	char c2 = '7';
	boolean isDigit = Character.isDigit(c2);
	System.out.println(c2 + " eh digito? " + isDigit);
	
	char c3 = 'p';
	boolean isLetterOrDigit = Character.isLetterOrDigit(c3);
	System.out.println(c3 + " eh digito ou letra? " + isLetterOrDigit);	
	}
}
