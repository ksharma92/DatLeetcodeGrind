public class StringCompression {
    public static String compressedString(String inputString) {
        int countConsecutive = 0;
        char prevChar = inputString.charAt(0);
        String buffString = "";
        for(int i=0; i < inputString.length(); i++) {
           countConsecutive++;
            if(i+1 >= inputString.length() || inputString.charAt(i+1) != inputString.charAt(i))
            {
                buffString += ""+inputString.charAt(i)+countConsecutive;
                countConsecutive = 0;
            }
        }
        return buffString.length()<inputString.length()? buffString: inputString;
    }
    public static void main(String[] args) {
        System.out.println(compressedString("aabcccccaaa"));
    }
}
