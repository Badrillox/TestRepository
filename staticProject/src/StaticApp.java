public class MyMath {

    public static void main(String[] args) {
        //verwenden der statischen Konstante MyPI
        System.out.printf("MyPI = %.2f\n", MyWatch.MyPI);
        //verwenden der nicht statischen Konstante MyPI_NonStatic
        MyWatch myM = new MyWatch();
        System.out.printf("MyPI_NonStatic = %.2f\n", myM.MyPI_NonStatic);
        System.out.println(myM.NonStatic());

        // die nichtstatische Methode muss über die Instanzvariable myM aufgerufen werden
    }
}
