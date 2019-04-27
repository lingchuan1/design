package builder;

/**
 * 抽象建造者角色
 * 有套餐A和套餐B两个产品，分别对应两个具体建造者PackageABuilder和PackageBBuilder
 */
public interface PackageBuilder {
    void addDrink();
    void addHamburger();
    Package getResult();
}
