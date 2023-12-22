public class Ball {
    private String name;
    private int radius;
    public Ball(String n, int a){
        name = n;
        radius = a;
    }
    public Ball(String n){
        name = n;
        radius = 0;
    }
    public Ball(){
        name = "le ball";
        radius = 0;
    }
    public void setAge(int age) {
        this.radius = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return radius;
    }
    public String toString(){
        return "This ball is called: " + this.name+", radius "+this.radius;
    }
 /*   public void intoHumanAge(){
        System.out.println("This ball is called: " + name + ", It has a radius of: " + radius);
    }*/
}
