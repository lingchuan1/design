package builder;
public class Main {
    public static void main(String[] args) {

        //想要吃套餐A
        Director director = new Director(new PackageABuilder());
        Package packageA = director.getPackage();
        packageA.show();

        System.out.println("----------------");

        //想要吃套餐B
        director = new Director(new PackageBBuilder());
        Package packageB = director.getPackage();
        packageB.show();
    }
}
