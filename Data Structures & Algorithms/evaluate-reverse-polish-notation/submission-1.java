class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.matches("-?\\d+(\\.\\d+)?")){
                st.push(Integer.parseInt(s));   
            }
            else {
                int x = 0;
                char ch = s.charAt(0);
                switch(ch){
                    case '+': x = st.pop() + st.pop();
                    break;
                    case '-': x = st.pop();
                    x = st.pop() - x;
                    break;
                    case '*': x = st.pop() * st.pop();
                    break;
                    case '/': x = st.pop();
                    x = st.pop()/x;
                    break;
                }
                st.push(x);
            }
        }
        return st.peek();
    }
}
