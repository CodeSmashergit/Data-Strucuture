/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.Stack;
public class EvaluateExp {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String exp=kb.next();
        System.out.println(evaluate(exp));
    }
    public static int evaluate(String exp)
    {
        char[] tokens=exp.toCharArray();
        Stack<Integer> values=new Stack<Integer>();
        Stack<Character> ops=new Stack<Character>();
        for(int i=0;i<tokens.length;i++)
        {
            
            if (tokens[i]==' ')
            {
                continue;
            }
            if(tokens[i]>='0'&&tokens[i]<='9')
            {
                StringBuffer sb=new StringBuffer();
                while(i<tokens.length&&tokens[i]>='0'&&tokens[i]<='9')
                {
                    sb.append(tokens[i++]);
                }
                values.push(Integer.parseInt(sb.toString()));
                
                i--;
            }
            else if(tokens[i]=='(')
            {
                
                ops.push(tokens[i]);
                
            }
            else if (tokens[i] == ')') 
            { 
                while (ops.peek() != '(') 
                {
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    
                }
                ops.pop(); 
                
            } 
              else if (tokens[i] == '+' || tokens[i] == '-' || 
                     tokens[i] == '*' || tokens[i] == '/') 
            { 
                
                // While top of 'ops' has same or greater precedence to current 
                // token, which is an operator. Apply operator on top of 'ops' 
                // to top two elements in values stack 
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
                  values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
  
                // Push current token to 'ops'. 
                ops.push(tokens[i]); 
                
            } 
        }
        while(!ops.empty())
        {
            values.push(applyOp(ops.pop(),values.pop(),values.pop()));
        }
        return values.pop();
    }
    public static boolean hasPrecedence(char op1,char op2)
    {
        if(op2=='('||op2==')')
        {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
            return false; 
        else
            return true; 
    }
    public static int applyOp(char op,int b,int a)
    {
        switch(op)
        {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
               if (b == 0) 
                throw new UnsupportedOperationException("Cannot divide by zero");
               return a/b;
        }
        return 0;
    }
    
    }
