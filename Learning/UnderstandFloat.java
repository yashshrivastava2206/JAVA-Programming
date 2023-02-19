/* What Will be the result of the following Expression float a= 7/4*9/2  */
public class UnderstandFloat {
    public static void main(String[] args) {
        float a = 7/4*9/2;             //Calculate on Int data// '/' and '*' has same precedency
        System.out.println("Result1 : "+a);         // so the associativity is left to right
                                                    //Result : 4.0
        /* Other ways to solve the above expression  */
        //Way 1:
        float b = 7/4f*9/2f;                        // Converting the values into float
                                                    //Result : 7.875
        System.out.println("Result2 : "+b);
        //Way 2:
        float c = (7/4.0f)*(9/2.0f);                //Seprate the expression by parenthesis
        System.out.println("Result3 : "+c);
                                                    //Result : 7.875
        //Way 3:
        float d =(float) ((7f/4)*(9f/2));           // TypeCasting double to float
        System.out.println("Result4 : "+d);
                                                    //Result : 7.875

    }
}
