public class A002 {


    public static void main (String [] args){

        BankAccount Day1 = new BankAccount(200,-100);
        BankAccount Day2 = new BankAccount (300,-40);

        BankAccount [] days = { Day1,Day2};


        for (int i=0; i< days.length; i++){
            days[i].printAllData();}

    }
}
