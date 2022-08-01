class Data {
    private String name;
    
    public void setName(String name) {
        this.name= name;
    }

    // getter method
    public String getName() {
        return this.name;
    }
 

}
public class accessSpecifiers2 {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("I am using private access modifier");
        System.out.println(d.getName());
    }
}