package Learning;

public class soal_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NO. 1
		System.out.println("NO. 1");
		System.out.println("Welcome to Java, Welcome to Comptuer Science, Programming is fun\n");
		System.out.println();
		
//		No. 2
		System.out.println("NO. 2");
		for (int i = 0; i<5; i++) {
			System.out.println("Welcome to Java");
		}
		System.out.println();

//		No. 3
		System.out.println("NO. 3");
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
		System.out.println("NO. 4");
		String space = " ";
		System.out.println("a" + space + space + "a^2" + space + space + "a^3");
		
		for(int i=1; i<5; i++) {
			System.out.println(i + space + space + space + i*i + space + space + space + space + i*i*i);
		}
		System.out.println();
		
//		No. 5
		System.out.println("NO. 5");
		System.out.println();
		System.out.println(((9.5 * 4.5) - (2.5*3.0))/(45.5-3.5));
		System.out.println();
		
//		No. 6
		System.out.println("NO. 6");
		int sum = 0;
		for(int i=1; i<=9;i++) {
			sum = sum + i;
		}
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + sum);
		System.out.println();
		
//		No. 7
		System.out.println("NO. 7");
		System.out.println("Phi pertama = " + 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0));
		System.out.println("Phi kedua = " + 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0));
		System.out.println();
		
//		No. 8
		System.out.println("NO. 8");
		System.out.println("The perimeter is "+ 2*5.5*(22.0/7));
		System.out.println("The area is "+ 5.5*5.5*(22.0/7));
		System.out.println();
		
//		No. 9
		System.out.println("NO. 9");
		System.out.println("Area of a rectangle is " + 4.5 * 7.9);
		System.out.println("The perimeter of a rectangle is " +2*4.5*7.9);
		System.out.println();
		
//		No. 10
		System.out.println("NO. 10");
		double kecepatan = 14;
		double waktu = 45.5;
		
		double mile = 14.0/1.6;
		double hour = 45.5/60;
		
		System.out.println("Average speed in miles per hour "+ mile/hour);
		System.out.println();
		
//		No. 11
		System.out.println("NO. 11");
//      (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
//      One birth every 7 seconds
//      One death every 13 seconds
//      One new immigrant every 45 seconds
//     Write a program to display the population for each of the next five years. Assume the current population 
//     is 312032486 and one year has 365 days. Hint: in Python, you can use integer division operator 
//     to perform division. The result is an integer.
       int SecondsInYear = 365 * 24 *60 * 60;

//     After 1 year, number of births (7 seconds = 1 birth)
       int birthsPerYear = SecondsInYear / 7;
       System.out.println("Births Per Year = " + birthsPerYear);

//     After 1 year, number of deaths (13 seconds = 1 death )
       int deathsPerYear = SecondsInYear / 13;
       System.out.println("Deaths Per Year = " + deathsPerYear);

//     After 1 year, number of immigrants (45 seconds = 1 immigrant )
       int immigrantsPerYear = SecondsInYear / 45;
       System.out.println("Immigrants Per Year = " + immigrantsPerYear);

//     Rate per year
       int ratePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
       System.out.println("Rate Per Year = " + ratePerYear);
       System.out.println();
       
       int currentpopulation = 312032486;
       System.out.println("population after first year end = " + (currentpopulation+1*ratePerYear));
       System.out.println("population after second year end = " + (currentpopulation+2*ratePerYear));
       System.out.println("population after third year end = " + (currentpopulation+3*ratePerYear));
       System.out.println("population after fourth year end = " + (currentpopulation+4*ratePerYear));
       System.out.println("population after five year end = " + (currentpopulation+5*ratePerYear));
       System.out.println();
		
		
		
		
//		double population = 312032486;
//		double time = 365*24*60*60;
//		double birth = time/7;
//		double death = time/13;
//		double immigrant = time/45;
//		for(int i = 1;i<=5;i++) {
//			population = population + birth - death - immigrant;
//			System.out.println("Population on the " + i + " year is: " + population);
//		}
//		System.out.println();
	}

}
