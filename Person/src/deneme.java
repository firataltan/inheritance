
public class deneme {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1;
        Truck t1;
        p1= new Person(" Dara  Altan ");
        t1= new Truck(" Volvo " , 12 , p1 , 15.7);
        Truck copy =new Truck(t1);
        
        
      System.out.println("Tır bilgileri: "+ "\n" + t1.toString());      
                 
      System.out.println("İKİ DEĞER BİRBİRİNE EŞİT Mİ: " +t1.equals(copy));                              
          
    }
}
