public abstract class Animal {
    public abstract boolean isLand();

    public void func(){
        if (isLand()) {
            System.out.println("陆生动物");
        } else {
            System.out.println("非陆生动物");
        }
    }
}
