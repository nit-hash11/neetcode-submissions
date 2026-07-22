class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int x, y;
        for(String s : tokens){
            if(s.equals("+"))
                st.push(st.pop() + st.pop());
            else if(s.equals("-")){
                x = st.pop();
                y = st.pop();
                st.push(y-x);
            } else if(s.equals("*"))
                st.push(st.pop() * st.pop());
            else if(s.equals("/")){
                x = st.pop();
                y = st.pop();
                st.push(y/x);
            } else 
                st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
}
