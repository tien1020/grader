public class TestGrade
{
   public static void main(String[] args)
   {
      Grade gdObj1 = new Grade();
      
      gdObj1.math = 8.5;
      gdObj1.physic = 9.75;
      
      gdObj1.displayGrade();
      gdObj1.getAverage();
      
      Grade gdObj2 = new Grade();
      gdObj2.math = 7;
      gdObj2.physic = 8.25;
      
      gdObj2.displayGrade();
      gdObj2.getAverage();
      
      Grade gdObj3 = new Grade();
      gdObj3.math = 5.5;
      gdObj3.physic = 5.5;
      
      gdObj3.displayGrade();
      gdObj3.getAverage();
      
   }
   
}