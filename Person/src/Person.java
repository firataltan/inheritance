



 
public class Person {
   private String name;
   
   public Person(){
       name=null;
   }
   public Person(String name){
       this.name=name;
   }
   public Person(Person p){
       name=p.name;       
   }

   
    public String getName() {
        return "isim: " + name;
    }

   
    public void setName(String name) {
        this.name = name;
    }
   @Override
    public String toString(){
        return    "Ad Soyad : " + name;
    }
   @Override
    public boolean equals(Object otherObject){
        if (otherObject==null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else{
            Person otherPerson =(Person)otherObject;
            return (name.equals(otherPerson.name));
        }
    }

    

    
    
}
