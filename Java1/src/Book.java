public class Book {
    private String name;

    private String author;
    private int age;
    public Book(String n, String author, int a){
        this.author = author;
        name = n;
        age = a;
    }
    public Book(String n){
        name = n;
        age = 0;
    }
    public Book(){
        name = "BookyBookBookZeSecond";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return  "This book is called " + this.name + ", it was written in "+this.age + ", it's author is " + this.author;
    }
}
