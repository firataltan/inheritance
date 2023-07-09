


public abstract class Vehicle {
   private String marka;
   private int silindir;
   private Person owner;
   
   public Vehicle(){
       marka=null;
       silindir=0;
       owner=null;              
   }
   public Vehicle(String m, int s, Person p){
       marka = new String(m);
       setSilindir(s);
       owner= new Person(p);                               
   }
   
   public Vehicle(Vehicle v){
       marka =new String(v.getMarka());
       setSilindir(v.silindir);
       owner=new Person(v.getOwner());
   }

   
    public String getMarka() {
        return marka;
    }

    
    public void setMarka(String marka) {
        this.marka = marka;
    }

    
    public int getSilindir() {
        return silindir;
    }

    
    public void setSilindir(int silindir) {
        if (silindir>0)
            this.silindir=silindir;
        else{
            System.out.println("hata negatif değer");
            System.exit(0);}
    }

    
     
    public Person getOwner() {
        return new Person(owner);
    }

    
    public void setOwner(Person owner) {
        this.owner = new Person(owner);
    }
    
   @Override
    public String toString(){
        return "Marka: " +   marka + "\n" + "Motor Silindir : " + silindir + "\n"   + owner +"\n";
    }
    
   @Override
    public boolean equals(Object otherObject){
        
        if (otherObject==null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else{
            Vehicle otherVehicle =(Vehicle)otherObject;
            return (marka.equals(otherVehicle.marka)                  
                    && owner.equals(otherVehicle.owner)
                     && (silindir ==otherVehicle.silindir));
        }
    }

    
    
}
