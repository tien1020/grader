public class Grade
{
   public double math;
   public double physic;
   
   public void displayGrade()
   {
      System.out.println("Math: " + math);
      System.out.println("Physic: " + physic);
   }
   
   public void getAverage()
   {
      System.out.println("Average: " + (math+physic)/2);
      System.out.println();
   }
}