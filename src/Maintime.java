public class Maintime {

    public static void main (String [] args){

        time rightnow = new time (14,46,11);
        time after30seconds = new time (1,46,46);

        time [] time1 = {rightnow, after30seconds};

        for (int i=0; i< time1.length;i++){
        time1[i].AllprintData();

        }
    }


}
