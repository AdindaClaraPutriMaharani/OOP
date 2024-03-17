public class App {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle ("ABC", 3.0, 4.0);
        ABC.specificMethod();

        //The Type is Triangle, but behavior is RightTriangle
        Triangle BCD = new RightTriangle ("BCD", 3.0, 4.0);
        // cannot call BCD.specificMethod(); because specificMethod() inside RightTriangle
        BCD.hallo();
        // output: Hallo I'm RightTriangle, because for every method override by subclass, the subclass method will be called
        Triangle CDE = new Triangle ("CDE", 3.0, 4.0, 5.0);
        
        CDE.hallo();
        // output: Hallo I'm Triangle
    }
}