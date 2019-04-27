package builder;

public class PackageBBuilder implements PackageBuilder {
    Package bPackage = new Package();
    @Override
    public void addDrink() {
        bPackage.add("coldDrink");
    }

    @Override
    public void addHamburger() {
        bPackage.add("smallHamburger");
    }

    @Override
    public Package getResult() {
        return bPackage;
    }
}
