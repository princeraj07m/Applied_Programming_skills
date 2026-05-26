class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '[' || ch =='{' || ch == '('){
                sc.push(ch);
            }
            else{
                if(sc.isEmpty())return false;
                char temp = sc.pop();
                
                if((ch == ']' && temp != '[' ) || (ch == '}' && temp != '{' ) || (ch == ')' && temp != '(')){
                    return false;
                }

            }
        }

        return sc.isEmpty();

    }
}
