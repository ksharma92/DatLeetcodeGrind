public class StringRotation {
    public static boolean isSubstring(String string1, String string2) {
        String someVal = "";
        int separator = -1;
        if(string1.length()!= string2.length())
            return false;
        for(int i=0; i<string1.length(); i++) {
            someVal+=string2.charAt(i);
            if(string1.indexOf(someVal) == -1) {
                separator = someVal.length()-1;
                break;
            }
        }
        System.out.println(separator);
        return string1.substring(string1.length() - separator).equalsIgnoreCase(string2.substring(0, separator))
                && string1.substring(0, string1.length() - separator).equalsIgnoreCase(string2.substring(separator));
    }
    public static void main(String[] args) {
        System.out.println(isSubstring("waterbottle", "erbottlewat"));
    }
}
