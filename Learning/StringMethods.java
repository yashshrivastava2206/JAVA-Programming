public class StringsMethods {
    public static void main(String[] args) {
        String name = "Yash Shrivastava";

        int len = name.length();
        System.out.println(len);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

//        String trimedString = name.trim();
//        System.out.println(trimedString);

         String Sname = name.substring(5);
        System.out.println(Sname);

        String Lname = name.substring(3,9);
        System.out.println(Lname);

        System.out.println(name.replace('s','a'));
        System.out.println(name.replace("Yash","Nishu"));

        System.out.println(name.startsWith("Ya"));
        System.out.println(name.startsWith("N"));

        System.out.println(name.endsWith("tava"));
        System.out.println(name.endsWith("Y"));

        System.out.println(name.charAt(8));

        System.out.println(name.indexOf("s"));

        System.out.println(name.indexOf("s",3));

        System.out.println(name.equals("Yash Shrivastava"));
        System.out.println(name.equals("yash shrivastava"));
        System.out.println(name.equalsIgnoreCase("yasH sHrivAstavA"));


    }
}
