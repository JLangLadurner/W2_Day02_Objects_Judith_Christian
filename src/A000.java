public class A000 {


    public static void main (String[] args){

       Names Person = new Names ("Christian ", "Simic");
       Names Person1 = new Names ("Judith ", "Lang");

       Names [] newArray = {
               Person,
               Person1
       };

       for (int i=0; i< newArray.length; i++){

           newArray [i].printAllData();
       }
    }


}
