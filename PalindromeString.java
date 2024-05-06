public class PalindromeString {

    public Boolean stringBuilderWay(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        if(input.equals(stringBuilder.toString())){
            return true;
        }
        else
            return false;
    }

    public Boolean naiveWay(String input){
     //Initialize an empty string to store the reverse of the string
     String reverse = "";
     for(int i = input.length() - 1; i >= 0; i--){
         reverse = reverse + input.charAt(i);
     }

     if (input.equals(reverse)){
         return true;
     }
     else
         return false;

    }

    public static void main(String args[]){
        PalindromeString ps = new PalindromeString();
        boolean result1 = ps.stringBuilderWay("ptstp");
        boolean result2 = ps.naiveWay("abcbal");

        System.out.println(result1);
        System.out.println(result2);
    }
}
