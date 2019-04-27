package builder;

/**
 * 建造者模式
 * 导演者角色：将客户端创建产品的请求划分为对各个零件的建造请求，再将这些请求委派给具体建造者角色。
 */
public class Director {
    PackageBuilder packageBuilder;
    public Director(PackageBuilder packageBuilder){
        this.packageBuilder = packageBuilder;
    }
    public Package getPackage(){
        packageBuilder.addDrink();
        packageBuilder.addHamburger();
        return packageBuilder.getResult();
    }
}
