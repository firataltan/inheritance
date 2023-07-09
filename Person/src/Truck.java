
public class Truck extends Vehicle {
    private double kapasite;
    
   public Truck(){
       kapasite=0;
   }
   public Truck(String m, int s, Person p,double kapasite){
       super(m,s,p);
       this.kapasite=kapasite;
   }
   public Truck(Truck t){
       super(t.getMarka(),t.getSilindir(),t.getOwner());
       kapasite=t.kapasite;
       
   }

    
    public double getKapasite() {
        return kapasite;
    }

    
    public void setKapasite(double kapasite) {
        this.kapasite = kapasite;
    }
    
    @Override
    public String toString(){
        String result= super.toString();
        result+="Yük kapasitesi : " + kapasite  ;
        return result  ;
    }
       
        
    
    
    @Override
    
    public boolean equals(Object otherObject){
       
        super.equals(otherObject);
        if (otherObject==null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else{
            Truck otherTruck =(Truck)otherObject;
            return kapasite==otherTruck.kapasite && super.equals(otherObject);
        }
    }

    
                      
}
