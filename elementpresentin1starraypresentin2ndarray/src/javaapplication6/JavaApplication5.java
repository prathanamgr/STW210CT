/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
 import java.util.*;
/**
 *
 * @author DELL
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

  
      
        
    int s1[] = { '1', '2', '3', '4' };
    int s2[] = { '2', '5', '3', '6' };
    Boolean ret = cmprStr( s1, s2 );
    System.out.println( ret );

  
    System.out.println("Hello world!");
  }
  public static Boolean cmprStr( int[] s1, int[] s2)
    {
        char subS2[] = new char[s1.length];
        int cnt = 0;
        Arrays.sort( s1 );
        Arrays.sort( s2 );
        for( int i = 0; i < s1.length; i++ )
        {
            for( int j = 0; j < s2.length; j++ )
            {
                if( s1[i] == s2[j] )
                {
                    subS2[cnt++] = s1[i];
                    s2[j] = ' ';
                    break;
                }
            }
        }
        if( Arrays.equals( s1, subS2 ) )
        {
            return true;
        }
        return false;
    }
}
    
    

