public class Fool extends Character implements Human{
    public Fool(String name,int h){
        this.name = name;
        this.hp = h;
    }
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わず遊んでいる");
    }
    public void talk(){
        System.out.println(this.name + "は意味のないことを話した");
    }
    public void watch(){
        System.out.println(this.name + "は虚空を見つめている");
    }
    public void hear(){
        System.out.println(this.name + "誰かの声を聞いた気がした");
    }
    public void run() {
        System.out.println(this.name + "は大笑いしながら逃げ出した");
    }
}
