public class Encription {
  
    public String encrypt(String input,int key){
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet= alphabet.substring(key) + alphabet.substring(0,key);
        for(int i=0;i<encrypted.length();i++){
            char currChar= encrypted.charAt(i);
            int idx=alphabet.indexOf(currChar);
            if(idx != -1){
                char newChar = shiftedAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
    }
}
/* //Main Function 
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter key");
        int key=sc.nextInt();
//        char ch= sc.next().charAt(0);
        String message= s.nextLine();
        Encription e= new Encription();
        String encrypted= e.encrypt(message.toUpperCase(),key);
        System.out.println(encrypted);
    }
}

*/
