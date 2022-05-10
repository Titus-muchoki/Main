 class App {
    int MakeYear;
    String Brand;
    public App(int year, String myBrand) {
        MakeYear = year;
        Brand = myBrand;
    }
    public static void main(String[] args) {
        App myObj = new App(2020, "kajela.apk");
        System.out.println(myObj.Brand + myObj.MakeYear);
    }
}
