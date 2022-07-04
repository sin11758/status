/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;


/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail(String code)
{
    public String [] arr = new Statuses.values();
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println(arr[0]);
        break;
        case "ONE": System.out.println(arr[1]);
        break;
        case "TWO":
        System.out.println(arr[2]);
        break;
        case "THREE": 
            System.out.println(arr[3]);
        break;
        default:
         System.out.println(arr[4]);
        break;
        }
}
 
}

