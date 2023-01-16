public class Hello {
    public static void main(String[] args) {
        System.out.println("hello soubahgya");
      boolean isMad = true;
      if(isMad == false )
          System.out.println("not mad");

         double myFirstValue = 20.00d;
        double mySirstValue = 80.00d;
        double myValueTotal = (myFirstValue + mySirstValue) * 100.00d;
           System.out.println("myValueTotal =" + myValueTotal);
           double theRemainder = myValueTotal % 40.00d;
           System.out.println("theRemainder =" + theRemainder);
           boolean isNoRemainder = (theRemainder == 0)? true:false;
           System.out.println("isNoRemainder =" + isNoRemainder);
           if(!isNoRemainder){
               System.out.println("got someremainder");
           }
    }
}
