/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcprobems;
import java.io.*;
/**
 *
 * @author Jose Enrique Camacho
 */
public class InsertionSort 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String[] firstLine = bf.readLine().split(" ");
        int[] A = new int[firstLine.length];
        for(int i=0; i<firstLine.length; i++)
        {
            A[i] = Integer.parseInt(firstLine[i]);
        }
        
        for(int j=1; j<firstLine.length; j++)
        {
            int key = A[j];
            int i = j-1;
            while(i>-1 && A[i]>key)
            {
                A[i+1] = A[i];
                i = i-1;
            }
            A[i+1] = key;
        }
        for(int e: A)
        {
            pw.print(e+" ");
            pw.flush();
        }
    }
}
