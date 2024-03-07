public class App {
    public static void main(String[] args) throws Exception {
        Circle Bulat = new Circle("Bulat", 5.0);
        Bulat.getInfo();

        Rectangle Persegi = new Rectangle("Persegi", 4.0, 8.0);
        Persegi.getInfo();

        RightTriangle SegitigaSikuSiku = new RightTriangle("SegitigaSikuSiku", 6.0, 7.0);
        SegitigaSikuSiku.getInfo();

        EquilateralTriangle segitigaSamaSisi = new EquilateralTriangle("SegitigaSamaSisi", 4.0);
        segitigaSamaSisi.getInfo();

        IsoscelesTriangle segitigaSamaKaki = new IsoscelesTriangle("SegitigaSamaKaki", 4.0, 6.0);
        segitigaSamaKaki.getInfo();

        AnyTriangle segitigaSembarang = new AnyTriangle("SegitigaSembarang", 4.0, 4.0, 4.0);
        segitigaSembarang.getInfo();
    }
}
    


