/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamdaExample;

/**
 *
 * @author HP
 */
public class UseSmallestFactor {
    public static void main(String[] args) {
        SmallestFactor sf=(int f)->{
          int count=0,i;
          for(i=2;i<=f/2;i++)
          {
              if(f%i==0)
              {
                  count=i;
                  break;
              }
          }
          if(count==0)
          {
              //System.out.println("Smallest Factor is:"+f);
              return f;
          }
          else
          {
              //System.out.println("Smallest Factor is:"+count);
              return count;
          }
              
        };
        System.out.println("Smallest Factor is:"+sf.factor(9));
    }
    
}
