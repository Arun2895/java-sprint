// Palindrome check
class Strings{
    public static void main(String[] args) {
            StringBuilder s1 = new StringBuilder("racecar");
    int n = s1.length();
    StringBuilder s2 = new StringBuilder();
        
    for(int i=n-1;i>=0;i--){
        char s = s1.charAt(i);
        s2.append(s);
    }
    boolean flag = false;
    for(int j = 0;j<n;j++){
        if(s1.charAt(j) == s2.charAt(j)){
        System.out.println("Palindrome");
        flag = true;
        break;
        }
        else{
            System.out.println("Not a Palindrome");
            break;
        }
    }
    }
}
