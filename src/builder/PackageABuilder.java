package builder;

/**
 * 具体建造者角色
 */
public class PackageABuilder implements PackageBuilder {
    Package aPackage = new Package();
    @Override
    public void addDrink() {
        aPackage.add("hotDrink");
    }

    @Override
    public void addHamburger() {
        aPackage.add("bigHamburger");
    }

    @Override
    public Package getResult() {
        return aPackage;
    }
}
