package day9;

public class NestedIfElse {
	public static void main(String[] args) {// laptop pasal ma gayo ani next condition lenovo ko laptop xa ki caina
											// ani next condition maike khojeko configuration xa ki xaina
											// ani next condition mero price range ma xa ki xaina \
											// yo vaneko condition vitra condition aaune
		int a = 3;
		int b = 4;
		int c = 2;
		
		if (a>b) {
			if (a>c) {
				System.out.println("a is largest one");
				
			}else {
				System.out.println("c is largest");
			}
		}else {
				System.out.println("b is greater than a but c may be smaller or greater than b");
				
			}
		}
	}

