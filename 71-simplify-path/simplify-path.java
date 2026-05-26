class Solution {
    public String simplifyPath(String path) {
        Stack<String> sc = new Stack<>();
        String []arr = path.split("/");

        for(String s : arr){
            if(s.equals(".") || s.equals("")){
                continue;
            }else if(s.equals("..")){
                if(!sc.isEmpty()){
                    sc.pop();
                }
            }else{
                sc.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s : sc){
            sb.append("/");
            sb.append(s);
        }
        return sb.length() == 0 ? "/" : sb.toString();
     }
}