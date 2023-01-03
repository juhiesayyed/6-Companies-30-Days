class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<Integer>();
         int num,a1,a2;
         String a;
         for(int i=0;i<tokens.length;i++)
         {
             a=tokens[i];
             if(a.equals("+")||a.equals("-")||a.equals("/")||a.equals("*"))
             {
                 if(a.equals("+"))
                 {
                   stack.push(((Integer) stack.pop())+((Integer) stack.pop()));
                 }
                 if(a.equals("-"))
                 {
                   a1=stack.pop();
                   a2=stack.pop();
                   stack.push(Integer.parseInt(String.valueOf((int)(a2-a1))));
                 }
                 if(a.equals("*"))
                 {
                   stack.push(((Integer) stack.pop())*((Integer) stack.pop()));
                 }
                 if(a.equals("/"))
                 {
                   a1=stack.pop();
                   a2=stack.pop();
                   stack.push(Integer.parseInt(String.valueOf((int)(a2/a1))));
                 }    
             }
             else{
                num=Integer.parseInt(tokens[i]);
                stack.push(num);
             }
         }
         return stack.pop();
    }
}
