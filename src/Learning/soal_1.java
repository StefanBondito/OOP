package Learning;

public class soal_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NO. 1
		System.out.println("Welcome to Java, Welcome to Comptuer Science, Programming is fun\n");
		
//		No. 2
		for (int i = 0; i<5; i++) {
			System.out.println("Welcome to Java");
		}

//		No. 3
		for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<33;j++) {
				// HURUF J
				if(i<3 && j==3 || i==2 && j==0 || i== 3 && (j>0 && j<3)) {
					System.out.print("J");
				}
				// HURUF A
				else if((i==0 && (j==8 || j==24)) || (i==1 && (j==7 || j==9 || j==23 || j==25)) || (i==2 && ((j>=6 && j<=10) || (j>=22 && j<=26))) || (i==3 && (j==5 || j==11 || j==21 || j==27))){
                    System.out.print("A");
				}
				
				// HURUF V
				else if(i==0 && (j==13 || j==19) || (i==1 && (j==14 || j==18)) || (i==2 && (j==15 || j==17) || (i==3 && j==16))){
					System.out.print("V");
				}
				else {
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
		
		System.out.println();
//		No. 4
		String space = " ";
		System.out.println("a" + space + space + "a^2" + space + space + "a^3");
		
		
		
		
		
	}

}
