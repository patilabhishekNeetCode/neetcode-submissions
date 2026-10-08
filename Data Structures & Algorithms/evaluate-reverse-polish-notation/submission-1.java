class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token : tokens){
            if(Objects.equals(token, "+") || Objects.equals(token, "-") || Objects.equals(token, "*") || Objects.equals(token, "/")){
                int firstNumber = Integer.parseInt(stack.pop());
                int secondNumber = Integer.parseInt(stack.pop());
                switch (token){
                    case "+" : stack.push(firstNumber + secondNumber+"");
                    break;

                    case "-" : stack.push(secondNumber - firstNumber+"");
                    break;

                    case "*" : stack.push(firstNumber * secondNumber+"");
                    break;

                    case "/" : stack.push(secondNumber / firstNumber+"");
                    break;
                }
            }
            else
                stack.push(token);
        }
        return Integer.parseInt(stack.pop());
    }
}