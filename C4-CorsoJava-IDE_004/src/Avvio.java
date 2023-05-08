public class Avvio{


    public static void main (String[] s){
        double d  = Test.runTest();

        if(s.length>0 && s[0].equalsIgnoreCase("verbose"))
            showVerbose(d);
        else 
            showSilent(d);


    }

    public static void showSilent(double d){
        System.out.println(d);
    }

    public static void showVerbose(double d){
        System.out.println("********* AVVIO ESECUZIONE DEL TEST ******************");
        System.out.println();
        System.out.print("Esito del test: ");
        System.out.println(d);
        System.out.println();
        System.out.println("******* TERMINE ESECUZIONE DEL TEST ******************");
    }

}