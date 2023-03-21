

//Constructor
class myEmployee{
    private String name;
    private int Id;

    //Constructor name is Same as class name
    public myEmployee(){
        name="No Name";
        Id=0;
    }
    public void setName(String Name){
        name=Name;
    }

    public void setId(int id) {
        Id=id;
    }

    public String getName() {
        return name;
    }

    public long  getId() {
        return Id;
    }
}
public class Construct {
    public static void main(String[] args) {
        myEmployee yash = new myEmployee();
        System.out.println("Name :"+yash.getName()+"\nId :"+yash.getId());
        yash.setName("My Name Is Yash Shrivastava");
        yash.setId(187);
        System.out.println("Name :"+yash.getName()+"\nId :"+yash.getId());
    }
}
