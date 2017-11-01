public class BitDemo {
    public static void main(String[] args) {

	int a = 17;
	int b = 23;
	System.out.println("a: " + a);
	System.out.println("b: " + b);

	// Multiplizieren mit 2
	System.out.println("a*2: " + (a << 1));

	// Dividieren durch 2
	System.out.println("a / 2: " + (a >> 1));

	// Test ob Zahl ungerade
	if ((a & 1) == 1) System.out.println("a Ungerade!");
	
	// Zwei Zahlen tauschen mit Bits
	a ^= b;
	b ^= a;
	a ^= b;
	System.out.println("a: " + a);
	System.out.println("b: " + b);
    }
}
