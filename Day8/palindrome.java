package Day8;

public class palindrome {
    public static boolean PalindromeCheck(int s){

    String str = "A man, a plan, a canal: Panama";
    int n = str.length();

    int start = 0;
    int end = n-1;

    while(start<end){

        while(start<end && !Character.isLetterOrDigit(str.charAt(start))){
            start++;
        }

        while(start<end && !Character.isLetterOrDigit(str.charAt(end))){
            end--;

        }

        char charStart = Character.toLowerCase(str.charAt(start));
        char charEnd = Character.toLowerCase(str.charAt(end));

        if(charStart == charEnd){
            start++;
            end++;
        }
        else {
            return false;
        }
    }
    return true;
}
    
}
