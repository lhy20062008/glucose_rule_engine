package cloudoc.glucose;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Target implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "fpg lower")
   private java.lang.Float fpg_lower;
   @org.kie.api.definition.type.Label(value = "fpg upper")
   private java.lang.Float fpg_upper;
   @org.kie.api.definition.type.Label(value = "two hpg lower")
   private java.lang.Float two_hpg_lower;
   @org.kie.api.definition.type.Label(value = "two hpg upper")
   private java.lang.Float two_hpg_upper;
   @org.kie.api.definition.type.Label(value = "hba1c")
   private java.lang.Float hba1c;

   public Target()
   {
   }

   public java.lang.Float getFpg_lower()
   {
      return this.fpg_lower;
   }

   public void setFpg_lower(java.lang.Float fpg_lower)
   {
      this.fpg_lower = fpg_lower;
   }

   public java.lang.Float getFpg_upper()
   {
      return this.fpg_upper;
   }

   public void setFpg_upper(java.lang.Float fpg_upper)
   {
      this.fpg_upper = fpg_upper;
   }

   public java.lang.Float getTwo_hpg_lower()
   {
      return this.two_hpg_lower;
   }

   public void setTwo_hpg_lower(java.lang.Float two_hpg_lower)
   {
      this.two_hpg_lower = two_hpg_lower;
   }

   public java.lang.Float getTwo_hpg_upper()
   {
      return this.two_hpg_upper;
   }

   public void setTwo_hpg_upper(java.lang.Float two_hpg_upper)
   {
      this.two_hpg_upper = two_hpg_upper;
   }

   public java.lang.Float getHba1c()
   {
      return this.hba1c;
   }

   public void setHba1c(java.lang.Float hba1c)
   {
      this.hba1c = hba1c;
   }

   public Target(java.lang.Float fpg_lower, java.lang.Float fpg_upper,
         java.lang.Float two_hpg_lower, java.lang.Float two_hpg_upper,
         java.lang.Float hba1c)
   {
      this.fpg_lower = fpg_lower;
      this.fpg_upper = fpg_upper;
      this.two_hpg_lower = two_hpg_lower;
      this.two_hpg_upper = two_hpg_upper;
      this.hba1c = hba1c;
   }

}