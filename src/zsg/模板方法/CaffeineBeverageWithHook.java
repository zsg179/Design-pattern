package zsg.模板方法;

/**基类
 * @author zhusg02
 * @date 2021/7/2 17:07
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //钩子方法
    boolean customerWantsCondiments() {
        return true;
    }


}
