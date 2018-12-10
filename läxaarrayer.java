package javauppgifter;

public class läxaarrayer {

	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
	
		System.out.println(nummer(numbers));
		System.out.println(namn(names));
		System.out.println(abc(numbers));
		System.out.println(kapow(names));
		System.out.println(ytlimeb(numbers));
		System.out.println(ttvlimeb01(names));
		System.out.println(limebpro(names));
		System.out.println(Följmigpåtwitchochyoutube(numbers));
		System.out.println(clashofclans(names));
		System.out.println(kommerintepåflerdåliganamnhahaha(names));
	}
	//numbero1
	public static int nummer(int[]numbers) {
		
		int antal = 0;
		
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] == 7) {
				antal++;
			}
				
		}
		return antal;
	}
	//numbero2
	public static int namn(String[]names){
		
		int antal = 0;
		
		for (int i = names.length - 1; i >= 0; i--) {
			if (names[i] == "Tom") {
				antal++;
			}
		}
		return antal;
}
	//numbero3
	public static String abc(int[]numbers) {
		
		int antal = 0;
		
		int x=0;
		
		int y=100;
		
		int z=0;
		
		int a=0;
		
		int [] number = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < number.length; i++) {
			
			for (int j = 0; j < numbers.length; j++) {
			
				if(numbers[j] == number[i]) {
				
					antal++;	
				}
			}
			if(antal>x) {
				
				x=antal;
				z=number[i];
			}
			if(antal<y) {
				
				y=antal;
				a=number[i];
			
			}
			antal=0;
			}
		return "flest: "+z+" minst: "+a;
		
		
		}
	//numbero4
	public static int kapow(String[]names){              
        
		int out = 0;
        
		for (int i = 0; i < names.length; i++) {
         
			if (names[i].equals("Drusilla")){
               
				out = i;
            }
        }
        return out;
    }
	//numbero5
	  public static int ytlimeb(int [] numbers){
	        
		  int sum = 0;

	        for(int i=0; i<numbers.length; i++){
	           
	            if(numbers[i]%2 == 0){
	                
	                sum += numbers[i];
	            }
	        }

	        return sum;
	    }
	//numbero6
	  public static int ttvlimeb01(String [] names) {
			
		  int antal=0;
			
		  for (int i = 0; i < names.length; i++) {
				
			  if(names[i].charAt(0) =='L') {
					
				  antal++;
				}
				
			}
			return antal;
		}
	//numbero7
	  public static int limebpro(String[]names){
	      
		  int sum = 0;
	       
		  for(int i=0;i<names.length;i++){
	          
			  if(names[i].length() == 5){
	              
				  sum++;
	            }
	        }

	        return sum;
}
	//numbero8
	  public static String Följmigpåtwitchochyoutube(int[]numbers){   
	       
		  String out = "";
	        
		  int[] cba = new int[10];

	        for (int i = 0; i < cba.length; i++) {
	            
	        	for (int j = 0; j < numbers.length; j++) {
	              
	        		if (numbers[j] == i){
	                  
	        			cba[i]++;
	                }
	            }
	            out = out + "Tal " + cba[i] +", ";
	        }
	        return out;
	    }
	//numbero9
	  public static int clashofclans(String[] names) {
			
		  int antal=0;
			
		  int j;
			
		  for (int i = 0; i < names.length; i++) {
				
				for ( j = 0; j < names.length; j++) {
					
					
					if(names[i].equals(names[j])) {
						
						break;
					}
					
				}
				if(i==j) {
					
					antal++;
				}
			}
			return antal;
		}
	//numbero10
	  public static String kommerintepåflerdåliganamnhahaha(String[]names) {
			
		  String z="";
			
		  int antal=0;
			
		  int x=0;
			
		  for (int i = 0; i < names.length; i++) {
				
				for (int j = 0; j < names.length; j++) {
					
					if(names[i]==names[j]) {
						
						antal++;
					}
					
					if(antal>x) {
						x=antal;
						z=names[i];
					}
						}
				antal=0;
			}
			return z;
			
		}
}
