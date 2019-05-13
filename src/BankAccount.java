public class BankAccount {

   int Einzahlung;
   int Auszahlung;

   public BankAccount(int Einzahlung, int Auszahlung){
       this.Einzahlung = Einzahlung;
       this.Auszahlung = Auszahlung;
   }
    public void printAllData(){

       System.out.println(this.Einzahlung+this.Auszahlung);
    }

}



//It has an account balance and methods to add and withdraw money, as well as to print account balance.
//Create the class and its constructor.