package Assignment;

public class StringArray {
 
  /*  public static void main(String[] args) {      
          
        //Initialize array   
        String [] array = new String[] {"my name is dev"};   
          
        System.out.println("Duplicate elements in given String array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i].equals(array[j]))  
                    System.out.println(array[j]);  
            }  
        }  
    }
}*/
	public static void main(String args[]) {
        String[] Array = { "arnab", "rohit", "dev", "abhijit", "arnab",
                "dev" };
        for (int i = 0; i <Array.length; i++) {
            String newString = Array[i];
            for (int j = i + 1; j < Array.length; j++) {
                if (newString.equals(Array[j])) {
                    System.out.println("Duplicate Name : " + newString);
                }
            }
        }
    }
}