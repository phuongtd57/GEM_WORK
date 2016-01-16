package model;
// Generated Jan 16, 2016 4:33:02 PM by Hibernate Tools 4.3.1



/**
 * UnitDealerId generated by hbm2java
 */
public class UnitDealerId  implements java.io.Serializable {


     private int unitId;
     private int dealerId;

    public UnitDealerId() {
    }

    public UnitDealerId(int unitId, int dealerId) {
       this.unitId = unitId;
       this.dealerId = dealerId;
    }
   
    public int getUnitId() {
        return this.unitId;
    }
    
    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
    public int getDealerId() {
        return this.dealerId;
    }
    
    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UnitDealerId) ) return false;
		 UnitDealerId castOther = ( UnitDealerId ) other; 
         
		 return (this.getUnitId()==castOther.getUnitId())
 && (this.getDealerId()==castOther.getDealerId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUnitId();
         result = 37 * result + this.getDealerId();
         return result;
   }   


}


