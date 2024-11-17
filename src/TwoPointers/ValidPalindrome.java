package TwoPointers;

public class ValidPalindrome {

    public boolean isPal(String s) {
        s = s.toLowerCase();
        if(s.isEmpty() || s.length()==1) return true;
        int left = 0;
        int right = s.length()-1;
        while(left <= right) {
            char currentLeft = s.charAt(left);
            char currentRight = s.charAt(right);
            if(!Character.isLetterOrDigit(currentLeft)) left++;
            else if(!Character.isLetterOrDigit(currentRight)) right--;
            else {
                if(currentLeft != currentRight) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
