package ex_17;

public class BigDog extends Dog {

    @Override
    public void greeting() {
        System.out.println("Wooow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Wooooooooooow!");
    }


}
