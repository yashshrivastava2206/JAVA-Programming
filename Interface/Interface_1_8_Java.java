interface Rectangle{
    void getDetail();
    default  int getArea(int length, int breath){

        showInput(length,breath);
        return length*breath;
    }
     static void showInput(int n,int m){
         System.out.println("Length:"+n);
         System.out.println("Breath:"+m);
    }

}
public class Interface_1_8_Java {
    public static void main(String[] args) {
    Rectangle r= new Rectangle(){
                @Override
                public void getDetail(){
                    System.out.println("Hello, I'm Rectangle");
            }
        };
        r.getDetail();
        System.out.println("Area of Rectangle:"+r.getArea(10,20));
    }
}
